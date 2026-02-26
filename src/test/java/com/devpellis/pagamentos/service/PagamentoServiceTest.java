package test.java.com.devpellis.pagamentos.service;

import main.java.com.devpellis.pagamentos.dto.ResultadoPagamentoDTO;
import main.java.com.devpellis.pagamentos.model.CartaoCredito;
import main.java.com.devpellis.pagamentos.model.Pagamento;
import main.java.com.devpellis.pagamentos.service.PagamentoService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoServiceTest {

    @Test
    void deveProcessarPagamentoCartaoCorretamente() {

        Pagamento pagamento = new CartaoCredito("123", "Luis", 100.0);
        PagamentoService service = new PagamentoService();

        ResultadoPagamentoDTO resultado = service.processar(pagamento);

        assertEquals(100.0, resultado.valorOriginal(), 0.0001);
        assertEquals(5.0, resultado.taxa(), 0.0001);
        assertEquals(105.0, resultado.valorTotal(), 0.0001);
    }
}
