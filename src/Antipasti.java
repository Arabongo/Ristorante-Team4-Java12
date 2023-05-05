import java.util.Set;

public class Antipasti extends Portata {

    //modified int into Integer
    private Integer portions;
    private boolean localProduct;


    /**
     * @param name
     * @param price
     * @param ingredient
     * @param localProduct
     * @param portions
     * @param canBeDishOfTheDay
     */
    public Antipasti(String name, Double price, Set<IngredientsEnum> ingredient,
                     boolean localProduct, Integer portions, boolean canBeDishOfTheDay) {
        super(name, price, ingredient, canBeDishOfTheDay, TipoPortataEnum.ANTIPASTO);
        this.localProduct = localProduct;
        this.portions = portions;
    }

    public Antipasti(boolean sectionStart) {
        super(sectionStart);
    }

    @Override
    public void print() {
        //TODO si fanno così le condizioni  ! : per fare la negazione
        if (isSectionStart()) {
            System.out.println(ColorsEnum.YELLOW.getValue() + "Antipasti:");
        } else {
            System.out.print(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ") ");
            if (getLocalProduct() == true) {
                System.out.print("Prodotto locale a Km zero; ");
            }
            if (portions > 1) {
                System.out.print("Piatto per " + getPortions() + " persone;");
            }
        }
        System.out.println();
    }

    /**
     * @return il numero di porzioni degli antipasta
     */
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


}
