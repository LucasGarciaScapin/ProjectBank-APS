/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoBanco;

/**
 * Classe Especial que herda de ContaCorrente
 * @author Lucas Garcia Scapin
 * @author Júlio "Lennox" Vinícius
 */
public class ContaEspecial extends ContaCorrente {

    private String nomeGerente;

    /**
     * Construtor sem a utilizacao do limite
     * @param cpf String
     * @param nomeCliente String
     * @param numeroConta int
     * @param saldo double
     * @param nomeGerente String
     */
    public ContaEspecial(String cpf, String nomeCliente, int numeroConta, double saldo, String nomeGerente) {
        super(cpf, nomeCliente, numeroConta, saldo);
        this.nomeGerente = nomeGerente;
    }

    /**
     * Construtor com a utilizacao do limite
     * @param cpf String
     * @param nomeCliente String
     * @param numeroConta int
     * @param saldo double
     * @param limite double
     * @param nomeGerente String
     */
    public ContaEspecial(String cpf, String nomeCliente, int numeroConta, double saldo, double limite, String nomeGerente) {
        super(cpf, nomeCliente, numeroConta, saldo, limite);
        this.nomeGerente = nomeGerente;
    }

    /**
     * Metodo get do nomeGerente
     * @return String
     */
    public String getNomeGerente() {
        return nomeGerente;
    }

    /**
     * Metodo set do nomeGerente
     * @param nomeGerente String
     */
    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    /**
     * Reescrita do toString() implementando nomeGerente
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\nGerente responsavel: " + nomeGerente;
    }
}
