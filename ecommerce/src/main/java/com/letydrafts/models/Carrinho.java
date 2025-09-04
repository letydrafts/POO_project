package com.letydrafts.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Product> product;
    private double total;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime finalizadoEm;

    public Carrinho(double total, String descricao, LocalDateTime dataCriacao, LocalDateTime finalizadoEm) {
        this.product = new ArrayList<>();
        this.total = total;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.finalizadoEm = finalizadoEm; 
    }
}