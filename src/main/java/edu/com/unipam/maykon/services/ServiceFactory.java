package edu.com.unipam.maykon.services;

public class ServiceFactory {
    public static Service createService(EnumServices serviceType) {
        switch (serviceType) {
            case RECEITA_WS:
                return ReceitaWS.getInstance();
            case VIA_CEP:
                return ViaCEP.getInstance();
            default:
                return null;
        }
    }
}
