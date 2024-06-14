package dio.bootcamp.santander.bancodigital;

/**
 *
 * @author José Gustavo
 */
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();
    
}
