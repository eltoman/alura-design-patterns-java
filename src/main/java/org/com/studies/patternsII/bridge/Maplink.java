package org.com.studies.patternsII.bridge;

public class Maplink implements Mapa {
    @Override
    public String devolveMapa(String rua) {
        return "Maplink: " + rua;
    }
}
