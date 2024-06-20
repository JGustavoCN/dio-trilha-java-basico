package dio.bootcamp.santander.junit;

/**
 *
 * @author José Gustavo
 */
public class Conta  {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected String nome;

    public Conta(String cliente) {
        nome = cliente;
    }
    
    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.nome));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
