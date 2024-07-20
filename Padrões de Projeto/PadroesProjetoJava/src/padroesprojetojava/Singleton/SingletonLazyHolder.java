package padroesprojetojava.Singleton;

/**
 * Singleton "preguiçoso".
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * @author José Gustavo
 */
public class SingletonLazyHolder {
    
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
