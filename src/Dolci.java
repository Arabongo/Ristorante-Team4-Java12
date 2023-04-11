import java.util.HashMap;

public class Dolci {
        private String name;
        private Double price;
        private String ingredients;

        public Dolci(String name, Double price, String ingredients){
            this.ingredients=ingredients;
            this.name=name;
            this.price=price;
        }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

}

