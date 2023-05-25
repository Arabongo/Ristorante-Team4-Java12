import java.util.ArrayList;
import java.util.List;

public class PrimiPiattiDAO {
    private List<PrimiPiatti> primiPiattiList;

    public PrimiPiattiDAO() {
        primiPiattiList = new ArrayList<>();
    }

    public void addPrimiPiatti(PrimiPiatti primiPiatti) {
        primiPiattiList.add(primiPiatti);
    }

    public void removePrimiPiatti(PrimiPiatti primiPiatti) {
        primiPiattiList.remove(primiPiatti);
    }

    public List<PrimiPiatti> getAllPrimiPiatti() {
        return primiPiattiList;
    }

    public PrimiPiatti getPrimiPiattiByName(String name) {
        for (PrimiPiatti primiPiatti : primiPiattiList) {
            if (primiPiatti.getName().equals(name)) {
                return primiPiatti;
            }
        }
        return null;
    }
}

