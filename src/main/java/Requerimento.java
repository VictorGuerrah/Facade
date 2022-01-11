public abstract class Requerimento {
    private boolean verificado;

    public void verificar(boolean verificado) {
        this.verificado = verificado;
    }

    public boolean verificado() {
        return this.verificado;
    }
}
