public enum IngredientiSecondiPiatti {
    FILETTO_DI_MAIALE("Filetto di maiale, Speck, Patate, Rosmarino, Salvia, Mele."),
    GRIGLIATA_DI_CARNE("Costine di maiale, Salsicce, Braciole di maiale, Costolette d'agnello."),
    COTOLETTA_ALLA_MILANESE("Lombata di vitello, Uova, Limone"),
    COSTINE_AGNELLO("Costolette d'agnello, Pancetta, Vino Rosso, Timo, Aglio, Maggiorana."),
    TAGLIATA_DI_MANZO("Entrecote di manzo, Rucola, Grana Padano in scaglie, Olio EVO, Pomodorini."),
    SCALOPPINE("Fettine di Vitello, Aceto Balsamico / Funghi Porcini / Vino Bianco, Timo.");

    private String ingredient;
    IngredientiSecondiPiatti(String ingredient) {
        this.ingredient = ingredient;
    }
    public String getIngredient() {
        return ingredient;
    }
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    }
