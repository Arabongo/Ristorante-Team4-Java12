import java.util.Set;

public class PrimiPiatti extends Portata {

    private boolean isPiattoDelGiorno;

    private String pastaType;

    public PrimiPiatti(String name, double price, Set<Ingredients> ingredients, boolean isPiattoDelGiorno, String pastaType) {
        super(name, price, ingredients);
        this.isPiattoDelGiorno = isPiattoDelGiorno;
        this.pastaType = pastaType;
    }

    @Override
    public void print() {
        if(isPiattoDelGiorno) {
            System.out.println(Colors.BLUE_BRIGHT.getValue() + "- " + pastaType + getName() + Colors.YELLOW.getValue() + " Piatto del Giorno" + Colors.BLUE_BRIGHT.getValue() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");

        }else {
            System.out.println(Colors.BLUE_BRIGHT.getValue() + "- " + pastaType + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
        }
    }
}
