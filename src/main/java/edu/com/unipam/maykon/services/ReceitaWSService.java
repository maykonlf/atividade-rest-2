package edu.com.unipam.maykon.services;

import edu.com.unipam.maykon.entidades.CNPJ;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ReceitaWSService {
    @GET("v1/cnpj/{cnpj}")
    Call<CNPJ> getInfo(@Path("cnpj") String cnpj);
}
