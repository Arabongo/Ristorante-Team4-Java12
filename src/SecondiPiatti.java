import java.util.Set;

public class SecondiPiatti extends Portata {

    private boolean isSpicy;

    public SecondiPiatti(String name, double price, Set<IngredientsEnum> ingredients, boolean isSpicy) {
        super(name, price, ingredients);
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
        if(!isSpicy){
        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
    } else {
            System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")" + ColorsEnum.RED_BRIGHT.getValue() + " Piccante");
        }
    }
}
