package org.com.studies.patternsII.singleton;

import org.com.studies.patternsII.singleton.Empresa.EmpresaFacade;
import org.com.studies.patternsII.singleton.Empresa.EmpresaFacadeSingleton;
import org.com.studies.patternsII.singleton.legacy.Cliente;
import org.com.studies.patternsII.singleton.legacy.Cobranca;
import org.com.studies.patternsII.singleton.legacy.ContatoCliente;
import org.com.studies.patternsII.singleton.legacy.Fatura;

public class TesteSingleton {

    public static void main(String args[]){

        EmpresaFacade empresa = new EmpresaFacadeSingleton().getInstancia();
        EmpresaFacade empresa2 = new EmpresaFacadeSingleton().getInstancia();
        EmpresaFacade empresa3 = new EmpresaFacadeSingleton().getInstancia();

        System.out.println(empresa.toString());
        System.out.println(empresa2.toString());
        System.out.println(empresa3.toString());

        Cliente cliente = empresa.buscaCliente("123");
        Fatura fatura = empresa.criaFatura(cliente, 300.0);
        Cobranca cobranca = empresa.geraCobranca(fatura);
        ContatoCliente contatoCliente = empresa.fazContato(cliente, cobranca);

    }
}
