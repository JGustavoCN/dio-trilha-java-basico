package dio.springboot.app.e_SpringDataJPA;

import dio.springboot.app.e_SpringDataJPA.model.Usuario;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.springboot.app.e_SpringDataJPA.repository.UsuarioRepository;

/**
 *
 * @author José Gustavo
 */
@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UsuarioRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("======================================= SpringDataJPA ======================================");
        System.out.print("Quer executar?(S/N) ");
        if(teclado.nextLine().equalsIgnoreCase("N")){ return;}
        else{System.out.println("--> Vai continuar");
        }
        
        insertUser();
        System.out.println("=========== Encontrar o usuario por nome ============");
        List<Usuario> users = repository.findByNameContaining("José");
        for(Usuario u: users){
            System.out.println(u);
        }
    }
    private void insertUser(){
        System.out.println("=========== Inserir um usuario ============");
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        Usuario user = new Usuario();
        System.out.print("Digite o nome do usuario: ");
        user.setName(teclado.nextLine());
        System.out.print("Digite o username: ");
        user.setUsername(teclado.nextLine());
        System.out.print("Digite o password: ");
        user.setPassword(teclado.nextLine());
        repository.save(user);

        for(Usuario u: repository.findAll()){
            System.out.println(u);
        }
    }
}
