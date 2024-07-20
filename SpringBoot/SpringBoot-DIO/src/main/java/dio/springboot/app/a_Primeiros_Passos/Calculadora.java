package dio.springboot.app.a_Primeiros_Passos;

import org.springframework.stereotype.Component;

/**
 *
 * @author José Gustavo
 */
@Component
public class Calculadora {
    
    public int somar (int n1, int n2){
        return n1+n2;
    }
    
}
