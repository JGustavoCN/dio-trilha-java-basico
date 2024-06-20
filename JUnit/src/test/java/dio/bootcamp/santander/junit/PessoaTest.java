package dio.bootcamp.santander.junit;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author José Gustavo
 */
public class PessoaTest {
    
    @Test
    void deveCalcularIdadeCorreta(){
        Pessoa pessoa = new Pessoa("Jessica", LocalDateTime.of(2000, 3, 1,15,0,0));
        Assertions.assertEquals(LocalDateTime.now().getYear()-2000,pessoa.getIdade());
    }
    
    @Test
    void deveSerMaiorSe_IdadeMaiorOuIgualQue18(){
        Pessoa pessoa = new Pessoa("Jessica", LocalDateTime.of(2000, 3, 1,15,0,0));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());
    }
    
    @Test
    void deveSerMenorSe_IdadeMenorQue18(){
        Pessoa pessoa = new Pessoa("Jessica", LocalDateTime.of(2020, 3, 1,15,0,0));
        Assertions.assertFalse(pessoa.ehMaiorDeIdade());
    }
}
