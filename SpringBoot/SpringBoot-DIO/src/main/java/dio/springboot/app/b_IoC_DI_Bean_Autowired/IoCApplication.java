package dio.springboot.app.b_IoC_DI_Bean_Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author José Gustavo
 */
@SpringBootApplication
public class IoCApplication {

    public static void main(String[] args) {
        SpringApplication.run(IoCApplication.class, args);
    }

    /**
     *
     * Metodo referente ao pacote @see b_IoC_DI_Bean_Autowired
     *
     * @param conversor
     * @return
     * @throws Exception
     */
    @Bean
    public CommandLineRunner runConversorJson(ConversorJson conversor) throws Exception {
        return args -> {
            System.out.println("============================= Conversor Json =============================");
            String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }

}
