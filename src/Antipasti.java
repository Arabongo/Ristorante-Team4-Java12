import enumerati.ColorsEnum;
import enumerati.IngredientsEnum;
import enumerati.TipoMenuEnum;
import enumerati.TipoPortataEnum;

import java.util.Set;

public class Antipasti extends Portata {

    //modified int into Integer
    private Integer portions;
    private boolean localProduct;

    /**
     *
     * @param name
     * @param price
     * @param ingredients
     * @param canBeDishOfTheDay
     * @param portions
     * @param localProduct
     * @param tipoMenuEnum
     */
    public Antipasti(String name, Double price, Set<IngredientsEnum> ingredients, boolean canBeDishOfTheDay, Integer portions , boolean localProduct, TipoMenuEnum tipoMenuEnum) {
        super(name, price, ingredients, canBeDishOfTheDay, TipoPortataEnum.ANTIPASTO, tipoMenuEnum);
        this.localProduct = localProduct;
        this.portions = portions;
    }

    @Override
    public void print() {
        String ingredienti = getIngredients().toString();
        ingredienti = ingredienti.substring(1, ingredienti.length() - 1);
        System.out.print(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " - (Ingredienti: " + ingredienti + ") ");
        if (getLocalProduct()) {
            System.out.print("Prodotto locale a Km zero; ");
        }
        if (portions > 1) {
            System.out.print("Piatto per " + getPortions() + " persone;");
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
