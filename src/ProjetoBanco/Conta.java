package ProjetoBanco;

/**
 *    Projeto APS - APLICATIVO BANCÁRIO
 *              Grupo JJLM          
 * @author Jair Gudaites Junior - 21134258
 * @author Júlio Vinícius - 21085239
 * @author Lucas Garcia Scapin - 21128904
 * @author Matheus Oliveira - 21073117
 *            Classe Abstrata
 */

public abstract class Conta {

    private String nomeCliente;
    private String cpf;
    private int numeroConta;
    private double saldo;

    /** Construtor
     * Com parâmetros cpf, nomeCliente, numeroConta, saldo */
public Conta (String cpf, String nomeCliente, int numeroConta, double saldo){
    this.cpf = cpf;
    this.nomeCliente = nomeCliente;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
}

    /**
     * Método get de numeroConta
     * @return int
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * Método get de nomeCliente
     * @return String
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Método get de cpf
     * @return String
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Método get de saldo
     * @return double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para realizar saque em conta.
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
     * Método para realizar deposito em conta
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
