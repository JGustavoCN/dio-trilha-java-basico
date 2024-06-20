package dio.bootcamp.santander.junit;

import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author José Gustavo
 */

/*
    Não, a execução dos métodos de teste no JUnit 5 não segue, por padrão, 
    uma ordem alfabética. A ordem de execução é determinística, mas não é 
    especificada e pode parecer alfabética em alguns casos por coincidência. 
*/

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdemTeste {
    
    //Order só vai ter prioridade se TestMethodOrder for OrderAnnotation 
    @Order(4)
    @DisplayName("C")
    @Test
    //Desativa test
    @Disabled
    void valildaTestA() {
        Assertions.assertTrue(true);
        //Assertions.fail("Error");
    }

    @Order(3)
    @DisplayName("B")
    @Test
    void valildaTestB() {
        Assertions.assertTrue(true);
    }

    @Order(2)
    @DisplayName("A")
    @Test
    void valildaTestC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @DisplayName("D")
    @Test
    void valildaTestD() {
        Assertions.assertTrue(true);
    }

}
