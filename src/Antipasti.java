import java.lang.constant.Constable;
import java.util.Set;

public class Antipasti extends Portata {
    private int portions;
    private boolean localProduct;
    public Antipasti(String name, double price, Set<Ingredients> ingredient, boolean localProduct, int portions) {
        super(name, price, ingredient);
        this.localProduct = localProduct;
        this.portions = portions;
    }

    @Override
    public void print() {
        System.out.print(Colors.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ") ");
        if (getLocalProduct() == true) {
            System.out.print("Prodotto locale a Km zero; ");
        } if (portions > 1) {
            System.out.print("Piatto per " + getPortions() + " persone;");
        }
        System.out.println();
    }
    public int getPortions() {
        return portions;
    }
    public boolean getLocalProduct() {
        return localProduct;
    }
}
