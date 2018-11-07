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

    public ContaEspecial(String cpf, String nomeCliente, int numeroConta, int saldo) {
        super(cpf, nomeCliente, numeroConta, saldo);
    }

    public ContaEspecial(String cpf, String nomeCliente, int numeroConta, int saldo, int limite) {
        super(cpf, nomeCliente, numeroConta, saldo, limite);
    }
}
