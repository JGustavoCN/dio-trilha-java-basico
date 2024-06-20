package dio.bootcamp.santander.mockito;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author José Gustavo
 */
@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    
    
    /*
    @BeforeAll
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        //Essa não é depreciada
        AutoCloseable openMocks = MockitoAnnotations.openMocks(this);
    }
    
    private ApiDosCorreios apiDosCorreios2 = Mockito.mock(ApiDosCorreios.class);
    */
    
    @Mock
    private ApiDosCorreios apiDosCorreios;
    
    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;
    
    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SE", "Tobias Barreto", "Av. Montes Coelho", "Casa", "Agripino 3");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("49300000")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Gustavo", "0138249824", LocalDate.now(), "49300000");
        assertEquals("Gustavo",pessoa.getNome());
        assertEquals("0138249824",pessoa.getDocumento());
        assertEquals("SE",pessoa.getEndereco().getUf());
        assertEquals("Casa",pessoa.getEndereco().getComplemento());
    }
    
}
