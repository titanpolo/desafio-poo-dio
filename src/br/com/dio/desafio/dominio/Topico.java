package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class Topico {
    private String titulo;
    private final Dev escritor;
    private String conteudo;
    private final LocalDate data;
    private int visualizacoes;

    private final Set<Comentario> comentarios = new LinkedHashSet<>();

    public Topico(String titulo, Dev escritor, String conteudo) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.conteudo = conteudo;
        this.data = LocalDate.now();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Dev getEscritor() {
        return escritor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDate getData() {
        return data;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }
}
