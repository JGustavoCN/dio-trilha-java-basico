package subsistema2.cep;

/**
 *
 * @author José Gustavo
 */
public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Tobias Barreto";
    }

    public String recuperarEstado(String cep) {
        return "SE";
    }
}
