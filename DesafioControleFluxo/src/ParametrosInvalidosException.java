/**
 *
 * @author José Gustavo
 */
public class ParametrosInvalidosException extends Exception{

    /**
     * Creates a new instance of <code>ParametrosInvalidosException</code>
     * without detail message.
     */
    public ParametrosInvalidosException() {
    }

    /**
     * Constructs an instance of <code>ParametrosInvalidosException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public ParametrosInvalidosException(String msg) {
        super(msg);
    }
}
