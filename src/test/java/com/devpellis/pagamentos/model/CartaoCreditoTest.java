package test.java.com.devpellis.pagamentos.model;

import main.java.com.devpellis.pagamentos.model.CartaoCredito;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartaoCreditoTest {

    @Test
    void deveCalcularTaxaCorretamente(){
        CartaoCredito cartao = new CartaoCredito("123", "Luis", 100.0);

        assertEquals(5.0, cartao.calcularTaxa(), 0.0001);
    }

    @Test
    void deveLancarExcecaoQuandoValorForZero(){
        assertThrows(IllegalArgumentException.class, () ->
                new CartaoCredito("123", "Luis", 0.0)
        );
    }
}
