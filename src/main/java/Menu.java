import enumerati.ColorsEnum;
import enumerati.TipoMenuEnum;
import enumerati.TipoPortataEnum;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<Portata> portataList;

    private TipoMenuEnum tipoMenu;

    /**
     * Crea una nuova lista Menu in cui inserire le portate.
     * @param tipoMenu indica la tipologia del menù in questione.
     */
    public Menu(TipoMenuEnum tipoMenu) {
        this.tipoMenu = tipoMenu;
        this.portataList = new ArrayList<>();
    }
    /**
     * Stampa l'intero menù, dividendolo nelle relativi sezioni attraverso gli stream,
     * utilizzando il parametro di ogni portata TipoPortataEnum per filtrare le portate.
     */
    public void printInfoMenu() {
        System.out.println(ColorsEnum.RED_BRIGHT.getValue() +"\n"+tipoMenu.getTipoMenu().toUpperCase());
        System.out.println(ColorsEnum.YELLOW.getValue() + "\nAntipasti:");
        portataList.stream().filter(portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.ANTIPASTO).forEach(primo -> primo.print());
        System.out.println(ColorsEnum.GREEN.getValue() + "\nPrimi Piatti:");
        portataList.stream().filter(portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.PRIMI_PIATTI).forEach(secondo -> secondo.print());
        System.out.println(ColorsEnum.CYAN.getValue() + "\nSecondi Piatti:");
        portataList.stream().filter(portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.SECONDI_PIATTI).forEach(dessert -> dessert.print());
        System.out.println(ColorsEnum.RED_BRIGHT.getValue() + "\nDolci:");
        portataList.stream().filter(portata -> portata.getTipoPiattoEnum() == TipoPortataEnum.DOLCI).forEach(bevanda -> bevanda.print());
        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + "\nBecvande:");
        System.out.println(ColorsEnum.GREEN_BRIGHT.getValue() + "Birre:");
        portataList.stream().filter(portata -> portata.getTipoMenuEnum() == TipoMenuEnum.BIRRE).forEach(bevanda -> bevanda.print());
        System.out.println(ColorsEnum.GREEN_BRIGHT.getValue() + "\nSoft Drink:");
        portataList.stream().filter(portata -> portata.getTipoMenuEnum() == TipoMenuEnum.SOFT_DRINK).forEach(bevanda -> bevanda.print());
        System.out.println(ColorsEnum.GREEN_BRIGHT.getValue() + "\nVini:");
        portataList.stream().filter(portata -> portata.getTipoMenuEnum() == TipoMenuEnum.CARTA_VINI).forEach(bevanda -> bevanda.print());
    }

    /**
     * Prende in considerazione il prezzo medio di tutte le sezioni delle portate, generando
     * il prezzo medio relativo a un menù.
     */
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
            switch (portata.getTipoPiattoEnum()) {
                case ANTIPASTO -> mediumPriceAntipasto += portata.getPrice();
                case PRIMI_PIATTI -> mediumPricePrimoPiatto += portata.getPrice();
                case SECONDI_PIATTI -> mediumPriceSecondoPiatto += portata.getPrice();
                case DOLCI -> mediumPriceDolci += portata.getPrice();
            }
            switch (portata.getTipoPiattoEnum()) {
                case ANTIPASTO -> numberOfDishAntipasti++;
                case PRIMI_PIATTI -> numberOfDishPrimiPiatti++;
                case SECONDI_PIATTI -> numberOfDishSecondoPiatto++;
                case DOLCI -> numberOfDishDolci++;
            }
        }
        return Math.floor(mediumPriceAntipasto / numberOfDishAntipasti + mediumPricePrimoPiatto / numberOfDishPrimiPiatti + mediumPriceSecondoPiatto / numberOfDishSecondoPiatto + mediumPriceDolci / numberOfDishDolci);
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

    public TipoMenuEnum getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(TipoMenuEnum tipoMenu) {
        this.tipoMenu = tipoMenu;
    }
}

