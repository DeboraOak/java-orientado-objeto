package banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==\tExtrato da Conta Poupança\t==");
        super.imprimirExtrato();
    }
}
