import java.util.Set;

public class Antipasti extends Portata {
    public Antipasti(String name, double price, Set<Ingredients> ingredient) {
        super(name, price, ingredient);
    }

    @Override
    public void print() {
       System.out.println(Colors.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
    }
}
