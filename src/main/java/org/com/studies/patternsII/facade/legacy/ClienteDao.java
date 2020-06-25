package org.com.studies.patternsII.facade.legacy;

public class ClienteDao {
    public Cliente buscaPorCpf(String cpf) {
        System.out.println("buscaPorCpf - cpf: " + cpf);
        return new Cliente();
    }
}
