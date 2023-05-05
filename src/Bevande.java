import java.util.Set;

public class Bevande extends Portata {

    private boolean alcoholic;
    private Double alcoholPercentage;

    public Bevande(String name, Double price, Set<IngredientsEnum> ingredients, boolean alcoholic, Double alcoholPercentage, boolean canBeDishOfTheDay) {
        super(name, price, ingredients, canBeDishOfTheDay, TipoPortataEnum.BEVANDE);
        this.alcoholic = alcoholic;
        this.alcoholPercentage = alcoholPercentage;
    }
    public boolean isAlcoholic() {
        return alcoholic;
    }
    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }
    public Double getAlcoholPercentage() {
        return alcoholPercentage;
    }
    public void setAlcoholPercentage(Double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }
    @Override
    public void print() {
        if (alcoholic) {
            System.out.println(ColorsEnum.RED.getValue() + "- " + getName() + " $" + getPrice() + " " + "Percentuale alcolica: " + alcoholPercentage + "%" + " -(Ingredienti: " + getIngredients() + ")");
        } else {
            System.out.println(ColorsEnum.RED.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
        }
    }
}
