package ProjetoBanco;

/**
 *    Projeto APS - APLICATIVO BANCÁRIO
 *              Grupo JJLM
 * @author Jair Gudaites Junior - 21134258
 * @author Júlio Vinícius - 21085239
 * @author Lucas Garcia Scapin - 21128904
 * @author Matheus Oliveira - 21073117
 * Classe Especial que herda de ContaCorrente
 */

public class ContaEspecial extends ContaCorrente {

    private String nomeGerente;

    /**
     * Construtor sem a utilização do limite
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
     * Construtor com a utilização do limite
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
     * Método get do nomeGerente
     * @return String
     */
    public String getNomeGerente() {
        return nomeGerente;
    }

    /**
     * Método set do nomeGerente
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
        return super.toString() + "\nGerente responsável: " + nomeGerente;
    }
}
