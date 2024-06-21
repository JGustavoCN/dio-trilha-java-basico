package dio.bootcamp.santander.mockito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author José Gustavo
 */
public class EnviarMensagem {

    private List<Mensagem> mensagens = new ArrayList<>();

    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagens.add(mensagem);
    }

    public List<Mensagem> getMensagens() {
        return Collections.unmodifiableList(this.mensagens);
    }

}
