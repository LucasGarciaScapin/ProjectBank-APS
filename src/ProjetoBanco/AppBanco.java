/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoBanco;

import java.util.*;

/**
 * @author Jair Gudaites Junior - 21134258
 * @author Lucas Garcia - 21128904
 * @author Júlio "Lennox" Vinícius - 21085239
 * @author Matheus Oliveira - 21073117
 */
public class AppBanco {

    public static void main(String[] args) {
        GerenciadorContas gerenciadorContas = new GerenciadorContas();
        Random r = new Random();

        String cpf;
        String nomeCliente;
        int numeroConta;
        double saldo;
        int limite;
        String nomeGerente;
        int numeroContaOrigem;
        int numeroContaDestino;
        double valor;
        int random = r.nextInt(2);

        int opcao;
        int opcao2;

        Scanner in = new Scanner(System.in);
        System.out.println("\t\tAPLICATIVO BANCARIO\n");
        do {
            System.out.println("\nMenu:\n"
            +"1 - Adicionar Conta\n"
            +"2 - Remover Conta\n"
            +"3 - Buscar Contas Especias\n"
            +"4 - Busca de Cliente por Limite de Crédito\n"
            +"5 - Buscar Conta por Número\n"
            +"6 - Transferência\n"
            +"7 - Sacar\n"
            +"8 - Depositar\n"
            +"9 - Listar Contas Cadastradas\n"
            +"10 - Sair\n");

            System.out.printf("Digite a opção desejada: ");
            opcao = in.nextInt();
            in.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Tipos de Conta:");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Poupança");
                    System.out.println("3 - Especial\n");
                    System.out.printf("Digite a opção desejada: ");
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
                            System.out.printf("Saldo: ");
                            saldo = in.nextDouble();
                            in.nextLine();

                            if (random == 1) {
                                limite = 1000;
                                System.out.println("Realizamos uma consulta pelo seu CPF e liberamos R$" + limite + " de limite.");
                                gerenciadorContas.adicionarConta(new ContaCorrente(cpf, nomeCliente, numeroConta, saldo, limite));
                            } else {
                                System.out.println("Sua Conta foi criada porem no momento nao podemos liberar limite a sua conta.");
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

                            System.out.print("Nome Gerente: ");
                            nomeGerente = in.nextLine();
                            if (random == 1) {
                                limite = 1000;
                                System.out.println("Conta Criada! Realizamos uma consulta pelo seu CPF e liberamos R$" + limite + " de limite.");
                                gerenciadorContas.adicionarConta(new ContaEspecial(cpf,nomeCliente,numeroConta,saldo,limite,nomeGerente));
                            }else {
                                System.out.println("Sua Conta foi criada porem no momento nao podemos liberar limite a sua conta.\n Favor entrar em contato com "
                                        + nomeGerente + " para mais informacoes.");
                                gerenciadorContas.adicionarConta(new ContaEspecial(cpf,nomeCliente,numeroConta,saldo,nomeGerente));
                            }
                            break;
                        default:
                            System.out.println("Opção Inválida");
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Insira o número da conta a ser excluida: ");
                    numeroConta = in.nextInt();
                        if (gerenciadorContas.removerConta(numeroConta)){
                            System.out.println("Conta Removida\n");
                        } else {
                            System.out.println("Conta não encontrada\n");
                        }
                    break;
                case 3:
                    System.out.println("Contas Especiais Encontradas\n");
                    if (gerenciadorContas.buscarContasEpeciais()==""){
                        System.out.println("Nenhuma Conta Especial Encontrada\n");
                    } else {
                        System.out.println(gerenciadorContas.buscarContasEpeciais()+"\n");
                        }
                    break;
                case 4:
                    System.out.println("Clientes Encontrados\n");
                    if (gerenciadorContas.buscarClientesUsandoLimite()==""){
                        System.out.println("Nenhum Cliente Encontrado\n");
                    } else{
                        System.out.println(gerenciadorContas.buscarClientesUsandoLimite()+"\n");
                    }
                    break;
                case 5:
                    System.out.printf("Insira o número da conta: ");
                    numeroConta = in.nextInt();
                    System.out.println(gerenciadorContas.buscarConta(numeroConta)+"\n");
                    break;
                case 6:
                    System.out.printf("Insira a conta de Origem: ");
                    numeroContaOrigem = in.nextInt();
                    System.out.printf("Insira a conta de Destino: ");
                    numeroContaDestino = in.nextInt();
                    System.out.printf("Insira o Valor: ");
                    valor = in.nextDouble();
                    if (gerenciadorContas.transferirValor(numeroContaOrigem,numeroContaDestino,valor)){
                        System.out.printf("Transferência Realizada com Sucesso\n");
                    } else {
                        System.out.printf("Transferência não Realizada\n");
                    }
                    break;
                case 7:
                    System.out.printf("Insira Número da Conta: ");
                    numeroConta = in.nextInt();
                    System.out.printf("Insira o Valor: ");
                    valor = in.nextDouble();
                    if (gerenciadorContas.sacar(numeroConta,valor)){
                        System.out.println("Saque Realizado com Sucesso\n");
                    } else {
                        System.out.println("Saque não Realizado\n");
                    }
                    break;
                case 8:
                    System.out.printf("Insira Número da Conta: ");
                    numeroConta = in.nextInt();
                    System.out.printf("Insira o Valor: ");
                    valor = in.nextDouble();
                    if (gerenciadorContas.depositar(numeroConta,valor)){
                        System.out.println("Depósito Realizado com Sucesso\n");
                    } else {
                        System.out.println("Depósito não Realizado\n");
                    }
                    break;
                case 9:
                    System.out.println("Contas Cadastradas: ");
                    System.out.println(gerenciadorContas.listarContas());
                    break;
                case 10:
                    System.out.println("Programa Finalizado");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while (opcao!=10);
    }
}