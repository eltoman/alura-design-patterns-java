package org.com.studies.patternsII.flyweight.musicas;

import org.com.studies.patternsII.flyweight.NotasMusicais;
import org.com.studies.patternsII.flyweight.notas.Nota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteNovasNotas implements Music {
    NotasMusicais notas = new NotasMusicais();

    private List<Nota> musica = new ArrayList<>();

    public TesteNovasNotas() {
        build();
    }

    @Override
    public void build() {
        musica = Arrays.asList(
                notas.pega("dosustenido"),
                notas.pega("resustenido"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("dosustenido"),
                notas.pega("resustenido"),
                notas.pega("fa"),
                notas.pega("fa")
        );
    }

    @Override
    public List<Nota> getMusica() {
        return musica;
    }
}