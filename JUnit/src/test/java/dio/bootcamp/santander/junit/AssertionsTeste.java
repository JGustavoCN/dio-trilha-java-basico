package dio.bootcamp.santander.junit;

import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author José Gustavo
 */
public class AssertionsTeste {
    
    @Test
    void validarLancamentos(){
        int [] n1 = {10, 20, 30};
        int [] n2 = {10, 20, 30};
        int [] n3 = {1, -2, 3};
        int [] n4 = n1;
        // Ele primeiro verifica o tamanho do arrays antes de comparar valores
        assertArrayEquals(n1, n2);
        //Esse não compara os valores, ele está comparando a referencia na memoria (n1 , n4 -> Erro: iguais)
        assertNotEquals(n1, n2);
    }
    
    @Test
    void validarSeObjetoEstaNull(){
        Pessoa pessoa = null;
        assertNull(pessoa);
        pessoa = new Pessoa("Gustavo", LocalDateTime.now());
        assertNotNull(pessoa);
    }
    
    @Test
    void validarTiposDosNumeros(){
        double n1 = 5.0;
        double n2 = 5;
        
        assertEquals(n1, n2);
    }
    
}
