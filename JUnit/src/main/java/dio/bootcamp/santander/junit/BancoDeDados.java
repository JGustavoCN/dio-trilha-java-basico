package dio.bootcamp.santander.junit;

import java.util.logging.Logger;

/**
 *
 * @author José Gustavo
 */
public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    
    public static void inicarConexao(){
        LOGGER.info("Iniciou Conexao");
    }
    
    public static void finalizarConexao(){
        LOGGER.info("Finalizar Conexao");
    }
    public static void insereDados(Pessoa pessoa){
        LOGGER.info("Insere Dados");
    }
    public static void removerDados(Pessoa pessoa){
        LOGGER.info("Remover Dados");
    }
}
