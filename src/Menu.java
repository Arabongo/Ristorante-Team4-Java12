import java.util.List;
import java.util.Random;

public class Menu {
    //TODO di sicuro qui mancano le info, avete mai pensato da dove siamo partiti: avevamo 3 tipi di menù
    //TODO inseriamo un po di funzionalità, prezzo medio, piatti del giorno,
    private List<Portata> portataList;

    public Menu (List<Portata> portataList) {
    this.portataList = portataList;
    }

    public void setupPortataList(Menu menu) {
        int dishOfTheDay;
        do {
            dishOfTheDay = new Random().nextInt(menu.getPortataList().size()); //con il + 1 rischia di generare 45, dando un Index Error
        } while (menu.getPortataList().get(dishOfTheDay).isSectionStart() == true || menu.getPortataList().get(dishOfTheDay).isCanBeDishOfTheDay() == false);
        for (Portata portata : menu.getPortataList()) {
            if (dishOfTheDay == menu.getPortataList().indexOf(portata)) {
            System.out.print(ColorsEnum.YELLOW.getValue() + "(Piatto del giorno!) ");
            portata.print();
            } else {
                portata.print();
            }
        }
    }

    public Double generateMediumPrice(Menu menu) {
        Double mediumPrice = 0.0;
        Integer numberOfDish = 0;
        for (Portata portata : menu.getPortataList()) {
            if (portata.getPrice() != null && portata.isCanBeDishOfTheDay() == true) {
                numberOfDish++;
                mediumPrice += portata.getPrice();
            }
        }
        return mediumPrice = Math.floor(mediumPrice / numberOfDish);
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

