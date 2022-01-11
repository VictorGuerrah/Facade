public class LojaFacade {
    public static String verificarCompra(Loja loja) {
        if(Pagamento.getInstance().verificado() && Usuario.getInstance().verificado()) {
            return "Compra aprovada!";
        } else {
            return "Todos os requimentos devem ser validados.";
        }
    }
}
