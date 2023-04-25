import java.util.Set;

public class SecondiPiatti extends Portata {
    public SecondiPiatti(String name, double price, Set<String> ingredients) {
        super(name, price, ingredients);
    }
    @Override
    public void print() {
        System.out.println(Colors.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
    }
}
