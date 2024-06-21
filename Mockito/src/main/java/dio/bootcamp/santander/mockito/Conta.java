package dio.bootcamp.santander.mockito;

/**
 *
 * @author José Gustavo
 */
public class Conta {

    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public void pagaBoleto(int valorAPagar) {
        validaSaldo(valorAPagar);
        debita(valorAPagar);
        enviaCreditoParaEmissor(valorAPagar);
    }

    public void validaSaldo(int valorAPagar) {
        if(valorAPagar > saldo || valorAPagar < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }
    }

    public void debita(int valorAPagar) {
        this.saldo = this.saldo - valorAPagar;
    }

    public void enviaCreditoParaEmissor(int valorAPagar) {
        //envia valor para emissor do boleto

    }
}
