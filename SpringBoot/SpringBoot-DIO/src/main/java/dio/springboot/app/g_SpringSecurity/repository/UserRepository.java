package dio.springboot.app.g_SpringSecurity.repository;

import dio.springboot.app.g_SpringSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Aluno
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    //Ter o Query escrito o nome do usuario é um certo problema, as vezes precisa renomear o User e mudar aqui   
    @Query("SELECT e FROM Users e JOIN FETCH e.roles WHERE e.username= (:username)")
    public User findByUsername(@Param("username") String username);
}
