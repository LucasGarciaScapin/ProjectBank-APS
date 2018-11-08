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
public class ContaEspecial extends ContaCorrente {

    private String nomeGerente;

    public ContaEspecial(String cpf, String nomeCliente, int numeroConta, double saldo, String nomeGerente) {
        super(cpf, nomeCliente, numeroConta, saldo);
        this.nomeGerente = nomeGerente;
    }

    public ContaEspecial(String cpf, String nomeCliente, int numeroConta, double saldo, int limite, String nomeGerente) {
        super(cpf, nomeCliente, numeroConta, saldo, limite);
        this.nomeGerente = nomeGerente;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGerente responsavel: " + nomeGerente;
    }
}
