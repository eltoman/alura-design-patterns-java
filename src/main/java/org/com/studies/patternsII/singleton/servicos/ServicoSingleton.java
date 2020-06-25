package org.com.studies.patternsII.singleton.servicos;

public class ServicoSingleton {

    private static Servico servico;

    public Servico getInstancia(){
        if (servico == null)
            servico = new Servico();

        return servico;
    }
}
