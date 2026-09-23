public class MainUsuarios {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("pedro", "1234");
        Administrador admin = new Administrador("admin01", "senha123", 5);

        System.out.println("Usuário autenticado: " + usuario.autenticar("1234"));
        System.out.println("Admin autenticado: " + admin.autenticar("senha123"));
        System.out.println("JSON do admin: " + admin.exportarJSON());
    }
}
