public interface Autenticavel {
    boolean autenticar(String senha);
}

public interface ExportavelJSON {
    String exportarJSON();
}

public class Usuario implements Autenticavel {
    protected String login;
    protected String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

public class Administrador extends Usuario implements Autenticavel, ExportavelJSON {
    private int nivelAcesso;

    public Administrador(String login, String senha, int nivelAcesso) {
        super(login, senha);
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String exportarJSON() {
        return "{ \"login\": \"" + login + "\", \"nivelAcesso\": " + nivelAcesso + " }";
    }
}
