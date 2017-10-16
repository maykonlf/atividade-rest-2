package edu.com.unipam.maykon.services;

import edu.com.unipam.maykon.entidades.CNPJ;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ReceitaWS implements Service {
    private static ReceitaWS instance;
    private ReceitaWSService service;

    private ReceitaWS() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.receitaws.com.br")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(ReceitaWSService.class);
    }

    public static ReceitaWS getInstance() {
        if (instance == null) {
            instance = new ReceitaWS();
        }
        return instance;
    }

    public CNPJ getInfo(String cnpj) {
        try {
            return service.getInfo(cnpj).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
