

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Antipasti> antipastiList = new ArrayList<>();
        ArrayList<PrimiPiatti> primiPiattiList = new ArrayList<>();
        ArrayList<SecondiPiatti> secondiPiattiList = new ArrayList<>();
        ArrayList<Dolci> dolciList = new ArrayList<>();
        ArrayList<Bevande> bevandeList = new ArrayList<>();

        // Antipasti
        antipastiList.add(new Antipasti("Affettato", 7.50, IngredientiAntipasti.AFFETTATO));
        antipastiList.add(new Antipasti("Vitello Tonnato", 8.50, IngredientiAntipasti.VITELLO_TONNATO));
        antipastiList.add(new Antipasti("Olive Ascolane", 6.50, IngredientiAntipasti.OLIVE_ASCOLANE));
        antipastiList.add(new Antipasti("Cornetti Salati", 5.50, IngredientiAntipasti.CORNETTI_SALATI));
        // Primi Piatti
        primiPiattiList.add(new PrimiPiatti("Bucatini alla Carbonara", 8.99, IngredientiPrimiPiatti.BUCATINI_ALLA_CARBONARA));
        primiPiattiList.add(new PrimiPiatti("Lasagne alla Bolognese", 9.99, IngredientiPrimiPiatti.LASAGNE_ALLA_BOLOGNESE));
        primiPiattiList.add(new PrimiPiatti("Spaghetti all Amatriciana (piatto del giorno)", 8.99, IngredientiPrimiPiatti.SPAGHETTI_ALL_AMATRICIANA));
        primiPiattiList.add(new PrimiPiatti("Risotto alla milanese", 7.99, IngredientiPrimiPiatti.RISOTTO_ALLA_MILANESE));
        primiPiattiList.add(new PrimiPiatti("Pasta alla gricia", 8.99, IngredientiPrimiPiatti.PASTA_ALLA_GRICIA));

        // Secondi Piatti
        secondiPiattiList.add(new SecondiPiatti("Filetto di maiale al forno con salvia e mele",11.99, IngredientiSecondiPiatti.FILETTO_DI_MAIALE));
        secondiPiattiList.add(new SecondiPiatti("Grigliata di carne",13.99, IngredientiSecondiPiatti.GRIGLIATA_DI_CARNE));
        secondiPiattiList.add(new SecondiPiatti("Cotoletta alla milanese ", 7.99, IngredientiSecondiPiatti.COTOLETTA_ALLA_MILANESE));
        secondiPiattiList.add(new SecondiPiatti("Costine d’agnello alla griglia ",10.99, IngredientiSecondiPiatti.COSTINE_AGNELLO));
        secondiPiattiList.add(new SecondiPiatti("Tagliata di manzo con rucola e grana ",13.99, IngredientiSecondiPiatti.TAGLIATA_DI_MANZO));
        secondiPiattiList.add(new SecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco) ",9.99, IngredientiSecondiPiatti.SCALOPPINE));

        // Bevande
        bevandeList.add(new Bevande("Gradisca 0.33l", 3.50));
        bevandeList.add(new Bevande("Gradisca 0.5l", 5.50));
        bevandeList.add(new Bevande("Gradisca 1l", 10));
        bevandeList.add(new Bevande("Midona 0.5l", 5));
        bevandeList.add(new Bevande("Volpina 0.33l", 4));
        bevandeList.add(new Bevande("Volpina 0.5l", 6));
        bevandeList.add(new Bevande("Acqua nat/gas 1l", 1));
        bevandeList.add(new Bevande("Acqua nat/gas 0.5l", 0.5));
        bevandeList.add(new Bevande("Coca Cola 0.5l", 2.50));
        bevandeList.add(new Bevande("Chinotto 0.33l", 12));
        bevandeList.add(new Bevande("Te Pesca 1/2l", 2.5));
        bevandeList.add(new Bevande("Te Limone 1/2l", 2.5));
        bevandeList.add(new Bevande("Succhi di frutta 0.33l", 3.5));
        bevandeList.add(new Bevande("Rosè frizzante", 10.0));
        bevandeList.add(new Bevande("Chardonnat", 13.0));
        bevandeList.add(new Bevande("Merlot", 10.0));
        bevandeList.add(new Bevande("Pinot Noir", 15.0));

        // Dolci
        dolciList.add(new Dolci("Tiramisù al cucchiaio", 9.5));
        dolciList.add(new Dolci("Babà", 10.5));
        dolciList.add(new Dolci("Delizia al limone", 12.0));
        dolciList.add(new Dolci("Cannolo alla ricotta", 8));
        dolciList.add(new Dolci("Tartufo al cioccolato", 9));
        dolciList.add(new Dolci("CheeseCake", 10));


        // Print out the menu
        System.out.println(Colors.YELLOW + "Antipasti:");
        for (Antipasti antipasti : antipastiList) {
            antipasti.print();
        }
        System.out.println();

        System.out.println(Colors.GREEN + "Primi Piatti");
        for (PrimiPiatti primiPiatti : primiPiattiList) {
            primiPiatti.print();
        }
        System.out.println();

        System.out.println(Colors.PURPLE_BRIGHT + "Secondi Piatti:");
        for (SecondiPiatti secondiPiatti : secondiPiattiList) {
            secondiPiatti.print();
        }
        System.out.println();

        System.out.println(Colors.RED_BRIGHT + "Dolci:");
        for (Dolci dolci : dolciList) {
            System.out.println(Colors.GREEN_BRIGHT+ "- " +dolci.getName() +  " $" + dolci.getPrice());
        }
        System.out.println();

        System.out.println(Colors.BLUE_BRIGHT + "Bevande:");
        for (Bevande bevande1 : bevandeList) {
            System.out.println(Colors.RED + "- " + bevande1.getName() + " $" + bevande1.getPrice());
        }
    }
}
