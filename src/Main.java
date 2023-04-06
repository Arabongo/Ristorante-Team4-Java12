package src;
public class Main {

    public static void main(String[] args) {

        Antipasti antipasti = new Antipasti();
        antipasti.printAntipasti();

        SecondiPiatti secondiPiatti = new SecondiPiatti();
        secondiPiatti.printSecondiPiatti();
        Bevande bevande = new Bevande();
        bevande.stampaBevande();
    }
}
