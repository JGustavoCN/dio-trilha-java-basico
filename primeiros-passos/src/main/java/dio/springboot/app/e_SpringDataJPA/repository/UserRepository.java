package dio.springboot.app.e_SpringDataJPA.repository;

import dio.springboot.app.e_SpringDataJPA.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author José Gustavo
 */
public interface UserRepository extends JpaRepository<User, Integer>{
     
}
