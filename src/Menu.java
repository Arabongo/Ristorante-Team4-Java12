import javax.sound.sampled.Port;
import java.util.List;
import java.util.Random;

public class Menu {
    //TODO di sicuro qui mancano le info, avete mai pensato da dove siamo partiti: avevamo 3 tipi di menù
    //TODO inseriamo un po di funzionalità, prezzo medio, piatti del giorno,
    private List<Portata> portataList;
    public Menu (List<Portata> portataList) {
    this.portataList = portataList;
    }
    public void addPortata(Portata portata){
        portataList.add(portata);
    }
    public void removePortata(Portata portata){
        portataList.remove(portata);
    }
    public List<Portata> getPortataList() {
        return portataList;
    }
    public void setPortataList(List<Portata> portataList) {
        this.portataList = portataList;
    }
}

