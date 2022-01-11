public class Usuario extends Requerimento{
    private static Usuario usuario = new Usuario();

    private Usuario() {};

    public static Usuario getInstance() {
        return usuario;
    }
}
