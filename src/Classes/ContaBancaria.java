package Classes;

public class ContaBancaria {

    private String titular;
    private int saldo;

    public ContaBancaria(String titular , int saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void Consultar(){
        System.out.println("Saldo é : " + this.saldo);

    }

    public void Depositar(int deposito) {
         this.saldo = this.saldo + deposito;

    }

    public void Sacar(int saque) {
        this.saldo = this.saldo - saque;

    }




}
