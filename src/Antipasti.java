public class Antipasti extends Piatti {
    public Antipasti(String name, double price, IngredientiAntipasti ingredient) {
        super(name, price, ingredient.getIngredient());
    }

    @Override
    public void print() {
        System.out.println(Colors.BLUE_BRIGHT + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredient() + ")");
    }
}
