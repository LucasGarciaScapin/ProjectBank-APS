/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoBanco;

/**
 * @author Lucas Garcia
 * @author Lennox
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca (String cpf, String nomeCliente, int numeroConta, int saldo){
        super(cpf, nomeCliente, numeroConta, saldo);
    }
    
    
    public void calculaRendimento (int porcentagemRendimento){
    //Estudando ainda como fazer o calculo
    //Em duvida, to consultando aqui: https://blog.rico.com.vc/rendimento-da-poupanca
    
    }
}
