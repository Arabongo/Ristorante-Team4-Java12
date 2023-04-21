public enum IngredientiPrimiPiatti {
    BUCATINI_ALLA_CARBONARA("Spaghetti, Guanciale, Tuorli, Pecorino romano, Pepe nero"),
    LASAGNE_ALLA_BOLOGNESE("uova, farina, spinaci già puliti e lavati, pancetta tesa, macinato misto, burro, vino, passata di pomodoro, besciamella"),
    SPAGHETTI_ALL_AMATRICIANA("Spaghetti, Guanciale, Vino bianco, Sale fino, Pomodori pelati, Pecorino romano, Peperoncino fresco, Olio extravergine d'oliva"),
    RISOTTO_ALLA_MILANESE("Zafferano in pistilli, Vino bianco, Burro, Riso Carnaroli, Cipolle bianche, Brodo di carne, Parmigiano Reggiano"),
    PASTA_ALLA_GRICIA("Rigatoni, Pecorino romano, Pepe nero, Guanciale, Sale fino");
    private String ingredient;
    IngredientiPrimiPiatti(String ingredient) {
        this.ingredient = ingredient;
    }
    public String getIngredient() {
        return ingredient;
    }
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
