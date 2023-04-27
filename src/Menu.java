import java.util.List;

public class Menu {
    private List<Antipasti> antiPastiList;
    private List<PrimiPiatti> primiPiattiList;
    private List<SecondiPiatti> secondiPiattiList;
    private List<Dolci> dolciList;
    private List<Bevande> bevandeList;

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
}