package ProjetoBanco;

/**
 * Classe Abstrata
 * @author Lucas Garcia Scapin
 * @author Júlio "Lennox" Vinícius
 */
public abstract class Conta {

    private String nomeCliente;
    private String cpf;
    private int numeroConta;
    private double saldo;

    /** Construtor
     * Com parametros cpf, nomeCliente, numeroConta, saldo */
public Conta (String cpf, String nomeCliente, int numeroConta, double saldo){
    this.cpf = cpf;
    this.nomeCliente = nomeCliente;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
}

    /**
     * Metodo get de numeroConta
     * @return int
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Metodo get de nomeCliente
     * @return String
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Metodo get de cpf
     * @return String
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Metodo get de saldo
     * @return double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para realizar saque em conta.
     * @param valorSacado double
     * @return boolean
     */
    public boolean sacar(double valorSacado){
        if(valorSacado > 0) {
            saldo -= valorSacado;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo para realizar deposito em conta
     * @param valorDepositado double
     * @return boolean
     */
    public boolean depositar (double valorDepositado){
        if(valorDepositado > 0){
            saldo += valorDepositado;
            return true;
        } else {
            return false;
        }
    }

    /**
     * ToString para formatar todos os atributos descritos na classe.
     * @return String
     */
    @Override
    public String toString (){
        return "CPF do Cliente: " + cpf
            + "\nNome do Cliente: " + nomeCliente
            + "\nNumero da Conta: " + numeroConta
            + "\nSaldo da Conta: " + saldo;
    }
}
