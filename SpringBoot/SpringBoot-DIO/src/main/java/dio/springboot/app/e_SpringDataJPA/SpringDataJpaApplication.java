package dio.springboot.app.e_SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author José Gustavo
 */
@SpringBootApplication(scanBasePackages = {"dio.springboot.app.e_SpringDataJPA"})
@EnableJpaRepositories(basePackages = "dio.springboot.app.e_SpringDataJPA.repository")
public class SpringDataJpaApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
    
}
