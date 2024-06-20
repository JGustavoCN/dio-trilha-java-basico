package dio.bootcamp.santander.junit;

import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author José Gustavo
 */
public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.inicarConexao();
    }

    @BeforeEach
    void insereDadosParaTestes() {
        BancoDeDados.insereDados(new Pessoa("Jessica", LocalDateTime.of(2000, 3, 1, 15, 0, 0)));
    }

    @AfterEach
    void removerDadosParaTestes() {
        BancoDeDados.removerDados(new Pessoa("Jessica", LocalDateTime.of(2000, 3, 1, 15, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }
    
    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }

}
