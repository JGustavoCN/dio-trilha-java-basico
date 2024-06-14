package dio.bootcamp.santander.bancodigital;

import java.util.List;
import lombok.Getter;

/**
 *
 * @author José Gustavo
 */
@Getter
@lombok.Setter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
public class Banco {
    private String nome;
    private List<Conta> contas;
    
    
}
