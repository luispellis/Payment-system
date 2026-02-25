package com.devpellis.pagamentos.model;

public record Boleto(String codigoBarras, double valor) implements Pagamento {

    public Boleto{

        if (codigoBarras == null || codigoBarras.isBlank()){
            throw new IllegalArgumentException("Código de barras não pode ser vazio");
        }

        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }

    private static final double TAXA = 0.02;

    @Override
    public double percentualTaxa() {
        return TAXA;
    }
}
