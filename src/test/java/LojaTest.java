import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LojaTest {
    @Test
    void deveRetornarCompraSemProblemas() {
        Loja loja = new Loja();
        Usuario.getInstance().verificar(true);
        Pagamento.getInstance().verificar(true);

        assertEquals("Compra aprovada!", loja.realizarCompra());
    }

    @Test
    void deveRetornarCompraSemUsuario() {
        Loja loja = new Loja();
        Pagamento.getInstance().verificar(true);

        assertEquals("Todos os requimentos devem ser validados.", loja.realizarCompra());
    }

    @Test
    void deveRetornarCompraSemPagamento() {
        Loja loja = new Loja();
        Usuario.getInstance().verificar(true);

        assertEquals("Todos os requimentos devem ser validados.", loja.realizarCompra());
    }
}