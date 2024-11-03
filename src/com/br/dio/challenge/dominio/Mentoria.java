package com.br.dio.challenge.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    protected LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double cacularXp() {
        return 0;
    }
}
