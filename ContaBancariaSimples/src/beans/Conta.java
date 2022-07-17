package beans;

public class Conta {
    private int numero;
    private double saldo;
    private String cliente;
    private double limiteEspecial;
    private String tipoConta;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo=this.saldo+ valor;
        extrato();
    }

    public void sacar(double valor){
        this.saldo=this.saldo- valor;
        extrato();
    }

    public void extrato(){
        System.out.println("Sua conta é:" +this.numero+ " e seu saldo é de:" +this.saldo+ "");
    }
}

