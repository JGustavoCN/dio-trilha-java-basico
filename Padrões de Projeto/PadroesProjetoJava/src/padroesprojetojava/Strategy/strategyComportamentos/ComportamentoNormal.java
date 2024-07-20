package padroesprojetojava.Strategy.strategyComportamentos;

import padroesprojetojava.Strategy.Comportamento;

/**
 *
 * @author José Gustavo
 */
public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }

}
