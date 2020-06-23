package org.com.studies.patternsII.bridge;

public class GoogleMaps implements Mapa {

    @Override
    public String devolveMapa(String rua) {
        return "Mapa Google Maps: " + rua;
    }

}
