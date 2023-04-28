import java.util.Set;

public class Ristorante {

    //TODO inserire tutte le info del ristorante
    //TODO dividere in pacchetti l'applicazione
    private Menu menu;
    public Ristorante(Menu menu) {
        this.menu = menu;
    }
    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}