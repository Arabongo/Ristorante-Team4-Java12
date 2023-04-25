public class PrimiPiatti extends Portata {
    public PrimiPiatti(String name, double price, IngredientiPrimiPiatti ingredient) {
        super(name, price, ingredient.getIngredient());
    }

    @Override
    public void print() {
        System.out.println(Colors.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredient() + ")");
    }
}
