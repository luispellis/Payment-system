package main.java.com.devpellis.pagamentos.dto;

public record ResultadoPagamentoDTO(
    String tipo,
    double valorOriginal,
    double taxa,
    double valorTotal
    ){}

