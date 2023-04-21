public class PrimiPiatti extends Piatti {
    public PrimiPiatti(String name, double price, IngredientiPrimiPiatti ingredient) {
        super(name, price, ingredient.getIngredient());
    }

    @Override
    public void print() {
        System.out.println(Colors.BLUE_BRIGHT + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredient() + ")");
    }
}
