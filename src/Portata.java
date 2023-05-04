import java.util.ArrayList;
import java.util.Set;

public abstract class Portata {
    private boolean sectionStart;
    private String name;
    private Double price;
    private Set<IngredientsEnum> ingredients;
    private boolean canBeDishOfTheDay;
    public Portata(String name, Double price, Set<IngredientsEnum> ingredients,boolean canBeDishOfTheDay) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.canBeDishOfTheDay = canBeDishOfTheDay;
    }

    public Portata(boolean sectionStart) {
        this.sectionStart = sectionStart;
    }

    public boolean isCanBeDishOfTheDay() {
        return canBeDishOfTheDay;
    }
    public boolean isSectionStart() {
        return sectionStart;
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

    public Set<IngredientsEnum> getIngredients() {
        return ingredients;
    }
    public void setIngredients(Set<IngredientsEnum> ingredients) {
        this.ingredients = ingredients;
    }

    public abstract void print();
    //TODO rivedere se serve!
}

