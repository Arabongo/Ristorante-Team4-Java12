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


        Menu menu = new Menu();
        Antipasti antipasti1 = new Antipasti("Affettato", 7.50);
        Antipasti antipasti2 = new Antipasti("Vitello Tonnato", 8.50);
        Antipasti antipasti3 = new Antipasti("Olive Ascolane", 6.50);
        Antipasti antipasti4 = new Antipasti("Cornetti Salati", 5.50);

        antipasti1.print();
        antipasti2.print();
        antipasti3.print();
        antipasti4.print();


        Dolci dolci1= new Dolci ("Panna Cotta", 8.5 , "Panna,Gelatina,Zucchero,Vaniglia");
        Dolci dolci2= new Dolci("Tiramisù al cucchiaio", 9.0, "Mascarpone,Zucchero,Caffè,Savoiardi,Uova");
        Dolci dolci3= new Dolci("Frutta di stagione", 6.0, "Kiwi,Anguria,Fragole,Arance");
        Dolci dolci4= new Dolci("Babà alla crema", 10.0, "Uova,Latte,Farina,Zucchero,Lievito,Burro,Rum");
        Dolci dolci5= new Dolci("Delizia al Limone", 12.5, "Uova,Farina,Zucchero,Vaniglia,Panna,Limone,Latte");
        menu.addDolci(dolci1);
        menu.addDolci(dolci2);
        menu.addDolci(dolci3);
        menu.addDolci(dolci4);
        menu.addDolci(dolci5);
        menu.printMenu();




    }
}
