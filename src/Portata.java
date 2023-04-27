import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Portata {
    private String name;
    private double price;
    private Set <Ingredients> ingredients;

    public Portata(String name, double price, Set <Ingredients> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        }
    public void print () {
        System.out.println(name + price + ingredients);
    }

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
    public void addIngredients(Ingredients ingredient) {
        ingredients.add(ingredient);
    }
    public void removeIngredients(Ingredients ingredient) {
        ingredients.remove(ingredient);
    }

    public Set<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}

