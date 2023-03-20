import proxy.BanqueService;
import proxy.BanqueWS;

public class clientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        double montant  = 1000;
        System.out.println("le montant "+montant+" $ en DH est "+stub.convert(montant));
        stub.listCompte().stream().forEach(compte -> System.out.println(compte.getCode() + " a la solde "+ compte.getSold()));
    }
}
