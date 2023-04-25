public class Dolci extends Portata {

    public Dolci(String name, double price, IngredientiDolci ingredients) {
        super(name, price, ingredients.getIngredients());
    }
    @Override
    public void print(){
        System.out.println(Colors.GREEN_BRIGHT.getValue()+ "- " + getName() +  " $" + getPrice() + " -(Ingredienti: " + getIngredient() + ")");
    }
}

