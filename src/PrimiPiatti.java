import java.util.Set;

public class PrimiPiatti extends Portata {
    private String pastaType;

    public PrimiPiatti(String name, double price, Set<IngredientsEnum> ingredients, String pastaType, boolean canBeDishOfTheDay) {
        super(name, price, ingredients, canBeDishOfTheDay);
        this.pastaType = pastaType;
    }

    @Override
    public void print() {
        if (isSectionStart() == true) {
            System.out.println();
            System.out.println(ColorsEnum.GREEN.getValue() + "Primi Piatti:");
        } else {
                System.out.print(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + pastaType + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
            }
        System.out.println();
    }

}
