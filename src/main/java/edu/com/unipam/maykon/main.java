package edu.com.unipam.maykon;

import edu.com.unipam.maykon.entidades.CEP;
import edu.com.unipam.maykon.rest.ViaCepService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Retrofit retrofitViaCEP = new Retrofit.Builder()
                .baseUrl("https://viacep.com.br/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ViaCepService viaCepService = retrofitViaCEP.create(ViaCepService.class);
        Call<CEP> cepCall = viaCepService.getCEPInfo("38700001");
        try {
            CEP cepInfo = cepCall.execute().body();
            System.out.println("cep:" + cepInfo.getCep());
            System.out.println("uf:" + cepInfo.getUf());
            System.out.println("localidade:" + cepInfo.getLocalidade());
            System.out.println("bairro:" + cepInfo.getBairro());
            System.out.println("complemento:" + cepInfo.getComplemento());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
