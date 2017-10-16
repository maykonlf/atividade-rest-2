package edu.com.unipam.maykon.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceFactory {
    public static Retrofit CreateService(EnumServices serviceType) {
        switch (serviceType) {
            case RECEITA_WS:
                return new Retrofit.Builder()
                        .baseUrl("https://www.receitaws.com.br")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            case VIA_CEP:
                return new Retrofit.Builder()
                        .baseUrl("https://viacep.com.br/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            default:
                return null;
        }
    }
}
