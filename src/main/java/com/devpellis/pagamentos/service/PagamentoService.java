package com.devpellis.pagamentos.service;

import com.devpellis.pagamentos.dto.ResultadoPagamentoDTO;
import com.devpellis.pagamentos.model.Pagamento;

public class PagamentoService {

    public ResultadoPagamentoDTO processar(Pagamento pagamento){

        double valor = pagamento.valor();
        double taxa = pagamento.calcularTaxa();
        double total = valor + taxa;

        return new ResultadoPagamentoDTO(
                pagamento.getClass().getSimpleName(),
                valor,
                taxa,
                total
        );
    }
}
