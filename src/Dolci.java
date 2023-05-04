import java.util.Set;

public class Dolci extends Portata {

    //TODO sistemare

    private boolean isGlutenFree;


    public Dolci(String name, double price, Set<IngredientsEnum> ingredients, boolean canBeDishOfTheDay) {
        super(name, price, ingredients, canBeDishOfTheDay);
    }

    @Override
    public void print() {
        if (isSectionStart() == true) {
            System.out.println();
            System.out.println(ColorsEnum.RED_BRIGHT.getValue() + "Dolci:");
        } else {
            isGlutenFree = !this.getIngredients().contains(IngredientsEnum.FARINA);
            System.out.print(ColorsEnum.GREEN_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")" + " is Gluten Free: " + isGlutenFree);
        }
        System.out.println();
    }

    public Dolci(boolean sectionStart) {
        super(sectionStart);
    }
}

