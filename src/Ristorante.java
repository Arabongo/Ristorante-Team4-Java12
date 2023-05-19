import enumerati.ColorsEnum;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ristorante {
    private String name;
    private String address;
    private Timestamp openingHours;
    private Timestamp closingHours;
    private Double deliveryPrice;
    private Menu menu;
    private static Integer prenotazioniGiornaliere = 0;
    private Integer postiMassimi;

    //TODO bisogna introdurre cliente e tavoli e dare la possibilità a un cliente vegano di prenotare e visualizzare un menu vegano
    private List<Prenotazione> listaPrenotazioni;

    private Map<Cliente, Tavolo> prenotationMap;
    /**
     * Crea un nuovo ristorante con tutte le informazioni associate, inizializzando anche la lista delle prenotazioni.
     * @param name nome del ristorante
     * @param address indirizzo del ristorante
     * @param openingHours orario di apertura
     * @param closingHours orario di chiusura
     * @param deliveryPrice prezzo di consegna a domicilio
     * @param menu indica il tipo di menu a cui fa riferimento
     */
    public Ristorante(String name, String address, Timestamp openingHours, Timestamp closingHours, Double deliveryPrice, Menu menu, Integer postiMassimi) {
        this.name = name;
        this.address = address;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
        this.deliveryPrice = deliveryPrice;
        this.menu = menu;
        this.listaPrenotazioni = new ArrayList<>();
        this.postiMassimi = postiMassimi;
        this.prenotationMap = new HashMap<>();
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

    public Integer getPostiMassimi() {
        return postiMassimi;
    }

    public void setPostiMassimi(Integer postiMassimi) {
        this.postiMassimi = postiMassimi;
    }

    public List<Prenotazione> getListaPrenotazioni() {
        return listaPrenotazioni;
    }

    public void setListaPrenotazioni(List<Prenotazione> listaPrenotazioni) {
        this.listaPrenotazioni = listaPrenotazioni;
    }

    public Map<Cliente, Tavolo> getPrenotationMap() {
        return prenotationMap;
    }

    public void setPrenotationMap(Map<Cliente, Tavolo> prenotationMap) {
        this.prenotationMap = prenotationMap;
    }

    public static Integer getPrenotazioniGiornaliere() {
        return prenotazioniGiornaliere;
    }

    /**
     * Stampa tutte le info del ristorante e il prezzo medio del menù.
     */
    public void printInfoRistorante() {
        System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue()+ "Ristorante " +
                name + '\n' +
                ColorsEnum.CYAN.getValue() + address + '\n' +
                "Opening hours: " + openingHours + " AM" +
                "\nClosing hours: " + closingHours + " AM" +
                "\nDelivery price: " + deliveryPrice + "$");
        System.out.println("Medium price: " + menu.generateMediumPrice() + "$\n" + "drinks not included");
        menu.printInfoMenu();
        System.out.println();
    }


    /**
     * Aggiunge una prenotazione a "listaPrenotazioni", assegna un indice a ognuna di esse utilizzando come parametro nel
     * costruttore "prenotazioniGiornaliere", che funziona anche da contatore per tener traccia delle prenotazioni di un
     * intero giorno. Alla creazione di una prenotazione, viene tenuta traccia del cliente, del tavolo e viene aggiornata
     * la capienza massima del ristorante.
     */
    public void addPrenotazione(Cliente cliente, Integer Persone, Timestamp data, Tavolo tavolo) {
        if (postiMassimi > tavolo.getNumeroCopertiMassimi()) {
            if (Persone <= tavolo.getNumeroCopertiMassimi()) {
                postiMassimi = postiMassimi - tavolo.getNumeroCopertiMassimi();
                prenotazioniGiornaliere++;
                Prenotazione nuovaPrenotazione = new Prenotazione(cliente.getNome(), Persone, data, prenotazioniGiornaliere, tavolo.getNumeroTavolo(), cliente.getPreferenzaMenu());
                prenotationMap.put(cliente, tavolo);
                System.out.println(ColorsEnum.RESET.getValue() + "Prenotazione effettuata #" + prenotazioniGiornaliere);
                listaPrenotazioni.add(nuovaPrenotazione);
            } else {
                System.out.println("Non sono ci sono abbastanza posti a questo tavolo");
            }
        } else {
            System.out.println("Il ristorante ha raggiunto la sua capienza massima");
        }
    }


    /**
     * Stampa tutte le Prenotazioni presenti nella lista.
     */
    public void printPrenotazioni() {
        System.out.println(ColorsEnum.RESET.getValue() + "\nLista prenotazioni: \n");
        for (Prenotazione prenotazione : listaPrenotazioni) {
            prenotazione.PrintPrenotazione();
        }
        System.out.println();
    }

    /**
     * Rimuove la prenotazione il cui indice corrisponde all'IndicePrenotazione interessato.
     */
    public void removePrenotazione(Integer indicePrenotazione) {
        for (Prenotazione prenotazione : listaPrenotazioni) {
            if (prenotazione.getIndicePrenotazione() == indicePrenotazione) {
                listaPrenotazioni.remove(prenotazione);
            }
        }
        System.out.println(ColorsEnum.RESET.getValue() + "\nPrenotazione #" + indicePrenotazione + " cancellata");
    }
}