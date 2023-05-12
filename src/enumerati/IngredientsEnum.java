package enumerati;

public enum IngredientsEnum {

    //TODO enum alla fine del nome
    FORMAGGIO("Formaggio"),
    CARNE_MISTA("Carne Mista"),
    CARNE_DI_VITELLO("Carne di Vitello"),
    FARINA("Farina"),
    UOVA("Uova"),
    LATTE("Latte"),
    CIOCCOLATO("Cioccolato"),
    ZUCCHERO("Zucchero"),
    PASTA("Pasta"),
    PATATE("Patate"),
    POMODORI("Pomodori"),
    FUNGHI("Funghi"),
    OLIO_EVO("Olio Extra Vergine d'Oliva"),
    SALE("Sale"),
    PEPE("Pepe"),
    GUANCIALE("Guanciale"),
    RISO("Riso"),
    VINO("Vino"),
    ACETO("Aceto"),
    CARNE_DI_MAIALE("Carne di maiale"),
    CARNE_DI_AGNELLO("Carne di agnello"),
    ALCOL("Alcol"),
    AROMI("Aromi"),
    CAFFEINA("Caffeina"),
    ACQUA("Acqua"),
    LUPPOLO("Luppolo"),
    ANIDRIDE_CARBONICA("Anidride Carbonica"),
    SUCCO_DI_FRUTTA("Succo di Frutta"),
    MOSTO("Mosto"),
    RICOTTA ("Ricotta"),
    RUM ("Rum"),
    PEPRONCINO("Peperoncino"),
    LIMONE("Limone"),
    POLPO("Polpo"),
    COCCIO("Scorfano"),
    MOZZARELLA("Mozzarella"),
    PESCATO_DEL_GIORNO("Misto pesce del giorno"),
    PANNA ("Panna");

    private final String ingredient;
    IngredientsEnum(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }
    @Override
    public String toString (){
        return getIngredient();
    }
}
