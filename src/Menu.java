import java.util.ArrayList;


public class Menu {
    private ArrayList<Antipasti> antipasti= new ArrayList<>();
    private ArrayList<Primi_Piatti> primiPiatti= new ArrayList<>();
    private ArrayList<SecondiPiatti> secondiPiatti= new ArrayList<>();
    private ArrayList<Bevande> bevande= new ArrayList<>();
    private final ArrayList <Dolci> dolci= new ArrayList<>();

    public Menu(){
    }
    public  void addDolci(Dolci dolce){
       dolci.add(dolce);
    }
    public  void addAntipasti(Antipasti antipasto){
        antipasti.add(antipasto);
    }
    public  void addBevande(Bevande bevanda){
        bevande.add(bevanda);
    }
    public  void addPrimiPiatti(Primi_Piatti primoPiatto){
        primiPiatti.add(primoPiatto);
    }
    public void printDolci(){
        for (Dolci dolci:dolci) {
            System.out.println(dolci.getName()+ ' ' + dolci.getPrice());
        }
    }
    public void printAntipasti(){
        for (Antipasti antipasto : antipasti) {
            System.out.println(antipasto.getNome() + ' ' + antipasto.getPrezzo());
        }
    }
    public void printPrimiPiatti(){
        for (Primi_Piatti primo : primiPiatti) {
            System.out.println(primo.getPrimiPiatti()+ ' ' + primo.getPrezzo());
        }
    }
    public void printSecondipiatti(){
        for (SecondiPiatti secondo:secondiPiatti) {
            System.out.println(secondo.getsecondoPiatto()+ ' ' + secondo.getPrezzo());
        }
    }
    public void printBevande(){
        for (Bevande bevanda:bevande) {
            System.out.println(bevanda.getNomeBevanda()+ ' ' + bevanda.getPrezzoBevanda());
        }
    }
    public void printMenu(){
        printAntipasti();
        printPrimiPiatti();
        printSecondipiatti();
        printDolci();
        printBevande();
    }
}
