package dio.springboot.app.h_JWTSpringSecurity.dtos;

/**
 *
 * @author José Gustavo
 */
public class Sessao {
    private String login;
    private String token;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
