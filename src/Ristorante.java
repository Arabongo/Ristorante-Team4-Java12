import java.util.Set;

public class Ristorante {
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