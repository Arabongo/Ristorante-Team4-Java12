import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Primi_Piatti {
    private String primiPiatti;
    private Double prezzo;
    private static HashMap<String, Double> listaPrimiPiatti = new LinkedHashMap<>();

    public void initListPrimiPiatti(String primiPiatti, Double prezzo) {
        this.primiPiatti = primiPiatti;
        this.prezzo = prezzo;
        listaPrimiPiatti.put(primiPiatti, prezzo);
    }

    public void printPrimiPiatti() {
        initListPrimiPiatti("Bucatini alla Carbonara", 8.99);
        initListPrimiPiatti("Lasagne alla Bolognese", 9.99);
        initListPrimiPiatti("Spaghetti all'Amatriciana", 8.99);
        initListPrimiPiatti("Risotto alla Milanese", 7.99);
        initListPrimiPiatti("Pasta alla Gricia", 8.99);

        System.out.println("Primi Piatti:\n");
        for (Map.Entry<String, Double> primiPiatti : listaPrimiPiatti.entrySet()) {
            System.out.println(primiPiatti.getKey() + " - " + primiPiatti.getValue() + " €\n");
        }
    }

    public String getPrimiPiatti() {
        return primiPiatti;
    }

    public Double getPrezzo() {
        return prezzo;
    }
}
