package padroesprojetojava;

import padroesprojetojava.Facade.Facade;
import padroesprojetojava.Strategy.Comportamento;
import padroesprojetojava.Strategy.Robo;
import padroesprojetojava.Strategy.strategyComportamentos.ComportamentoAgressivo;
import padroesprojetojava.Strategy.strategyComportamentos.ComportamentoDefensivo;
import padroesprojetojava.Strategy.strategyComportamentos.ComportamentoNormal;
import padroesprojetojava.Singleton.SingletonEager;
import padroesprojetojava.Singleton.SingletonLazy;
import padroesprojetojava.Singleton.SingletonLazyHolder;

/**
 * @author José Gustavo
 */
public class PadroesProjetoJava {

    public static void main(String[] args) {
        // Singleton
        System.out.println("============ Singleton ============");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        System.out.println("============ Strategy ============");
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("José Gustavo", "13494381788");

    }

}
