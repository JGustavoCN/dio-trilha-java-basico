package dio.bootcamp.santander.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

/**
 *
 * @author José Gustavo
 */
public class CondicionaisTeste {

    // A maioria tem a versao Disabled
    
    @Test
    @EnabledIfEnvironmentVariable(named ="USER", matches = "Aluno")
    void validarAlgoSomenteNoUsuarioAlunoEnv() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @DisabledIfEnvironmentVariable(named ="USER", matches = "Aluno")
    void validarAlgoSeNaoForUsuarioAlunoEnv() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @EnabledIfSystemProperty(named ="user.name", matches = "Aluno")
    void validarAlgoSomenteNoUsuarioAlunoProperty() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @EnabledIfSystemProperty(named ="user.name", matches = "Aluno")
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoWindowsENoUsuarioAlunoProperty() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @EnabledIfSystemProperty(named ="user.name", matches = "Aluno")
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void validarAlgoSomenteNoLinuxMacENoUsuarioAlunoProperty() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @DisabledOnOs({OS.LINUX, OS.MAC})
    void validarAlgoSomenteSeNaoForLinuxMacENoUsuarioAlunoProperty() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @DisabledOnOs({OS.LINUX, OS.MAC})
    @EnabledOnJre (JRE.JAVA_11)
    void validarAlgoSomenteSeNaoForLinuxMacENaJRE11() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @EnabledForJreRange(min = JRE.JAVA_8 , max= JRE.JAVA_11)
    void validarAlgoNaJreSomenteEstiverEntreO8Ate11() {
        Assertions.assertEquals(10, 5 + 5);
    }

}
