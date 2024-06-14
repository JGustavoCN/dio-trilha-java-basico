package iphone;

/**
 * @author José Gustavo
 */
public class IPhone implements ReprodutorMusical, Telefone, NavegadorInternet {

    /**
     * Default constructor
     */
    public IPhone() {
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }

    /**
     * @param musica
     */
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocar "+ musica);
    }

    /**
     * @param nome
     */
    @Override
    public void ligar(String nome) {
        System.out.println("Ligando para "+ nome);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }

    /**
     * @param url
     */
    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessar "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adcionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

}