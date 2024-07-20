package dio.springboot.app.c_Scopes_Singleton_Prototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author José Gustavo
 */
@SpringBootApplication
public class ScopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScopeApplication.class, args);
    }

    /**
     *
     * Metodo referente ao pacote @see c_Scopes_Singleton_Prototype
     *
     * @param sistema
     * @return
     * @throws Exception
     */
    @Bean
    public CommandLineRunner runSistemaMensagem(SistemaMensagem sistema) throws Exception {
        return args -> {
            System.out.println("============================= Sistema Mensagem =============================");
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
        };
    }

}
