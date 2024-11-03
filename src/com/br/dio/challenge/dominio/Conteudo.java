package com.br.dio.challenge.dominio;

public abstract class Conteudo {
    protected static final double xp_Padrao = 10d;

    private String titulo;
    private String descricao;

    public abstract double cacularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}