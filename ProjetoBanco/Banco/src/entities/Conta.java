package entities;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public int getNumero() {
        return numero;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public  void depositar(double quantidade){
        saldo += quantidade;
    }

    public  void sacar(double quantidade ){
        saldo -= quantidade + 5.0;
    }

    public String toString(){
        return  "conta "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}
