public class Main {

    public static void main(String[] args) {
        Antipasti antipasti = new Antipasti();
        antipasti.printAntipasti();
        Primi_Piatti primiPiatti = new Primi_Piatti();
        primiPiatti.printPrimiPiatti();
        SecondiPiatti secondiPiatti = new SecondiPiatti();
        secondiPiatti.printSecondiPiatti();
        Bevande bevande = new Bevande();
        bevande.stampaBevande();
        Dolci dolci = new Dolci();
        dolci.stampaDolci();
    }
}
