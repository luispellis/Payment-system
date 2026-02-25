package test.java.com.devpellis.pagamentos.model;

import main.java.com.devpellis.pagamentos.model.Boleto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoletoTest {

    @Test
    void deveCalcularTaxaCorretamente() {
        Boleto boleto = new Boleto("123456789", 100.0);

        assertEquals(2.0, boleto.calcularTaxa(), 0.0001);
    }

    @Test
    void deveLancarExcecaoQuandoValorForZero() {
        assertThrows(IllegalArgumentException.class, () ->
                new Boleto("123456789", 0.0)
        );
    }

    @Test
    void deveLancarExcecaoQuandoCodigoForVazio() {
        assertThrows(IllegalArgumentException.class, () ->
                new Boleto("", 100.0)
        );
    }
}