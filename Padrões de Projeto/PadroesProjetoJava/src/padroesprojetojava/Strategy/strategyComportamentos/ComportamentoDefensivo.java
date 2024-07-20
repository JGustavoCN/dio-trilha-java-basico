package padroesprojetojava.Strategy.strategyComportamentos;

import padroesprojetojava.Strategy.Comportamento;

/**
 *
 * @author José Gustavo
 */
public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }

}
