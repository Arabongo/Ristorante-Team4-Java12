import java.util.Set;

public abstract class Portata {
    private String name;
    private Double price;
    private Set<IngredientsEnum> ingredients;
    private boolean canBeDishOfTheDay;
    private TipoPortataEnum tipoPiattoEnum;
    private TipoMenuEnum tipoMenuEnum;
    public Portata(String name, Double price, Set<IngredientsEnum> ingredients, boolean canBeDishOfTheDay, TipoPortataEnum tipoPiattoEnum, TipoMenuEnum tipoMenuEnum) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.canBeDishOfTheDay = canBeDishOfTheDay;
        this.tipoPiattoEnum = tipoPiattoEnum;
        this.tipoMenuEnum=tipoMenuEnum;
    }
    public boolean isCanBeDishOfTheDay() {
        return canBeDishOfTheDay;
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

    public TipoPortataEnum getTipoPiattoEnum() {
        return tipoPiattoEnum;
    }
    public Set<IngredientsEnum> getIngredients() {
        return ingredients;
    }
    public void setIngredients(Set<IngredientsEnum> ingredients) {
        this.ingredients = ingredients;
    }

    public TipoMenuEnum getTipoMenuEnum() {
        return tipoMenuEnum;
    }

    public void setTipoMenuEnum(TipoMenuEnum tipoMenuEnum) {
        this.tipoMenuEnum = tipoMenuEnum;
    }

    //TODO deve stampare le info dei suoi field, poi ogni metodo figlio aggiungerà personalizzazioni
    public void print(){
    }
}

