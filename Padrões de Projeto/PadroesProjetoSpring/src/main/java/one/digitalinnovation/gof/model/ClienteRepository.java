package one.digitalinnovation.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author José Gustavo
 */
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}