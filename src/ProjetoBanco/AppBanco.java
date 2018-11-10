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
 * @author Matheus Oliveira - 21
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

        int opcao;
        int opcao2;

        Scanner in = new Scanner(System.in);
        System.out.println("\t\tAPLICATIVO BANCARIO\n");
        do {
            System.out.println("Menu:\n"
            +"1 - Adicionar Conta\n"
            +"2 - Remover Conta\n"
            +"3 - Buscar Contas Especias\n"
            +"4 - Busca de Cliente por Limite de Crédito\n"
            +"5 - Buscar Conta por Número\n"
            +"6 - Transferência\n"
            +"7 - Depósito\n"
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
                            System.out.println("CPF: ");
                            cpf = in.nextLine();
                            System.out.printf("Nome: ");
                            nomeCliente = in.nextLine();
                            System.out.println("Conta: ");
                            numeroConta = in.nextInt();
                            in.nextLine();
                            System.out.println("Saldo: ");
                            saldo = in.nextDouble();
                            in.nextLine();
                            System.out.println("Possui limite(s/n)?");
                            int random = r.nextInt(2);
                            if (random == 1) {
                                limite = 1000;
                                gerenciadorContas.adicionarConta(new ContaCorrente(cpf, nomeCliente, numeroConta, saldo, limite));
                            } else {
                                gerenciadorContas.adicionarConta(new ContaCorrente(cpf, nomeCliente, numeroConta, saldo));
                            }
                            break;
                        case 2:
                            System.out.println("Insira os seguintes dados:");
                            System.out.println("CPF: ");
                            cpf = in.nextLine();
                            System.out.printf("Nome: ");
                            nomeCliente = in.nextLine();
                            System.out.println("Conta: ");
                            numeroConta = in.nextInt();
                            in.nextLine();
                            System.out.println("Saldo: ");
                            saldo = in.nextDouble();
                            in.nextLine();
                            gerenciadorContas.adicionarConta(new ContaPoupanca(cpf, nomeCliente, numeroConta, saldo));
                            break;

                        case 3:
                            System.out.println("Insira os seguintes dados:");
                            System.out.println("CPF: ");
                            cpf = in.nextLine();
                            System.out.printf("Nome: ");
                            nomeCliente = in.nextLine();
                            System.out.println("Conta: ");
                            numeroConta = in.nextInt();
                            in.nextLine();
                            System.out.println("Saldo: ");
                            saldo = in.nextDouble();
                            in.nextLine();
                            limite = 1000;
                            System.out.println("Nome Gerente");
                            nomeGerente = in.nextLine();
                            gerenciadorContas.adicionarConta(new ContaEspecial(cpf,nomeCliente,numeroConta,saldo,limite,nomeGerente));
                            break;
                    }
            }

        }while (opcao==10);

    }
    
}