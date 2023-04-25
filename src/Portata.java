import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Portata {
    private String name;
    private double price;
    private Set <String> ingredients;

    public Portata(String name, double price, Set <String> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = new HashSet<>();
        }
    public void print () {
        System.out.println(name + price + ingredients);
    }

    //Fare un override per le proprie classi per il metodo print

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void addIngredients(String ingredient) {
        ingredients.add(ingredient);
    }
    public void removeIngredients(String ingredient) {
        ingredients.remove(ingredient);
    }

    public Set<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<String> ingredients) {
        this.ingredients = ingredients;
    }
}

