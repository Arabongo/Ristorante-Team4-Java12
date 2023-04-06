import java.util.*;

public class Antipasti {
    private String nome;
    private Double prezzo;
    private static HashMap<String, Double> listaAntipasti = new LinkedHashMap<>();
    private void initListAntipasti(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        listaAntipasti.put(nome, prezzo);
    }
    public void printAntipasti() {
        initListAntipasti("Affettato", 7.50);
        initListAntipasti("Vitello Tonnato", 8.50);
        initListAntipasti("Olive Ascolane", 6.50);
        initListAntipasti("Cornetti Salati", 5.50);
        System.out.println("Antipasti: \n");
        for (Map.Entry<String, Double> Antipasti : listaAntipasti.entrySet()) {
            System.out.println(Antipasti.getKey() + " - " + Antipasti.getValue() + "€\n");
        }
    }
    public String getNome() {
        return nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }
}
