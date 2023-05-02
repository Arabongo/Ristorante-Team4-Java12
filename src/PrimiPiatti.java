import java.util.Set;

public class PrimiPiatti extends Portata {

    private boolean isPiattoDelGiorno;

    private String pastaType;

    public PrimiPiatti(String name, double price, Set<IngredientsEnum> ingredients, boolean isPiattoDelGiorno, String pastaType) {
        super(name, price, ingredients);
        this.isPiattoDelGiorno = isPiattoDelGiorno;
        this.pastaType = pastaType;
    }

    @Override
    public void print() {
        if(isPiattoDelGiorno) {
            System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + pastaType + getName() + ColorsEnum.YELLOW.getValue() + " Piatto del Giorno" + ColorsEnum.BLUE_BRIGHT.getValue() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");

        }else {
            System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + pastaType + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
        }
    }
}
