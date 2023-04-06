import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SecondiPiatti {

    private String secondoPiatto;

    private Double prezzo;


    private static HashMap<String, Double> listaSecondiPiatti = new LinkedHashMap<>();

    public void initListSecondiPiatti(String secondoPiatto, Double prezzo) {
        this.secondoPiatto = secondoPiatto;
        this.prezzo = prezzo;
        listaSecondiPiatti.put(secondoPiatto, prezzo);
    }

    public void printSecondiPiatti() {
        initListSecondiPiatti("Filetto di maiale al forno con salvia e mele", 11.99);
        initListSecondiPiatti("Grigliata di carne", 13.99);
        initListSecondiPiatti("Cotoletta alla milanese", 7.99);
        initListSecondiPiatti("Costine d’agnello alla griglia", 10.99);
        initListSecondiPiatti("Tagliata di manzo con rucola e grana", 13.99);
        initListSecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco)", 9.99);

        System.out.println("\nSecondi Piatti:\n");
        for (Map.Entry<String, Double> secondoPiatto : listaSecondiPiatti.entrySet()) {
            System.out.println(secondoPiatto.getKey() + " - " + secondoPiatto.getValue() + " €\n");
        }
    }

    public String getsecondoPiatto() {
        return secondoPiatto;
    }

    public Double getPrezzo() {
        return prezzo;
    }

}
