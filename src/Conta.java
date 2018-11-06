/*
 * Classe abstrata dos tipos de contas bancarias
 */
package appbanco;

/**
 *
 * @author Lennox
 */
public abstract class Conta {
    private String NomeCliente,NumeroConta, CPF;
    private int Saldo;

//Contrutor default enviadado
public Conta (){
    this.CPF = "Numero de CPF não definido";
    this.NomeCliente = "Nome do cliente não definido";
    this.NumeroConta = "Nome da conta não definida";
    this.Saldo = 0;
}

//Construtor com valores
public Conta (String CPF, String NomeCliente, String NumeroConta, int Saldo){
    this.CPF = CPF;
    this.NomeCliente = NomeCliente;
    this.NumeroConta = NumeroConta;
    this.Saldo = Saldo;
}

//Getters e Setters
    public String getNumeroConta() {
        return NumeroConta;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }
    
    private void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    private void setNumeroConta(String NumeroConta) {
        this.NumeroConta = NumeroConta;
    }

    private void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

//Metodo para sacar dinheiro.
public boolean sacar(int valorSacado){
    if (valorSacado < Saldo){
        return true;
    } else {
        return false;
    }
}
//Provavelmente vamos ter que usar esse boolean no main pra alterar o saldo da conta

//Metodo para deposito
public boolean depositar (int valorDepositado){
    if(valorDepositado > 0){
        return true;
    } else {
        return false;
    }
}
//Mesma logica do saque

//Metodo Imprimir que o Emerson deixou converter direto pra toString
@Override
public String toString (){
    return "CPF do Cliente: " + CPF
        + "\nNome do Cliente: " + NomeCliente
        + "\nNumero da Conta: " + NumeroConta
        + "\nSaldo da Conta: " + Saldo;
}

}
