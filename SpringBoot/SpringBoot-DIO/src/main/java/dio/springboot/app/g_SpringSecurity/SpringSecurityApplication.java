package dio.springboot.app.g_SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author José Gustavo
 */
@SpringBootApplication(scanBasePackages = "dio.springboot.app.g_SpringSecurity")
@EnableJpaRepositories(basePackages = "dio.springboot.app.g_SpringSecurity.repository")
public class SpringSecurityApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
    
}

