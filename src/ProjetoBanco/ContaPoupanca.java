/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoBanco;

/**
 * @author Lucas Garcia
 * @author Júlio "Lennox" Vinícius
 * @author Matheus Oliveira
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca (String cpf, String nomeCliente, int numeroConta, double saldo){
        super(cpf, nomeCliente, numeroConta, saldo);
    }

    //double para testar...
    public double calculaRendimento (int porcentagemRendimento){
        double valorRendimento = super.getSaldo() * porcentagemRendimento/100;
        super.depositar(valorRendimento);
        return super.getSaldo();
    }
}
