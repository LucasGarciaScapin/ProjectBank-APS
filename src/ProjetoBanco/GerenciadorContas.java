package ProjetoBanco;

import java.util.ArrayList;

/**
 * @author Lucas Garcia
 */

public class GerenciadorContas {

    ArrayList<Conta> list;

    public GerenciadorContas(){
        list = new ArrayList<>();
    }

    public void adicionarConta(Conta c){
        list.add(c);
    }

    public void removerConta(int numeroConta) {
        for (Conta c : list) {
            if (c.getNumeroConta() == numeroConta) {
                list.remove(c);
            }
        }
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

    public boolean transferirValor(int numeroContaOrigem, int numeroContaDestino, double valor){

        Conta contaOrigem = null;
        Conta contaDestino = null;

        for (Conta c : list) {
            if(c.getNumeroConta() == numeroContaOrigem){
                contaOrigem = c;
            }
            if(c.getNumeroConta() == numeroContaDestino){
                contaDestino = c;
            }
        }
        if(contaOrigem != null && contaDestino != null){
            contaOrigem.sacar(valor);
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }


    public boolean sacar(int numeroConta, double valorSacado){
        for (Conta c : list) {
            if(c.getNumeroConta() == numeroConta){
                if(c.sacar(valorSacado)){
                    c.sacar(valorSacado);
                    return true;
                }
            }
        }return false;
    }

    public boolean depositar(int numeroConta, double valorDeposito){
        for (Conta c : list) {
            if(c.getNumeroConta() == numeroConta){
                c.depositar(valorDeposito);
                return true;
            }
        }return false;
    }


    public String listarContas(){
        String listagem = "";
        for (Conta c : list) {
            listagem += c + "\n";
        }
        return listagem;
    }
}
