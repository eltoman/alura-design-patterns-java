package org.com.studies.patternsII.adapter;

public class TesteAdapter {

    public static void main(String args[]){

        System.out.println("-- Relogio do Sistema --");
        Relogio relogioDoSistema = new RelogioDoSistema();
        System.out.println(relogioDoSistema.hoje().getTime());

        System.out.println("-- Relogio de Londres --");
        Relogio relogioDoSherlock = new RelogioDoSherlock();
        System.out.println(relogioDoSherlock.hoje().getTime());

    }

}
