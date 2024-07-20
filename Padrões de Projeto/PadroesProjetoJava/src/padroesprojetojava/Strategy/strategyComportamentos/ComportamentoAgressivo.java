package padroesprojetojava.Strategy.strategyComportamentos;

import padroesprojetojava.Strategy.Comportamento;

/**
 *
 * @author José Gustavo
 */
public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }

}
