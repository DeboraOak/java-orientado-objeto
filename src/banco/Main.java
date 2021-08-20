package banco;

public class Main {
    public static void main(String[] args) {

        Cliente debora = new Cliente();
        Cliente roberto = new Cliente();
        debora.setNome("Debora");
        roberto.setNome("Roberto");

        Conta ccD = new ContaCorrente(debora);
        Conta poupancaD = new ContaPoupanca(debora);

        Conta ccR = new ContaCorrente(roberto);

        ccD.depositar(100);
        ccD.transferir(100,poupancaD);

        poupancaD.transferir(50,ccR);

        ccD.imprimirExtrato();
        poupancaD.imprimirExtrato();

        ccR.imprimirExtrato();

    }
}
