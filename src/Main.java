

import java.awt.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Antipasti> antipastiList = new ArrayList<>();
        ArrayList<PrimiPiatti> primiPiattiList = new ArrayList<>();
        ArrayList<SecondiPiatti> secondiPiattiList = new ArrayList<>();
        ArrayList<Dolci> dolciList = new ArrayList<>();
        ArrayList<Bevande> bevandeList = new ArrayList<>();

        // Antipasti
        antipastiList.add(new Antipasti("Affettato", 7.50));
        antipastiList.add(new Antipasti("Vitello Tonnato", 8.50));
        antipastiList.add(new Antipasti("Olive Ascolane", 6.50));
        antipastiList.add(new Antipasti("Cornetti Salati", 5.50));

        // Primi Piatti
        primiPiattiList.add(new PrimiPiatti("Bucatini alla Carbonara", 8.99));
        primiPiattiList.add(new PrimiPiatti("Lasagne alla Bolognese", 9.99));
        primiPiattiList.add(new PrimiPiatti("Spaghetti all'Amatriciana (piatto del giorno)", 8.99));
        primiPiattiList.add(new PrimiPiatti("Risotto alla milanese", 7.99));
        primiPiattiList.add(new PrimiPiatti("Pasta alla gricia", 8.99));

        // Secondi Piatti
        secondiPiattiList.add(new SecondiPiatti("Filetto di maiale al forno con salvia e mele",11.99 ));
        secondiPiattiList.add(new SecondiPiatti("Grigliata di carne",13.99 ));
        secondiPiattiList.add(new SecondiPiatti("Cotoletta alla milanese ", 7.99));
        secondiPiattiList.add(new SecondiPiatti("Costine d’agnello alla griglia ",10.99));
        secondiPiattiList.add(new SecondiPiatti("Tagliata di manzo con rucola e grana ",13.99));
        secondiPiattiList.add(new SecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco) ",9.99));

        // Dolci
        dolciList.add(new Dolci("Tiramisù al cucchiaio", 9.5));
        dolciList.add(new Dolci("Babà", 10.5));
        dolciList.add(new Dolci("Delizia al limone", 12.0));
        dolciList.add(new Dolci("Cannolo alla ricotta", 8));
        dolciList.add(new Dolci("Tartufo al cioccolato", 9));
        dolciList.add(new Dolci("CheeseCake", 10));


        // Print out the menu
        System.out.println("Antipasti:");
        for (Antipasti antipasti : antipastiList) {
            System.out.println("- " + antipasti.getName() + " $" + antipasti.getPrice());
        }
        System.out.println();

        System.out.println("Primi Piatti");
        for (PrimiPiatti primiPiatti : primiPiattiList) {
            System.out.println("- " +primiPiatti.getName() + " $" + primiPiatti.getPrice());
        }
        System.out.println();

        System.out.println("Secondi Piatti:");
        for (SecondiPiatti secondiPiatti : secondiPiattiList) {
            System.out.println("- " + secondiPiatti.getName() + " $" + secondiPiatti.getPrice());
        }
        System.out.println();

        System.out.println(Colors.RED_BRIGHT + "Dolci:");
        for (Dolci dolci : dolciList) {
            System.out.println(Colors.GREEN_BRIGHT+ "- " +dolci.getName() +  " $" + dolci.getPrice());
        }
        System.out.println();

        System.out.println("Bevande:");
        for (Bevande bevande1 : bevandeList) {
            System.out.println("- " + bevande1.getName() + " $" + bevande1.getPrice());
        }
    }
}
