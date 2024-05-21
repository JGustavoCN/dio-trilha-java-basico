package atividades;

/**
 *
 * @author José Gustavo
 * 
 */
public class SmartTV {
    
    boolean ligada;
    int canal =1;
    int volume = 25;
    public void aumentarCanal(){canal++;}
    public void diminuirCanal(){canal--;}
    public void mudarCanal(int canal){this.canal = canal;}
    public void aumentarVolume(){volume++;}
    public void diminuirVolume(){volume--;}
    public void ligar(){ligada = true;}
    public void desligar(){ligada = false;}

    @Override
    public String toString() {
        return "SmartTV{" + "ligada=" + ligada + ", canal=" + canal + ", volume=" + volume + '}';
    }
    
    
}
