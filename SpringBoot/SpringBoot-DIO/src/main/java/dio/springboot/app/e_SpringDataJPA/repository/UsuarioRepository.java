package dio.springboot.app.e_SpringDataJPA.repository;

import dio.springboot.app.e_SpringDataJPA.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author José Gustavo
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
     
    //Query Method
    List<Usuario> findByNameContaining(String name);

    //Query Method
    Usuario findByUsername(String username);

    //Query Override
    @Query("SELECT u FROM Usuario u WHERE u.name LIKE %:name%")
    List<Usuario> filtrarPorNome(@Param("name") String name);
}
