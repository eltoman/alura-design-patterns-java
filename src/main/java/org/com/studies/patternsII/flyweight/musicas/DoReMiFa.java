package org.com.studies.patternsII.flyweight.musicas;

import org.com.studies.patternsII.flyweight.notas.Nota;
import org.com.studies.patternsII.flyweight.NotasMusicais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoReMiFa implements Music{
    NotasMusicais notas = new NotasMusicais();

    private List<Nota> musica = new ArrayList<>();


    public DoReMiFa(){
        build();
    }

    public void build(){
        musica = Arrays.asList(
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa"),

                notas.pega("do"),
                notas.pega("re"),
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("re"),
                notas.pega("re"),

                notas.pega("do"),
                notas.pega("sol"),
                notas.pega("fa"),
                notas.pega("mi"),
                notas.pega("mi"),
                notas.pega("mi"),

                notas.pega("do"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa")
        );
    }

    public List<Nota> getMusica() {
        return musica;
    }
}
