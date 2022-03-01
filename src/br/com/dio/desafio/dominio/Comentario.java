package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Comentario {
    private Dev escritor;
    private String conteudo;
    private LocalDate data;

    public Comentario(Dev escritor, String conteudo) {
        this.escritor = escritor;
        this.conteudo = conteudo;
        this.data = LocalDate.now();
    }

    public Dev getEscritor() {
        return escritor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setEscritor(Dev escritor) {
        this.escritor = escritor;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
