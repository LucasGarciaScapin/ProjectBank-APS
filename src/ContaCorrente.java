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
public class ContaCorrente extends Conta {
    private int Limite;
    
    //Construtor da ContaCorrente sem limite
    public ContaCorrente(String CPF, String NomeCliente, String NumeroConta, int Saldo) {
        super(CPF, NomeCliente, NumeroConta, Saldo);
    }
        
    //Construtor da ContaCorrente com limite
    public ContaCorrente(String CPF, String NomeCliente, String NumeroConta, int Saldo, int Limite) {
        super(CPF, NomeCliente, NumeroConta, Saldo);
        this.Limite = Limite;
    }
    
    //Método pra ver se a conta tem limite
    public boolean usandoLimite(){
        if(Limite != 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean sacar(int valorSacado){
        if(valorSacado < Limite){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()
            + "Limite: " + Limite;
    }
}