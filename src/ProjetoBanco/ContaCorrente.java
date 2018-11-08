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
public class ContaCorrente extends Conta {

    private int limite;

    //Construtor da ContaCorrente sem limite
    public ContaCorrente(String cpf, String nomeCliente, int numeroConta, double saldo) {
        super(cpf, nomeCliente, numeroConta, saldo);
    }

    //Construtor da ContaCorrente com limite
    public ContaCorrente(String cpf, String nomeCliente, int numeroConta, double saldo, int limite) {
        super(cpf, nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }
    
    public boolean usandoLimite(){
        return limite > 0 && getSaldo() < 0;
    }


    //TODO Falta finalizar essa logica de sacar
    @Override
    public boolean sacar(double valorSacado) {
        super.sacar(valorSacado);
        return true;
        }

    @Override
    public String toString(){
        return super.toString() + "\nLimite: " + limite;
    }
}