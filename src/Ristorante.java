public class Ristorante {
    private String name;
    private String address;
    private Double openingHours;
    private Double closingHours;
    private Double deliveryPrice;
    //TODO inserire tutte le info del ristorante
    //TODO dividere in pacchetti l'applicazione
    private Menu menu;
    public Ristorante(String name, String address, Double openingHours, Double closingHours, Double deliveryPrice, Menu menu) {
        this.name = name;
        this.address = address;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
        this.deliveryPrice = deliveryPrice;
        this.menu = menu;
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

    public Double getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(Double openingHours) {
        this.openingHours = openingHours;
    }

    public Double getClosingHours() {
        return closingHours;
    }

    public void setClosingHours(Double closingHours) {
        this.closingHours = closingHours;
    }

    public Double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(Double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public void printMenu(Menu menu){
        getMenu().printPortataList(menu);
    }
}