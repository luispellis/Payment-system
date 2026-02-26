package test.java.com.devpellis.pagamentos.model;

import main.java.com.devpellis.pagamentos.model.Pix;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PixTest {

    @Test
    void deveCalcularTaxaCorretamente() {
        Pix pix = new Pix("email@email.com", 100.0);

        assertEquals(1.0, pix.calcularTaxa(), 0.0001);
    }

    @Test
    void deveLancarExcecaoQuandoValorForZero() {
        assertThrows(IllegalArgumentException.class, () ->
                new Pix("email@email.com", 0.0)
        );
    }

    @Test
    void deveLancarExcecaoQuandoChaveForNula() {
        assertThrows(IllegalArgumentException.class, () ->
                new Pix(null, 100.0)
        );
    }
}