import java.util.Set;

public abstract class Portata {
    private boolean sectionStart;
    private String name;
    private Double price;
    private Set<IngredientsEnum> ingredients;
    private boolean canBeDishOfTheDay;

    private TipoPortataEnum tipoPiattoEnum;
    public Portata(String name, Double price, Set<IngredientsEnum> ingredients, boolean canBeDishOfTheDay, TipoPortataEnum tipoPiattoEnum) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.canBeDishOfTheDay = canBeDishOfTheDay;
        this.tipoPiattoEnum = tipoPiattoEnum;
        //TODO qui dobbiamo inserire il tipo di piatto: TipoPiattoEnum, sistemiamo!!!!

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

    //TODO deve stampare le info dei suoi field, poi ogni metodo figlio aggiungerà personalizzazioni
    public abstract void print();
}

