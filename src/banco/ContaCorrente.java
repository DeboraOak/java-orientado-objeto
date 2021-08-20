package banco;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==\tExtrato da Conta Corrente\t==");
        super.imprimirExtrato();
    }
}
