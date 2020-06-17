package org.com.studies.patterns.state;

public class TestaDescontos {
    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500.0);

        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor()); // imprime 475,00 pois descontou 5%

        // Testa execeção
        try{
            reforma.aplicaDescontoExtra();
        }catch (Exception ex){
            System.out.println("-- Exception esperada --");
            System.out.println(ex.getMessage());
            System.out.println("-- Fim da Exception esperada --");
        }

        reforma.aprova(); // aprova nota!
        reforma.aplicaDescontoExtra();
        System.out.println(reforma.getValor()); // imprime 465,50 pois descontou 2%

        reforma.finaliza();

        simulaExececoes(reforma);
    }

    private static void simulaExececoes(Orcamento reforma){
        try{
            reforma.aplicaDescontoExtra();
        }catch (Exception ex){
            System.out.println("-- Exception esperada --");
            System.out.println(ex.getMessage());
        }

        try{
            reforma.aprova();
        }catch (Exception ex){
            System.out.println("-- Exception esperada --");
            System.out.println(ex.getMessage());
        }

    }
}