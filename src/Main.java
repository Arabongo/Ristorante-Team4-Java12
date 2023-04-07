import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /**
         *     antipasti.printAntipasti();
         *         Primi_Piatti primiPiatti = new Primi_Piatti();
         *         primiPiatti.printPrimiPiatti();
         *         SecondiPiatti secondiPiatti = new SecondiPiatti();
         *         secondiPiatti.printSecondiPiatti();
         *         Bevande bevande = new Bevande();
         *         bevande.stampaBevande();
         *         Dolci dolci = new Dolci();
         *         dolci.stampaDolci();
         */



        Antipasti antipasti1 = new Antipasti("Affettato", 7.50);
        Antipasti antipasti2 = new Antipasti("Vitello Tonnato", 8.50);
        Antipasti antipasti3 = new Antipasti("Olive Ascolane", 6.50);
        Antipasti antipasti4 = new Antipasti("Cornetti Salati", 5.50);

        antipasti1.print();
        antipasti2.print();
        antipasti3.print();
        antipasti4.print();

    }
}
