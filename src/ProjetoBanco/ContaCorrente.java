/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoBanco;

/**
 * Classe ContaCorrente que herda de Conta
 * @author Jair Gudaites Junior - 21134258
 * @author Lucas Garcia Scapin - 21128904
 * @author Júlio Vinícius - 21085239
 * @author Matheus Oliveira - 21073117
 */

public class ContaCorrente extends Conta {

    private double limite;

    /**
     * Construtor sem a utilizacao de limite
     * @param cpf String
     * @param nomeCliente String
     * @param numeroConta int
     * @param saldo double
     */
    public ContaCorrente(String cpf, String nomeCliente, int numeroConta, double saldo) {
        super(cpf, nomeCliente, numeroConta, saldo);
    }

    /**
     * Contrutor com a utilizacao de limite
     * @param cpf String
     * @param nomeCliente String
     * @param numeroConta int
     * @param saldo double
     * @param limite double
     */
    public ContaCorrente(String cpf, String nomeCliente, int numeroConta, double saldo, double limite) {
        super(cpf, nomeCliente, numeroConta, saldo);
        this.limite = limite;
    }

    /**
     * Metodo de verificacao se o cliente esta utilizando o limite
     * @return boolean
     */
    public boolean usandoLimite(){
        return limite > 0 && getSaldo() < 0;
    }

    /**
     * Reescrita do metodo sacar com verificacao/utilizacao do limite
     * @param valorSaca double
     * @return boolean
     */
    @Override
    public boolean sacar(double valorSaca){
        if(valorSaca <= (super.getSaldo() + limite)){
            super.sacar(valorSaca);
            return true;
        }
        return false;
    }

    /**
     * Reescrita do toString() implementando limite
     * @return String
     */
    @Override
    public String toString(){
        return super.toString() + "\nLimite: " + limite;
    }
}