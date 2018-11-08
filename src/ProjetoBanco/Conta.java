package ProjetoBanco;

/**
 * Projeto Banco
 * @author Lucas Garcia
 * @author Júlio "Lennox" Vinícius
 */
public abstract class Conta {
    private String nomeCliente;
    private String cpf;
    private int numeroConta;
    private double saldo;


//Construtor com valores
public Conta (String cpf, String nomeCliente, int numeroConta, double saldo){
    this.cpf = cpf;
    this.nomeCliente = nomeCliente;
    this.numeroConta = numeroConta;
    this.saldo = saldo;
}

//Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCPF() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

//Metodo para sacar dinheiro.
public boolean sacar(double valorSacado){
    if (valorSacado < saldo){
        saldo -= valorSacado;
        return true;
    } else {
        return false;
    }
}
//Provavelmente vamos ter que usar esse boolean no main pra alterar o saldo da conta

//Metodo para deposito
public boolean depositar (double valorDepositado){
    if(valorDepositado > 0){
        saldo += valorDepositado;
        return true;
    } else {
        return false;
    }
}

@Override
public String toString (){
    return "CPF do Cliente: " + cpf
        + "\nNome do Cliente: " + nomeCliente
        + "\nNumero da Conta: " + numeroConta
        + "\nSaldo da Conta: " + saldo;
}

}
