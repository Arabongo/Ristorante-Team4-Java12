import enumerati.ColorsEnum;
import enumerati.IngredientsEnum;
import enumerati.TipoMenuEnum;
import enumerati.TipoPortataEnum;

import java.util.Set;

public class PrimiPiatti extends Portata {
    private String pastaType;

    /**
     * Eredita il costruttore dalla Classe Portata, aggiungendo la tipologia di pasta per relative portate.
     * @param pastaType indica la tipologia di pasta per il piatto.
     */
    public PrimiPiatti(String name, double price, Set<IngredientsEnum> ingredients, String pastaType, boolean canBeDishOfTheDay, TipoMenuEnum tipoMenuEnum) {
        super(name, price, ingredients, canBeDishOfTheDay, TipoPortataEnum.PRIMI_PIATTI,tipoMenuEnum);
        this.pastaType = pastaType;
    }

    public String getPastaType() {
        return pastaType;
    }

    public void setPastaType(String pastaType) {
        this.pastaType = pastaType;
    }

    /**
     * Metodo di stampa di PrimiPiatti.
     */
    @Override
    public void print() {
        String ingredienti = getIngredients().toString();
        ingredienti = ingredienti.substring(1, ingredienti.length() - 1);
        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue() + "- " + pastaType + getName() + " $" + getPrice() + " - (Ingredienti: " + ingredienti + ")");
    }
}
