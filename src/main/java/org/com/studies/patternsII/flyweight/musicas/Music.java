package org.com.studies.patternsII.flyweight.musicas;

import org.com.studies.patternsII.flyweight.notas.Nota;

import java.util.List;

public interface Music {
    public void build();

    public List<Nota> getMusica();
}
