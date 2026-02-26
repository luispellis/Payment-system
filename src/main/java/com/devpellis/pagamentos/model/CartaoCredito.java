package main.java.com.devpellis.pagamentos.model;

public record CartaoCredito(String numeroCartao, String titular, double valor ) implements Pagamento {

    public CartaoCredito {

        if (numeroCartao == null || numeroCartao.isBlank()){
            throw new IllegalArgumentException("Número do cartão não pode ser vazio");
        }

        if (titular == null || titular.isBlank()){
            throw new IllegalArgumentException("Títular não pode ser vazio");
        }

        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }

    private static final double TAXA = 0.05;

    @Override
    public double percentualTaxa(){
        return TAXA;
    }
}