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
    private int saldo;

//Contrutor default enviadado
public Conta (){
    this.cpf = "Numero de CPF não definido";
    this.nomeCliente = "Nome do cliente não definido";
    this.numeroConta = 0;
    this.saldo = 0;
}

//Construtor com valores
public Conta (String cpf, String nomeCliente, int numeroConta, int saldo){
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

    public int getSaldo() {
        return saldo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    private void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }

//Metodo para sacar dinheiro.
public boolean sacar(int valorSacado){
    if (valorSacado < saldo){
        saldo =- valorSacado;
        return true;
    } else {
        return false;
    }
}
//Provavelmente vamos ter que usar esse boolean no main pra alterar o saldo da conta

//Metodo para deposito
public boolean depositar (int valorDepositado){
    if(valorDepositado > 0){
        saldo =+ valorDepositado;
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
