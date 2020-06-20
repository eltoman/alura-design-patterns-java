package org.com.studies.patternsII.flyweight;

import org.com.studies.patternsII.flyweight.musicas.DoReMiFa;
import org.com.studies.patternsII.flyweight.musicas.Music;
import org.com.studies.patternsII.flyweight.musicas.TesteNovasNotas;

public class ProgramNotasMusicais {

    public static void main(String args[]) {
        Music doReMiFa = new DoReMiFa();
        Music testeNovaMusica = new TesteNovasNotas();
        Piano piano = new Piano();
        piano.toca(testeNovaMusica.getMusica());
        piano.toca(doReMiFa.getMusica());
    }

}
