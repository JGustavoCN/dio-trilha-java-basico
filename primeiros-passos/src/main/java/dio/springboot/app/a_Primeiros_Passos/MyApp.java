package dio.springboot.app.a_Primeiros_Passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author José Gustavo
 */
@Component
public class MyApp implements CommandLineRunner{

    @Autowired
    private Calculadora calculadora;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("============================= Calculadora =============================");
        System.out.println("O resultado é "+ calculadora.somar(2, 7));
    }
    
}
