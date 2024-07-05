package dio.springboot.app.d_Properties_Value_Configuration;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author José Gustavo
 */
@Component("SistemaMensagemCnfiguration")
public class SistemaMensagem implements CommandLineRunner {

    
// --> Usando o @Value
    
    @Value("${spring.application.name:NoNameProject}")
    private String projeto;
    @Value("${name:NoReply-DIO}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;
    
// --> Usando o @ConfigurationPropreties
    
    @Autowired
    private RemetenteConfiguration remetente;
    
    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("============================= Usando o @Value =============================");
        
        System.out.println("Mensagem enviada por: " + nome
                + "\nE-mail:" + email
                + "\nCom telefones para contato: " + telefones.get(0)
                + "\nNome do projeto: " + projeto);
        System.out.println("Seu cadastro foi aprovado");
        
        System.out.println("============================= Usando o @ConfigurationPropreties =============================");
        
        System.out.println("Mensagem enviada por: " + remetente.getNome()
                + "\nE-mail:" + remetente.getEmail()
                + "\nCom telefones para contato: " + remetente.getTelefones()
                + "\nNome do projeto: " + projeto);
        System.out.println("Seu cadastro foi aprovado");
        
    }
}
