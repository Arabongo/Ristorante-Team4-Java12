import java.util.Set;

public class Bevande extends Portata {

    private boolean alcoholic;
    //modify double into Double as per reference
    private Double alcoholPercentage;
    private String sectionTitle;

    public Bevande(String name, Double price, Set<IngredientsEnum> ingredients, boolean alcoholic, Double alcoholPercentage, boolean canBeDishOfTheDay) {
        super(name, price, ingredients, canBeDishOfTheDay);
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
    public String getSectionTitle() {
        return sectionTitle;
    }
    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }
    @Override
    public void print() {
        if (isSectionStart() == true) {
            System.out.println();
            System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + getSectionTitle());
        } else {
            if (alcoholic) {
                System.out.print(ColorsEnum.RED.getValue() + "- " + getName() + " $" + getPrice() + " " + "Percentuale alcolica: " + alcoholPercentage + "%" + " -(Ingredienti: " + getIngredients() + ")");
            } else {
                System.out.print(ColorsEnum.RED.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
            }
        }
        System.out.println();
    }
    public Bevande(boolean sectionStart, String sectionTitle) {
        super(sectionStart);
        this.sectionTitle = sectionTitle;
    }
}
