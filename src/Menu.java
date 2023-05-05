import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {
    private List<Portata> portataList;

    //TODO passare tutte le info per stampare un menù : nome chef tipo ecc ecc

    public Menu() {
        this.portataList = new ArrayList<>();
    }

    public void setupPortataList() {

        System.out.println(ColorsEnum.ANSI_RED_BACKGROUND.getValue() +
                ColorsEnum.EMOJY_FIRE.getValue() + ColorsEnum.ANSI_BOLD.getValue() + ColorsEnum.ANSI_BLACK.getValue() + getRestaurantName() +
                TextStyleEnum.EMOJY_FIRE.getValue() + TextStyleEnum.ANSI_RESET.getValue() + "\n");
        System.out.println("Chef: " + getChefName() + "\n");
        System.out.println(getDescription() + "\n");
        System.out.println("\n PRIMI \n");
        portataList.stream().filter(primo -> primo.getTipoPortata() == TipoPortataEnum.PRIMO).forEach(primo -> primo.printInfo());
        System.out.println("\n SECONDI \n");
        portataList.stream().filter(secondo -> secondo.getTipoPortata() == TipoPortataEnum.SECONDO).forEach(secondo -> secondo.printInfo());
        System.out.println("\n DESSERT \n");
        portataList.stream().filter(dessert -> dessert.getTipoPortata() == TipoPortataEnum.DESSERT).forEach(dessert -> dessert.printInfo());
        System.out.println("\n BEVANDE \n");
        portataList.stream().filter(bevanda -> bevanda.getTipoPortata() == TipoPortataEnum.BEVANDA).forEach(bevanda -> bevanda.printInfo());
        System.out.println("\n BUON APPETITO!!!");


        int dishOfTheDay;
        do {
            dishOfTheDay = new Random().nextInt(menu.getPortataList().size()); //con il + 1 rischia di generare 45, dando un Index Error
        } while (this.getPortataList().get(dishOfTheDay).isSectionStart() == true ||
                this.getPortataList().get(dishOfTheDay).isCanBeDishOfTheDay() == false);
        for (Portata portata : menu.getPortataList()) {
            if (dishOfTheDay == menu.getPortataList().indexOf(portata)) {
                System.out.print(ColorsEnum.YELLOW.getValue() + "(Piatto del giorno!) ");
                portata.print();
            } else {
                portata.print();
            }
        }
    }

    //TODO sistemare
    public Double generateMediumPrice(Menu menu) {
        Double mediumPrice = 0.0;
        Integer numberOfDish = 0;
        for (Portata portata : menu.getPortataList()) {
            if (portata.getPrice() != null && portata.isCanBeDishOfTheDay() == true) {
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

