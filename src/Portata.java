import java.util.Set;

public class Portata {
    private String name;
    private Double price;
    private Set <IngredientsEnum> ingredients;

    public Portata(String name, Double price, Set <IngredientsEnum> ingredients) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void addIngredients(IngredientsEnum ingredient) {
        ingredients.add(ingredient);
    }
    public void removeIngredients(IngredientsEnum ingredient) {
        ingredients.remove(ingredient);
    }

    public Set<IngredientsEnum> getIngredients() {
        return ingredients;
    }

    //TODO rivedere se serve!
    public void setIngredients(Set<IngredientsEnum> ingredients) {
        this.ingredients = ingredients;
    }
}

