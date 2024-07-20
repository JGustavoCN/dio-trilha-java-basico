package dio.springboot.app.b_IoC_DI_Bean_Autowired;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author José Gustavo
 */
@Configuration
public class Beans {
    @Bean
    @Scope("singleton") // É o scope padrão
    public Gson gson(){
        return new Gson();
    }
}
