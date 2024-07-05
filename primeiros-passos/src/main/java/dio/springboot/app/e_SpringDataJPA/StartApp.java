package dio.springboot.app.e_SpringDataJPA;

import dio.springboot.app.e_SpringDataJPA.model.User;
import dio.springboot.app.e_SpringDataJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author José Gustavo
 */
@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("José Gustavo");
        user.setUsername("JotaG");
        user.setPassword("dioSpringBoot");
        repository.save(user);
        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
    private void insertUser(){
        User user = new User();
        user.setName("GABRIEL NUNES");
        user.setUsername("gabriel");
        user.setPassword("santos");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
