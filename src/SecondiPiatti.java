import enumerati.ColorsEnum;
import enumerati.IngredientsEnum;
import enumerati.TipoMenuEnum;
import enumerati.TipoPortataEnum;

import java.util.Set;

public class SecondiPiatti extends Portata {

    private boolean isSpicy;

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
    @Override
    public void print() {
            if (!isSpicy) {
                System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")");
            } else {
                System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " -(Ingredienti: " + getIngredients() + ")" + ColorsEnum.RED_BRIGHT.getValue() + " Piccante");
            }
    }
}
