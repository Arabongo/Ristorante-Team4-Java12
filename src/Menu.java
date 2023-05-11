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
        Double mediumPriceAntipasto = 0.0;
        Double mediumPricePrimoPiatto = 0.0;
        Double mediumPriceSecondoPiatto = 0.0;
        Double mediumPriceDolci = 0.0;
        Integer numberOfDishAntipasti = 0;
        Integer numberOfDishPrimiPiatti = 0;
        Integer numberOfDishSecondoPiatto = 0;
        Integer numberOfDishDolci = 0;
        for (Portata portata : this.getPortataList()) {
            switch(portata.getTipoPiattoEnum()){
                case ANTIPASTO -> mediumPriceAntipasto += portata.getPrice();
                case PRIMI_PIATTI -> mediumPricePrimoPiatto += portata.getPrice();
                case SECONDI_PIATTI -> mediumPriceSecondoPiatto += portata.getPrice();
                case DOLCI -> mediumPriceDolci += portata.getPrice();
            }
            switch(portata.getTipoPiattoEnum()){
                case ANTIPASTO -> numberOfDishAntipasti++;
                case PRIMI_PIATTI -> numberOfDishPrimiPiatti++;
                case SECONDI_PIATTI -> numberOfDishSecondoPiatto++;
                case DOLCI -> numberOfDishDolci++;
            }
        }
        return Math.floor(mediumPriceAntipasto/numberOfDishAntipasti + mediumPricePrimoPiatto/numberOfDishPrimiPiatti + mediumPriceSecondoPiatto/numberOfDishSecondoPiatto + mediumPriceDolci/numberOfDishDolci);
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

