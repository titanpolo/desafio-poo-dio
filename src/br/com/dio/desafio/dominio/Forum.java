package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Forum {
    private final Set<Topico> topicos = new LinkedHashSet<>();

    public Set<Topico> getTopicos() {
        return topicos;
    }

}
