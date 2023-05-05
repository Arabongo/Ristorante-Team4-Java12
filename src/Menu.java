import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Portata> portataList;

    //TODO passare tutte le info per stampare un menù : nome chef tipo ecc ecc

    public Menu() {
        this.portataList = new ArrayList<>();
    }

    public void printInfoMenu() {
        System.out.println(ColorsEnum.YELLOW.getValue() + "\nAntipasti:");
        portataList.stream().filter( portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.ANTIPASTO).forEach(primo -> primo.print());
        System.out.println(ColorsEnum.GREEN.getValue() + "\nPrimi Piatti:");
        portataList.stream().filter(portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.PRIMI_PIATTI).forEach(secondo -> secondo.print());
        System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue() + "\nSecondi Piatti:");
        portataList.stream().filter(portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.SECONDI_PIATTI).forEach(dessert -> dessert.print());
        System.out.println(ColorsEnum.RED_BRIGHT.getValue() + "\nDolci:");
        portataList.stream().filter(portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.DOLCI).forEach(bevanda -> bevanda.print());
        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + "\n Becvande:");
        portataList.stream().filter(portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.BEVANDE).forEach(bevanda -> bevanda.print());
    }

    //TODO sistemare
    public Double generateMediumPrice() {
        Double mediumPrice = 0.0;
        Integer numberOfDish = 0;
        for (Portata portata : this.getPortataList()) {
            if (portata.isCanBeDishOfTheDay() == true) {
                numberOfDish++;
                mediumPrice += portata.getPrice();
            }
        }
        return Math.floor(mediumPrice / numberOfDish);
    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    public void removePortata(Portata portata) {
        portataList.remove(portata);
    }

    public List<Portata> getPortataList() {
        return portataList;
    }
}

