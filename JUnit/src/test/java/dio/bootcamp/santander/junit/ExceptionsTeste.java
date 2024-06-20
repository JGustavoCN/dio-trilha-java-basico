package dio.bootcamp.santander.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author José Gustavo
 */
public class ExceptionsTeste {
    
    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        
        Conta contaOrigem = new Conta("Joao");
        Conta contaDestino = new Conta("Luan");
        
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        
        //É sobrecarregado
        IllegalArgumentException assertThrows = Assertions.assertThrows(IllegalArgumentException.class, 
                () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 0));
        System.err.println("----> "+assertThrows.getMessage());
    }
    
    @Test
    void validarCenarioSemExcecaoNaTransferencia(){
        
        Conta contaOrigem = new Conta("Joao");
        Conta contaDestino = new Conta("Luan");
        
        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        
        //É sobrecarregado
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 10));
    }
    
}
