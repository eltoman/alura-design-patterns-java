package org.com.studies.patternsII.facade;

import org.com.studies.patternsII.facade.legacy.Cliente;
import org.com.studies.patternsII.facade.legacy.Cobranca;
import org.com.studies.patternsII.facade.legacy.ContatoCliente;
import org.com.studies.patternsII.facade.legacy.Fatura;

public class TesteFacade {

    public static void main(String args[]){

        EmpresaFacade facade = new EmpresaFacade();

        Cliente cliente = facade.buscaCliente("123");

        Fatura fatura = facade.criaFatura(cliente, 300.0);

        Cobranca cobranca = facade.geraCobranca(fatura);

        ContatoCliente contatoCliente = facade.fazContato(cliente, cobranca);

    }
}
