package atividades;

/**
 *
 * @author José Gustavo
 */
public class Usuario {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        System.out.println(tv);
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.diminuirCanal();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.ligar();
        System.out.println(tv);
    }
}
