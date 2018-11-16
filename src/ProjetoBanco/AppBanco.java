package ProjetoBanco;

import java.util.*;

/**
 *    Projeto APS - APLICATIVO BANCÁRIO
 *              Grupo JJLM
 * @author Jair Gudaites Junior - 21134258
 * @author Júlio Vinícius - 21085239
 * @author Lucas Garcia Scapin - 21128904
 * @author Matheus Oliveira - 21073117
 */

public class AppBanco {

    public static void main(String[] args) {
        GerenciadorContas gerenciadorContas = new GerenciadorContas();
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        String nomeCliente;
        String nomeGerente;
        String cpf;
        double saldo;
        double valor;
        double limite;
        int numeroConta;
        int numeroContaOrigem;
        int numeroContaDestino;
        int random = r.nextInt(8);
        int opcao;
        int opcao2;

        System.out.println("\t\tAPLICATIVO BANCÁRIO");
        do {
            System.out.println("\nMenu:\n"
            +" 1) Adicionar Conta\n"
            +" 2) Remover Conta\n"
            +" 3) Buscar Contas Especias\n"
            +" 4) Busca de Cliente Utilizando Limite de Crédito\n"
            +" 5) Buscar Conta por Número\n"
            +" 6) Transferência\n"
            +" 7) Sacar\n"
            +" 8) Depositar\n"
            +" 9) Listar Contas Cadastradas\n"
            +"10) Calcular Lucro de sua Conta Poupança\n"
            +" 0) Sair\n");

            System.out.print("Digite a opção desejada: ");
            opcao = in.nextInt();
            in.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Tipos de Conta:");
                    System.out.println("1) Conta Corrente");
                    System.out.println("2) Poupança");
                    System.out.println("3) Especial\n");
                    System.out.print("Digite a opção desejada: ");
                    opcao2 = in.nextInt();
                    in.nextLine();
                    switch (opcao2) {
                        case 1:
                            System.out.println("Insira os seguintes dados:");
                            System.out.print("CPF: ");
                            cpf = in.nextLine();
                            System.out.print("Nome: ");
                            nomeCliente = in.nextLine();
                            System.out.print("Conta: ");
                            numeroConta = in.nextInt();
                            in.nextLine();
                            System.out.print("Saldo: ");
                            saldo = in.nextDouble();
                            in.nextLine();

                            if (random != 1) {
                                limite = 1000;
                                System.out.println("Realizamos uma consulta pelo seu CPF e liberamos R$:" + limite + " de limite.");
                                gerenciadorContas.adicionarConta(new ContaCorrente(cpf, nomeCliente, numeroConta, saldo, limite));
                            } else {
                                System.out.println("Sua conta foi criada, porém no momento não podemos liberar o limite da sua conta.");
                                gerenciadorContas.adicionarConta(new ContaCorrente(cpf, nomeCliente, numeroConta, saldo));
                            }
                            break;
                        case 2:
                            System.out.println("Insira os seguintes dados:");
                            System.out.print("CPF: ");
                            cpf = in.nextLine();
                            System.out.print("Nome: ");
                            nomeCliente = in.nextLine();
                            System.out.print("Conta: ");
                            numeroConta = in.nextInt();
                            in.nextLine();
                            System.out.print("Saldo: ");
                            saldo = in.nextDouble();
                            in.nextLine();
                            gerenciadorContas.adicionarConta(new ContaPoupanca(cpf, nomeCliente, numeroConta, saldo));
                            System.out.println("Conta criada com sucesso!\n");
                            break;

                        case 3:
                            System.out.println("Insira os seguintes dados:");
                            System.out.print("CPF: ");
                            cpf = in.nextLine();
                            System.out.print("Nome: ");
                            nomeCliente = in.nextLine();
                            System.out.print("Conta: ");
                            numeroConta = in.nextInt();
                            in.nextLine();
                            System.out.print("Saldo: ");
                            saldo = in.nextDouble();
                            in.nextLine();

                            System.out.print("Nome do gerente: ");
                            nomeGerente = in.nextLine();
                            if (random != 1) {
                                limite = 1000.00;
                                System.out.println("Conta criada! Realizamos uma consulta pelo seu CPF e liberamos R$:" + limite + " de limite.");
                                gerenciadorContas.adicionarConta(new ContaEspecial(cpf, nomeCliente, numeroConta, saldo, limite, nomeGerente));
                            } else {
                                System.out.printf("\nSua conta foi criada, porém no momento não podemos liberar o limite da sua conta.\n " +
                                        "Favor entrar em contato com %s para mais informações.\n", nomeGerente);
                                gerenciadorContas.adicionarConta(new ContaEspecial(cpf, nomeCliente, numeroConta, saldo, nomeGerente));
                            }
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Insira o número da conta a ser excluida: ");
                    numeroConta = in.nextInt();
                        if (gerenciadorContas.removerConta(numeroConta)){
                            System.out.println("Conta removida.\n");
                        } else {
                            System.out.println("Conta não encontrada.\n");
                        }
                    break;
                case 3:
                    System.out.println("\nContas especiais encontradas:\n");
                    if (gerenciadorContas.buscarContasEpeciais().equals("")){
                        System.out.println("Nenhuma conta especial encontrada.\n");
                    } else {
                        System.out.println(gerenciadorContas.buscarContasEpeciais()+"\n");
                        }
                    break;
                case 4:
                    System.out.println("\nClientes encontrados:\n");
                    if (gerenciadorContas.buscarClientesUsandoLimite().equals("")){
                        System.out.println("Nenhum cliente utilizando limite.\n");
                    } else{
                        System.out.println(gerenciadorContas.buscarClientesUsandoLimite()+"\n");
                    }
                    break;
                case 5:
                    System.out.print("Insira o número da conta: ");
                    numeroConta = in.nextInt();
                    System.out.println("\n" + gerenciadorContas.buscarConta(numeroConta) + "\n");
                    break;
                case 6:
                    System.out.print("Insira a conta de origem: ");
                    numeroContaOrigem = in.nextInt();
                    System.out.print("Insira a conta de destino: ");
                    numeroContaDestino = in.nextInt();
                    System.out.print("Insira o valor: ");
                    valor = in.nextDouble();
                    if (gerenciadorContas.transferirValor(numeroContaOrigem,numeroContaDestino,valor)){
                        System.out.print("Transferência realizada com sucesso.\n");
                    } else {
                        System.out.print("Não foi possivel realizar transferência.\n");
                    }
                    break;
                case 7:
                    System.out.print("Insira número da conta: ");
                    numeroConta = in.nextInt();
                    System.out.print("Insira o valor: ");
                    valor = in.nextDouble();
                    if (gerenciadorContas.sacar(numeroConta,valor)){
                        System.out.println("Saque realizado com sucesso.\n");
                    } else {
                        System.out.println("Saque não foi realizado.\n");
                    }
                    break;
                case 8:
                    System.out.print("Insira número da conta: ");
                    numeroConta = in.nextInt();
                    System.out.print("Insira o valor: ");
                    valor = in.nextDouble();
                    if (gerenciadorContas.depositar(numeroConta,valor)){
                        System.out.println("Depósito realizado com sucesso.\n");
                    } else {
                        System.out.println("Erro ao realizar depósito.\n");
                    }
                    break;
                case 9:
                    System.out.println("Contas Cadastradas: ");
                    System.out.println(gerenciadorContas.listarContas());
                    break;
                case 10:
                    System.out.print("Digite o numero de sua conta: ");
                    Conta c = gerenciadorContas.buscarConta(in.nextInt());
                    if(c instanceof ContaPoupanca){
                        ((ContaPoupanca) c).calculaRendimento(0.5);
                        System.out.println("Seu novo saldo é de: " + c.getSaldo());
                    }
                    else{
                        System.out.println("Sua conta não é poupança, portanto ela não tem rendimento de investimento.");
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado.");
                    break;
                default:
                    System.out.println("Opção Inválida.");
                    break;
            }
        }while (opcao!=0);
    }
}