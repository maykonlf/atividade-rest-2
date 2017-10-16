package edu.com.unipam.maykon;

import edu.com.unipam.maykon.entidades.CEP;
import edu.com.unipam.maykon.entidades.CNPJ;
import edu.com.unipam.maykon.services.Service;
import edu.com.unipam.maykon.services.ServiceFactory;
import edu.com.unipam.maykon.services.ViaCEP;

import static edu.com.unipam.maykon.services.EnumServices.RECEITA_WS;
import static edu.com.unipam.maykon.services.EnumServices.VIA_CEP;

public class main {
    public static void main(String[] args) {
        Service viaCep = ServiceFactory.createService(VIA_CEP);
        Service receitaWS = ServiceFactory.createService(RECEITA_WS);

        CEP cepInfo = (CEP) viaCep.getInfo("38750000");

        System.out.println("cep:" + cepInfo.getCep());
        System.out.println("uf:" + cepInfo.getUf());
        System.out.println("localidade:" + cepInfo.getLocalidade());
        System.out.println("bairro:" + cepInfo.getBairro());
        System.out.println("complemento:" + cepInfo.getComplemento());


        CNPJ cnpj = (CNPJ) receitaWS.getInfo("23086962000100");

        System.out.println("cnpj:" + cnpj.getCnpj());
        System.out.println("fantasia:" + cnpj.getFantasia());
        System.out.println("nome:" + cnpj.getNome());
        System.out.println("natureza juridica:" + cnpj.getNaturezaJuridica());
    }
}
