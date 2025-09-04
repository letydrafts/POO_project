package com.letydrafts.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> product;
    private double total;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime finalizadoEm;

    public Cart(double total, String descricao, LocalDateTime dataCriacao, LocalDateTime finalizadoEm) {
        this.product = new ArrayList<>();
        this.total = total;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.finalizadoEm = finalizadoEm; 
    }

    public Cart(LocalDateTime dataCriacao) {
        this.product = new ArrayList<>();
        this.total = 0.0;
        this.descricao = "Pendente";
        this.dataCriacao = dataCriacao; 
    }

    public ArrayList<Product> getProducts() {
        return product;
    }
}