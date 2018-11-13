/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoBanco;

/**
 * @author Lucas Garcia
 * @author Júlio "Lennox" Vinícius
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca (String cpf, String nomeCliente, int numeroConta, double saldo){
        super(cpf, nomeCliente, numeroConta, saldo);
    }

    //TODO Revisar se essa eh a logica.
    public void calculaRendimento (int porcentagemRendimento){
        System.out.println((getSaldo() * (porcentagemRendimento/100)));
    }
}
