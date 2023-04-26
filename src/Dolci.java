import java.util.Set;

public class Dolci extends Portata {
    private boolean isGlutenFree;


    public Dolci(String name, double price, Set<Ingredients> ingredients) {
        super(name, price, ingredients);
    }

    @Override
    public void print(){
        if (getIngredients().equals(Ingredients.FARINA)){
            isGlutenFree = false;
        }else{
            isGlutenFree=true;
        }
        System.out.println(Colors.GREEN_BRIGHT.getValue()+ "- " + getName() +  " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")" + "is Gluten Free: " + isGlutenFree);
    }
}

