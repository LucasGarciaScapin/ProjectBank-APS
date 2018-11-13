package ProjetoBanco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**@author Junior Gudaites
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
        String contasEspeciais = "";
        for (Conta c : list) {
           if(c instanceof ContaEspecial){
                contasEspeciais += c + "\n";
            }
        }return contasEspeciais;
    }


        public String buscarClientesUsandoLimite(){
        String limite = "";
        for (Conta c : list) {
            if(c instanceof ContaCorrente){
                if(((ContaCorrente) c).usandoLimite()){
                    limite += c + "\n";
                }
            }
        }return limite;
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
        if (contaOrigem != null && contaDestino != null && contaOrigem.getSaldo() > valor) {
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
        String listagem = "";
        for (Conta c : list) {
            listagem += "\n" + c + "\n";
        }
        return listagem;
    }
}
