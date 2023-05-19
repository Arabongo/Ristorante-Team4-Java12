import enumerati.ColorsEnum;
import enumerati.IngredientsEnum;
import enumerati.TipoMenuEnum;
import enumerati.TipoPortataEnum;

import java.util.Set;

public class Bevande extends Portata {

    private boolean alcoholic;
    private Double alcoholPercentage;

    /**
     * Eredita il costruttore della classe Portata, aggiungendo se contiene alchol e in che quantità.
     * @param alcoholic indica se la bevanda è alcolica o meno
     * @param alcoholPercentage indica l'eventuale quantità di alchol nella bevanda.
     */
    public Bevande(String name, Double price, Set<IngredientsEnum> ingredients, boolean alcoholic, Double alcoholPercentage, boolean canBeDishOfTheDay, TipoMenuEnum tipoMenuEnum) {
        super(name, price, ingredients, canBeDishOfTheDay, TipoPortataEnum.BEVANDE, tipoMenuEnum);
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

    /**
     * Metodo di stampa di Bevande.
     */
    @Override
    public void print() {
        String ingredienti = getIngredients().toString();
        ingredienti = ingredienti.substring(1, ingredienti.length() - 1);
        {
            if (alcoholic) {
                System.out.println(ColorsEnum.RED.getValue() + "- " + getName() + " $" + getPrice() + " " + "Percentuale alcolica: " + alcoholPercentage + "%" + " - (Ingredienti: " + ingredienti + ")");
            } else {
                System.out.println(ColorsEnum.RED.getValue() + "- " + getName() + " $" + getPrice() + " - (Ingredienti: " + ingredienti + ")");
            }
        }
    }
}

