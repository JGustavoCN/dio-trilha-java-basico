package dio.bootcamp.santander.mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 *
 * @author José Gustavo
 */
@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTest {
    
    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    public void verificarComportamentoDaClasse() {
        Mensagem mensagem = new Mensagem("Hello World");
        Mockito.verifyNoInteractions(enviarMensagem);
        enviarMensagem.adicionarMensagem(mensagem);
        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);
        
        assertEquals(1, enviarMensagem.getMensagens().size());
    }
    
}
