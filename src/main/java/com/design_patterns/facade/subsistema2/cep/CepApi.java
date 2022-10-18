package com.design_patterns.facade.subsistema2.cep;

public class CepApi {

    private CepApi(){
        super();
    }

    /* Singleton */
    private static CepApi instancia = new CepApi();

    public static CepApi getInstancia(){
        return  instancia;
    }


    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }

}
