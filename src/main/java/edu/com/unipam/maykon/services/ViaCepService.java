package edu.com.unipam.maykon.services;

import edu.com.unipam.maykon.entidades.CEP;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ViaCepService {
    @GET("ws/{cep}/json/")
    Call<CEP> getInfo(@Path("cep") String cep);
}
