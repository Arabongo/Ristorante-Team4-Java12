public class SecondiPiatti extends Piatti {
    public SecondiPiatti(String name, double price, IngredientiSecondiPiatti ingredient) {
        super(name, price, ingredient.getIngredient());
    }

    @Override
    public void print() {
        System.out.println(Colors.CYAN.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredient() + ")");
    }
}
