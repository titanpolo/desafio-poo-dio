package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Live extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return 0;
    }

    public LocalDate getData() {
        return data;
    }

    public void setDataLive(LocalDate data) {
        this.data = data;
    }
}
