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
public class ContaCorrente extends Conta {
    private int limite;
    
    //Construtor da ContaCorrente sem limite
    public ContaCorrente(String cpf, String nomeCliente, int numeroConta, int saldo) {
        super(cpf, nomeCliente, numeroConta, saldo);
    }
        
    //Construtor da ContaCorrente com limite
    public ContaCorrente(String cpf, String nomeCliente, int numeroConta, int saldo, int limite) {
        super(cpf, nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }
    
    //Método pra ver se a conta tem limite
    public boolean usandoLimite(){
        if(limite != 0){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public boolean sacar(int valorSacado){
        if(valorSacado < limite){
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()
            + "Limite: " + limite;
    }
}