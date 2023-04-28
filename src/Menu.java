import javax.sound.sampled.Port;
import java.util.List;

public class Menu {

    //TODO di sicuro qui mancano le info, avete mai pensato da dove siamo partiti: avevamo 3 tipi di menù
    //TODO inseriamo un po di funzionalità, prezzo medio, piatti del giorno,
    private List<Portata> portataList;

    public Menu(List<Antipasti> antipastiList, List<PrimiPiatti> primiPiattiList, List<SecondiPiatti> secondiPiattiList, List<Dolci> dolciList, List<Bevande> bevandeList) {
        this.antiPastiList = antipastiList;
        this.primiPiattiList = primiPiattiList;
        this.secondiPiattiList = secondiPiattiList;
        this.dolciList = dolciList;
        this.bevandeList = bevandeList;
    }

    public List<Antipasti> getAntipastiList() {
        return antiPastiList;
    }

    public void setAntipastiList(List<Antipasti> antipastiList) {
        this.antiPastiList = antipastiList;
    }

    public List<PrimiPiatti> getPrimiPiattiList() {
        return primiPiattiList;
    }

    public void setPrimiPiattiList(List<PrimiPiatti> primiPiattiList) {
        this.primiPiattiList = primiPiattiList;
    }

    public List<SecondiPiatti> getSecondiPiattiList() {
        return secondiPiattiList;
    }

    public void setSecondiPiattiList(List<SecondiPiatti> secondiPiattiList) {
        this.secondiPiattiList = secondiPiattiList;
    }

    public List<Dolci> getDolciList() {
        return dolciList;
    }

    public void setDolciList(List<Dolci> dolciList) {
        this.dolciList = dolciList;
    }

    public List<Bevande> getBevandeList() {
        return bevandeList;
    }

    public void setBevandeList(List<Bevande> bevandeList) {
        this.bevandeList = bevandeList;
    }


    public void addPortata(Portata portata){
        portataList.add(portata);
    }
    public void removePortata(Portata portata){
        portataList.remove(portata);
    }
}