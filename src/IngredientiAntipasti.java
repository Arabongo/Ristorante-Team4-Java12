import java.util.ArrayList;
import java.util.List;

enum IngredientiAntipasti {
    AFFETTATO("Carne mista"),
    VITELLO_TONNATO("Carne di vitello, tonno, uova"),
    OLIVE_ASCOLANE("Farina, uova, carne di manzo, parmigiano"),
    CORNETTI_SALATI("Carne mista, verdura fresca, farina, burro");
    private String ingredient;
    IngredientiAntipasti(String ingredient) {
        this.ingredient = ingredient;
    }
    public String getIngredient() {
        return ingredient;
    }
    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }
}
