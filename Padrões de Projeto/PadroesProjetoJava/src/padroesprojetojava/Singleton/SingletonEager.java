package padroesprojetojava.Singleton;

/**
 * Singleton "apressado".
 *
 * @author José Gustavo
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
