package org.com.studies.patternsII.bridge;

public class TesteBridge {

    public static void main(String args[]){
        String conteudo;
        Mapa mapa;

        System.out.println("-- Google Maps --");
        mapa = new GoogleMaps();
        conteudo = mapa.devolveMapa("Rua Vergueiro, 3185");
        System.out.println(conteudo);

        System.out.println("-- Maplink --");
        mapa = new Maplink();
        conteudo = mapa.devolveMapa("Rua Adolfo Pinheiro, 2596");
        System.out.println(conteudo);
    }
}
