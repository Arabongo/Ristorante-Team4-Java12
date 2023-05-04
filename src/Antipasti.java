import java.util.Set;

public class Antipasti extends Portata {

    //TODO usiamo sempre gli oggetti
    //modified int into Integer
    private Integer portions;
    private boolean localProduct;
    public Antipasti(String name, Double price, Set<IngredientsEnum> ingredient, boolean localProduct, Integer portions, boolean canBeDishOfTheDay) {
        super(name, price, ingredient, canBeDishOfTheDay);
        this.localProduct = localProduct;
        this.portions = portions;
    }
    @Override
    public void print() {
        if (isSectionStart() == true) {
            System.out.println(ColorsEnum.YELLOW.getValue() + "Antipasti:");
        } else {
                System.out.print(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ") ");
                if (getLocalProduct() == true) {
                System.out.print("Prodotto locale a Km zero; ");
                } if (portions > 1) {
                System.out.print("Piatto per " + getPortions() + " persone;");
                }
        }
        System.out.println();
    }

    //TODO mettiamo il setter//Fatto!
    public Integer getPortions() {
        return portions;
    }

    public void setPortions(Integer portions) {
        this.portions = portions;
    }

    public void setLocalProduct(boolean localProduct) {
        this.localProduct = localProduct;
    }

    public boolean getLocalProduct() {
        return localProduct;
    }

    public Antipasti(boolean sectionStart) {
        super(sectionStart);
    }
}
