

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Antipasti> antipastiList = new ArrayList<>();
        ArrayList<PrimiPiatti> primiPiattiList = new ArrayList<>();
        ArrayList<SecondiPiatti> secondiPiattiList = new ArrayList<>();
        ArrayList<Dolci> dolciList = new ArrayList<>();
        ArrayList<Bevande> bevandeList = new ArrayList<>();

        // Primi Piatti
        primiPiattiList.add(new PrimiPiatti("Bucatini alla Carbonara", 8.99));
        primiPiattiList.add(new PrimiPiatti("Lasagne alla Bolognese", 9.99));
        primiPiattiList.add(new PrimiPiatti("Spaghetti all'Amatriciana (piatto del giorno)", 8.99));
        primiPiattiList.add(new PrimiPiatti("Risotto alla milanese", 7.99));
        primiPiattiList.add(new PrimiPiatti("Pasta alla gricia", 8.99));


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

        System.out.println("Dolci:");
        for (Dolci dolci : dolciList) {
            System.out.println("- " + dolci.getName() + " $" + dolci.getPrice());
        }
        System.out.println();

        System.out.println("Bevande:");
        for (Bevande bevande1 : bevandeList) {
            System.out.println("- " + bevande1.getName() + " $" + bevande1.getPrice());
        }
    }
}
