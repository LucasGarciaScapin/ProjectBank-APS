package ProjetoBanco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Classe utilizada para gerenciar contas
 * @author Jair Gudaites Junior - 21134258
 * @author Lucas Garcia Scapin - 21128904
 * @author Júlio Vinícius - 21085239
 * @author Matheus Oliveira - 21073117
 */

public class GerenciadorContas {

    private ArrayList<Conta> list;

    /**
     * Construtor default
     */
    public GerenciadorContas(){
        list = new ArrayList<>();
    }

    /**
     * Metodo get da lista para execucao de testes unitarios
     * @return ArrayList<Conta>
     */
    public ArrayList<Conta> getList() {
        return list;
    }

    /**
     * Adiciona uma conta na lista do tipo ArrayList
     * @param c objeto de Conta
     */
    public void adicionarConta(Conta c){
        list.add(c);
    }

    /**
     * Remove Conta da lista apartir do numero da mesma
     * @param numeroConta int
     * @return boolean
     */
    public boolean removerConta(int numeroConta) {
        return list.removeIf(conta -> conta.getNumeroConta() == numeroConta);
    }

    /**
     * Busca apenas as contas que sao do tipo Especial
     * @return String
     */
    public String buscarContasEpeciais(){
        StringBuilder sb = new StringBuilder();
        for (Conta c : list) {
           if(c instanceof ContaEspecial){
                sb.append(c)
                        .append("\n")
                        .append("\n");
            }
        }return sb.toString();
    }

    /**
     * Busca apenas os clientes que estao utilizando o limite
     * @return String
     */
        public String buscarClientesUsandoLimite(){
        StringBuilder sb = new StringBuilder();
        for (Conta c : list) {
            if(c instanceof ContaCorrente){
                if(((ContaCorrente) c).usandoLimite()){
                    sb.append(c)
                            .append("\n")
                            .append("\n");
                }
            }
        }return sb.toString();
    }

    /**
     * Busca na lista a conta pelo numero da conta
     * @param numeroConta int
     * @return Objeto Conta
     */
    public Conta buscarConta(int numeroConta){
        for (Conta c : list) {
            if(c.getNumeroConta() == numeroConta){
                return c;
            }
        } return null;
    }

    /**
     * Realiza uma tranferencia de valores entre contas
     * @param numeroContaOrigem int
     * @param numeroContaDestino int
     * @param valor double
     * @return boolean
     */
    public boolean transferirValor(int numeroContaOrigem, int numeroContaDestino, double valor) {

        Conta contaOrigem = null;
        Conta contaDestino = null;

        for (Conta c : list) {
            if (c.getNumeroConta() == numeroContaOrigem) {
                contaOrigem = c;
            }
            if (c.getNumeroConta() == numeroContaDestino) {
                contaDestino = c;
            }
        }
        if (contaOrigem != null && contaDestino != null  && contaOrigem.getSaldo() > valor) {
            return contaDestino.depositar(valor) && contaOrigem.sacar(valor);
            }
            return false;
        }

    /**
     * Realiza um saque de onde que corresponde ao numero da conta
     * @param numeroConta int
     * @param valorSacado double
     * @return boolean
     */
    public boolean sacar(int numeroConta, double valorSacado){
        for (Conta c : list) {
            if(c.getNumeroConta() == numeroConta){
                return c.sacar(valorSacado);
                }
            }return false;
    }

    /**
     * Realiza um deposito de onde que corresponde ao numero da conta
     * @param numeroConta int
     * @param valorDeposito double
     * @return boolean
     */
    public boolean depositar(int numeroConta, double valorDeposito){
        for (Conta c : list) {
            if(c.getNumeroConta() == numeroConta){
                return c.depositar(valorDeposito);
            }
        }return false;
    }

    /**
     * Faz a listagem de todas as contas adicionadas na lista
     * @return String
     */
    public String listarContas(){
        StringBuilder sb = new StringBuilder();
        for (Conta c : list) {
            sb.append("\n")
                    .append(c)
                    .append("\n");
        }
        return sb.toString();
    }
}
