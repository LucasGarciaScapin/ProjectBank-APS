package ProjetoBanco;

/**
 *    Projeto APS - APLICATIVO BANCÁRIO
 *              Grupo JJLM
 * @author Jair Gudaites Junior - 21134258
 * @author Júlio Vinícius - 21085239
 * @author Lucas Garcia Scapin - 21128904
 * @author Matheus Oliveira - 21073117
 * Classe ContaPoupanca que herda de Conta
 */

public class ContaPoupanca extends Conta {
    /**
     * Construtor default
     * @param cpf String
     * @param nomeCliente String
     * @param numeroConta int
     * @param saldo double
     */
    public ContaPoupanca (String cpf, String nomeCliente, int numeroConta, double saldo){
        super(cpf, nomeCliente, numeroConta, saldo);
    }

    /**
     * Calcula rendimento mensal a partir da porcentagem e saldo em conta
     * @param porcentagemRendimento float
     *
     */
    public void calculaRendimento (double porcentagemRendimento){
        super.depositar((getSaldo() * (porcentagemRendimento/100)));

    }

    /**
     * Reescrita do toString() implementando saldo e o rendimento
     * @return String
     */

    @Override
    public String toString() {
        return super.toString();
    }
}
