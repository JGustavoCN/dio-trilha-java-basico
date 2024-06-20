package dio.bootcamp.santander.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author José Gustavo
 */
public class AssumptionsTeste {
    
    @Test
    void validarAlgoSomenteNoUsuarioAluno(){
        Assumptions.assumeTrue("Aluno".equals(System.getProperty("user.name")));
        Assumptions.assumeFalse("Administrador".equals(System.getProperty("user.name")));
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    void validarAlgoSomenteSeNaoForUsuarioAluno(){
        Assumptions.assumeFalse("Aluno".equals(System.getProperty("user.name")));
        Assertions.assertEquals(10, 5 + 5);
    }
    
}
