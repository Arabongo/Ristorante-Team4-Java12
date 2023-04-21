public class Dolci extends Piatti {

    public Dolci(String name, double price, IngredientiDolci ingredients) {
        super(name, price, ingredients.getIngredients());
    }
    @Override
    public void print(){
        System.out.println(Colors.GREEN_BRIGHT.getValue()+ "- " + getName() +  " $" + getPrice());
    }
}

