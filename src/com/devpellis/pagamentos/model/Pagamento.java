package com.devpellis.pagamentos.model;

public interface Pagamento {

    double valor();

    double percentualTaxa();

    default double calcularTaxa(){
        return valor() * percentualTaxa();
    }

}
