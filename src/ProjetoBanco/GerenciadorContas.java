package ProjetoBanco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author Lucas Garcia
 */

public class GerenciadorContas {

    private ArrayList<Conta> list;

    // Esse get existe para realizar testes unitarios
    public ArrayList<Conta> getList() {
        return list;
    }

    public GerenciadorContas(){
        list = new ArrayList<>();
    }

    public void adicionarConta(Conta c){
        list.add(c);
    }

    public boolean removerConta(int numeroConta) {
        return list.removeIf(conta -> conta.getNumeroConta() == numeroConta);
    }

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

    public Conta buscarConta(int numeroConta){
        for (Conta c : list) {
            if(c.getNumeroConta() == numeroConta){
                return c;
            }
        } return null;
    }

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

    public boolean sacar(int numeroConta, double valorSacado){
        for (Conta c : list) {
            if(c.getNumeroConta() == numeroConta){
                return c.sacar(valorSacado);
                }
            }return false;
    }

    public boolean depositar(int numeroConta, double valorDeposito){
        for (Conta c : list) {
            if(c.getNumeroConta() == numeroConta){
                return c.depositar(valorDeposito);
            }
        }return false;
    }


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
