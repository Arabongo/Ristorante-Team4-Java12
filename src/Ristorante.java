import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String name;
    private String address;
    private Timestamp openingHours;
    private Timestamp closingHours;
    private Double deliveryPrice;
    private Menu menu;
    private Integer prenotazioniGiornaliere = 0;

    private List<Prenotazione> listaPrenotazioni = new ArrayList<>();

    public Ristorante(String name, String address, Timestamp openingHours, Timestamp closingHours, Double deliveryPrice, Menu menu) {
        this.name = name;
        this.address = address;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
        this.deliveryPrice = deliveryPrice;
        this.menu = menu;
    }

    public void printInfoRistorante() {
        System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue()+ "Ristorante " +
                name + '\n' +
                ColorsEnum.CYAN.getValue() + address + '\n' +
                "Opening hours: " + openingHours + " AM" +
                "\nClosing hours: " + closingHours + " AM" +
                "\nDelivery price: " + deliveryPrice + "$");
        System.out.println("Medium price: " + menu.generateMediumPrice() + "$\n");
        menu.printInfoMenu();
        System.out.println();
    }

    public void addPrenotazione(String nome, Integer Persone, String data, String ora) {
        prenotazioniGiornaliere++;
        Prenotazione nuovaPrenotazione = new Prenotazione(nome, Persone, data, ora, prenotazioniGiornaliere);
        listaPrenotazioni.add(nuovaPrenotazione);
        System.out.println(ColorsEnum.RESET.getValue() + "Prenotazione effettuata #" + prenotazioniGiornaliere);
    }

    public void printPrenotazioni() {
            System.out.println(ColorsEnum.RESET.getValue() + "\nLista prenotazioni: \n");
            for (Prenotazione prenotazione : listaPrenotazioni) {
                System.out.println(prenotazione);
        }
            System.out.println();
    }

    public void removePrenotazione(Integer indicePrenotazione) {
        for (Prenotazione prenotazione : listaPrenotazioni) {
            if (prenotazione.getIndicePrenotazione() == indicePrenotazione) {
                listaPrenotazioni.remove(prenotazione);
            }
        }
        System.out.println(ColorsEnum.RESET.getValue() + "\nPrenotazione #" + indicePrenotazione + " cancellata");
    }

    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(Timestamp openingHours) {
        this.openingHours = openingHours;
    }

    public Timestamp getClosingHours() {
        return closingHours;
    }

    public void setClosingHours(Timestamp closingHours) {
        this.closingHours = closingHours;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }
}