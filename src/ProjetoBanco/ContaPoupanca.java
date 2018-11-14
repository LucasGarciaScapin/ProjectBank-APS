package ProjetoBanco;

/**
 * Classe ContaPoupanca que herda de Conta
 * @author Lucas Garcia Scapin
 * @author Júlio "Lennox" Vinícius
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
     * Calcula rendimento mensal apartir da porcentagem e saldo em conta
     * @param porcentagemRendimento int
     * @return double
     */
    public double calculaRendimento (float porcentagemRendimento){
        return getSaldo() * (porcentagemRendimento/100);
    }

    //TODO formatar o texto
    @Override
    public String toString() {
        return super.toString() + "\nConsidenrando o saldo o rendimento deste mes e: "
                + calculaRendimento(0.5f);
    }
}
