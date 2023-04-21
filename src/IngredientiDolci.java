public enum IngredientiDolci {
    TIRAMISU("Uova,Latte,Cacao,Caffè,Farina,Zucchero"),
    BABA("Farina,Rhum,Latte,Zucchero,Lievito"),
    DELIZIA_AL_LIMONE("Burro,Limone,Farina,Zucchero"),
    CANNOLO("Farina,Ricotta,Cioccolato,Zucchero"),
    TARTUFO("Farina,Cioccolato,Caffè,Zucchero"),
    CHEESE_CAKE("Formaggio,Zucchero,Panna,Gelatina");
    private String ingredients;
    IngredientiDolci(String ingredients){
        this.ingredients=ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }
}
