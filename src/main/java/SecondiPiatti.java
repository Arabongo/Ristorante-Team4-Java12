import enumerati.ColorsEnum;
import enumerati.IngredientsEnum;
import enumerati.TipoMenuEnum;
import enumerati.TipoPortataEnum;

import java.util.Set;

public class SecondiPiatti extends Portata {

    private boolean isSpicy;

    /**
     * Eredita il costruttore dalla Classe Portata.
     * @param isSpicy indica se il piatto è piccante o meno.
     */
    public SecondiPiatti(String name, double price, Set<IngredientsEnum> ingredients, boolean isSpicy, boolean canBeDishOfTheDay, TipoMenuEnum tipoMenuEnum) {
        super(name, price, ingredients, canBeDishOfTheDay, TipoPortataEnum.SECONDI_PIATTI,tipoMenuEnum);
        this.isSpicy = isSpicy;
    }

    public boolean isSpicy() {
        return isSpicy;
    }
    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }
    /**
     * Metodo di stampa di SecondiPiatti.
     */
    @Override
    public void print() {
        String ingredienti = getIngredients().toString();
        ingredienti = ingredienti.substring(1, ingredienti.length() - 1);
            if (!isSpicy) {
                System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " - (Ingredienti: " + ingredienti + ")");
            } else {
                System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " - (Ingredienti: " + ingredienti + ")" + ColorsEnum.RED_BRIGHT.getValue() + " Piccante");
            }
    }
}
