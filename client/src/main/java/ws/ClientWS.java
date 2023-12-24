package ws;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();

        System.out.println(proxy.conversionEuroToMad(200));
        Compte cp = proxy.getCompte(2);
        System.out.println("Code= " + cp.getCode());
        System.out.println("Solde= " + cp.getSolde());
        System.out.println("Date Création= " + cp.getDateCreation());

        List<Compte> compteList = proxy.getComptes();

        for(Compte c: compteList){
            System.out.println("---------------Liste des comptes------------");
            System.out.println("Code= " + c.getCode());
            System.out.println("Solde= " + c.getSolde());
            System.out.println("Date Création= " + c.getDateCreation());

        }
    }
}
