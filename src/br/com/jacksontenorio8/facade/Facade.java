package br.com.jacksontenorio8.facade;

import br.com.jacksontenorio8.subsistema1.crm.CrmService;
import br.com.jacksontenorio8.subsistema2.cep.CepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
