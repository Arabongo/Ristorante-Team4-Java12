import java.util.Set;

public class PrimiPiatti extends Portata {
    private String pastaType;

    public PrimiPiatti(String name, double price, Set<IngredientsEnum> ingredients, String pastaType, boolean canBeDishOfTheDay) {
        super(name, price, ingredients, canBeDishOfTheDay, TipoPortataEnum.PRIMI_PIATTI);
        this.pastaType = pastaType;
    }

    @Override
    public void print() {
        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + pastaType + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
    }
}
