import java.util.Set;

public class Dolci extends Portata {

    //TODO sistemare

    private boolean isGlutenFree;


    public Dolci(String name, double price, Set<Ingredients> ingredients) {
        super(name, price, ingredients);
    }

    @Override
    public void print(){
        isGlutenFree = !this.getIngredients().contains(Ingredients.FARINA);
        System.out.println(Colors.GREEN_BRIGHT.getValue()+ "- " + getName() +  " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")" + " is Gluten Free: " + isGlutenFree);
    }
}

