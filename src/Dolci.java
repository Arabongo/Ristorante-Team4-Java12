import enumerati.ColorsEnum;
import enumerati.IngredientsEnum;
import enumerati.TipoMenuEnum;
import enumerati.TipoPortataEnum;

import java.util.Set;

public class Dolci extends Portata {

    private boolean isGlutenFree;
    /**
     * Costruttore ereditato dalla Classe Portata.
     */
    public Dolci(String name, double price, Set<IngredientsEnum> ingredients, boolean canBeDishOfTheDay, TipoMenuEnum tipoMenuEnum) {
        super(name, price, ingredients, canBeDishOfTheDay, TipoPortataEnum.DOLCI,tipoMenuEnum);
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    /**
     * Metodo di stampa di Dolci.
     */
    @Override
    public void print() {
        String ingredienti = getIngredients().toString();
        ingredienti = ingredienti.substring(1, ingredienti.length() - 1);
        isGlutenFree = !this.getIngredients().contains(IngredientsEnum.FARINA);
        System.out.println(ColorsEnum.GREEN_BRIGHT.getValue() + "- " + getName() + " $" + getPrice() + " - (Ingredienti: " + ingredienti + ")" + " is Gluten Free: " + isGlutenFree);
    }
}

