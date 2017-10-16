package edu.com.unipam.maykon.services;

import edu.com.unipam.maykon.entidades.CEP;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class ViaCEP implements Service {
    private static ViaCEP instance;
    private ViaCepService service;

    private ViaCEP() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://viacep.com.br/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(ViaCepService.class);
    }

    public static ViaCEP getInstance() {
        if (instance == null) {
            instance = new ViaCEP();
        }
        return instance;
    }

    @Override
    public CEP getInfo(String cep) {
        try {
            return service.getInfo(cep).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
