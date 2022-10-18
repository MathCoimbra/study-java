package com.design_patterns.facade;

import com.design_patterns.facade.subsistema1.crm.CrmService;
import com.design_patterns.facade.subsistema2.cep.CepApi;

public class Facade {

    /* Facade consiste na capacidade de facilitar implementações de sistemas diferentes */
    public void migrarCliente(String nome, String cep) {

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
