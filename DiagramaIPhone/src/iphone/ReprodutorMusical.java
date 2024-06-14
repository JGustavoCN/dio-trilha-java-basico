package iphone;

/**
 * @author José Gustavo
 */
public interface ReprodutorMusical {

    public void tocar();

    public void pausar();

    /**
     * @param musica
     */
    public void selecionarMusica(String musica);

}