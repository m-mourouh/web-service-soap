package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//POOJ: Plain Old Java Object (sample class java that contains only methods)
// History : JavaX -> Jakarta
@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToMad")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt * 11;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, 80000, new Date());
    }
    @WebMethod
    public List<Compte> getComptes(){
        return List.of(
                new Compte(1, 80000, new Date()),
                new Compte(2, 90000, new Date()),
                new Compte(3, 100000, new Date())
        );
    }
}
