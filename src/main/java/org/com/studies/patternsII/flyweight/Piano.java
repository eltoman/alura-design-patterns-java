package org.com.studies.patternsII.flyweight;

import org.com.studies.patternsII.flyweight.notas.Nota;
import org.jfugue.player.Player;

import java.util.List;

public class Piano {
    public void toca(List<Nota> musica) {
        Player player = new Player();

        StringBuilder musicaEmNotas = new StringBuilder();
        for(Nota nota : musica) {
            musicaEmNotas.append(nota.simbolo() + " ");
        }

        player.play(musicaEmNotas.toString());
    }
}
