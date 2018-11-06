/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbanco;

/**
 *
 * @author Lennox
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca (String CPF, String NomeCliente, String NumeroConta, int Saldo){
        super(CPF, NomeCliente, NumeroConta, Saldo);
    }
    
    
    public void calculaRendimento (int porcentagemRendimento){
    //Estudando ainda como fazer o calculo
    //Em duvida, to consultando aqui: https://blog.rico.com.vc/rendimento-da-poupanca
    
    }
}
