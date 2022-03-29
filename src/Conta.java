

public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Agência: %d", this.numero));
        System.out.println(String.format("Agência: %.2f", this.saldo));
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
