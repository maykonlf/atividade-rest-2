package edu.com.unipam.maykon.rest;

import edu.com.unipam.maykon.entidades.CEP;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ViaCepService {
    @GET("ws/{cep}/json/")
    Call<CEP> getCEPInfo(@Path("cep") String cep);
}
