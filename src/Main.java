import Classes.ContaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Caio",1000000);

        conta.Depositar(5000);
        conta.Sacar(2000);

        conta.Consultar();
    }
}