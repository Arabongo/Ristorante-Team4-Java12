import java.util.Set;

public class Dolci extends Portata {

    private boolean isGlutenFree;

    public Dolci(String name, double price, Set<IngredientsEnum> ingredients, boolean canBeDishOfTheDay) {
        super(name, price, ingredients, canBeDishOfTheDay, TipoPortataEnum.DOLCI);
    }

    @Override
    public void print() {
            isGlutenFree = !this.getIngredients().contains(IngredientsEnum.FARINA);
            System.out.println(ColorsEnum.GREEN_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")" + " is Gluten Free: " + isGlutenFree);
    }
}

