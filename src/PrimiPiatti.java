import java.util.Set;

public class PrimiPiatti extends Portata {


    public PrimiPiatti(String name, double price, Set<Ingredients> ingredients) {
        super(name, price, ingredients);
    }

    @Override
    public void print() {
        System.out.println(Colors.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
        //aggiungere random per simulare piatto del giorno
    }
}
