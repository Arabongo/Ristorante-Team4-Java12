import java.util.Set;

public class SecondiPiatti extends Portata {

    private boolean isSpicy;

    public SecondiPiatti(String name, double price, Set<IngredientsEnum> ingredients, boolean isSpicy, boolean canBeDishOfTheDay) {
        super(name, price, ingredients, canBeDishOfTheDay);
        this.isSpicy = isSpicy;
    }

    public boolean isSpicy() {
        return isSpicy;
    }
    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }
    @Override
    public void print() {
        if (isSectionStart() == true) {
            System.out.println();
            System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue() + "Secondi Piatti:");
        } else {
            if (!isSpicy) {
                System.out.print(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
            } else {
                System.out.print(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")" + ColorsEnum.RED_BRIGHT.getValue() + " Piccante");
            }
        }
        System.out.println();
    }

    public SecondiPiatti(boolean sectionStart) {
        super(sectionStart);
    }
}
