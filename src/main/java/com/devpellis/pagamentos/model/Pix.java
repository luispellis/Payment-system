package main.java.com.devpellis.pagamentos.model;

public record Pix(String chavePix, double valor) implements Pagamento{

    public Pix {

        if (chavePix == null || chavePix.isBlank()){
            throw new IllegalArgumentException("A Chave pix não pode ser vazia");
        }

        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }

    private static final double TAXA = 0.01;

    @Override
    public double percentualTaxa(){
        return TAXA;
    }
}
