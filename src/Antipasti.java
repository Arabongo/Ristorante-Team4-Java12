import java.util.*;

public class Antipasti {
    private String nome;
    private String ingredienti;
    private Double prezzo;
    private static List<String> NomeAntipasti = new ArrayList<>(Arrays.asList("Affettato", "Vitello Tonnato", "Olive Ascolane", "Cornetti Salati"));
    private static List<String> IngredientiAntipasti = new ArrayList<>(Arrays.asList("Carne mista", "Carne bovina, uova", "Pane, carne bovina, formaggio", "Burro, Carne mista, Semi di Sesamo"));
    private static List<Double> PrezzoAntipasti = new ArrayList<>(Arrays.asList(7.50, 8.50, 6.50, 5.50));

    private void setAntipasti(String nome, String ingredienti, Double prezzo) {
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
    }
    public void Antipasti() {
        System.out.println("Antipasti di carne:" +
                "\n");
        for (int i = 0; i < NomeAntipasti.size();i++) {
            setAntipasti(NomeAntipasti.get(i), IngredientiAntipasti.get(i), PrezzoAntipasti.get(i));
            System.out.println(getNome() +
                    "\n         Ingredienti : " + getIngredienti() +
                    "\n         Prezzo : " + getPrezzo() + " €");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(String ingredienti) {
        this.ingredienti = ingredienti;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

//    public void PrintMenu(){}

//    public static void StampaMenuAntipasti () {
//        FormatMenu(NomeAnitpasti, IngredientiAnitpasti, PrezzoAntipasti);
//    }

//    public void newDish (String Nome, String Ingredienti, Double Prezzo) {
//        NomeAnitpasti.add(Nome);
//        IngredientiAnitpasti.add(Ingredienti);
//        PrezzoAntipasti.add(Prezzo);
//    }
}
