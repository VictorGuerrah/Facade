public class Pagamento extends Requerimento {
    private  static Pagamento pagamento = new Pagamento();

    private Pagamento() {};

    public static Pagamento getInstance() {
        return pagamento;
    }
}
