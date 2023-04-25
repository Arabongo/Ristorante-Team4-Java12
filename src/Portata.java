public class Portata {
    private String name;
    private double price;
    private String ingredient;

    public Portata(String name, double price, String ingredient) {
        this.name = name;
        this.price = price;
        this.ingredient = ingredient;
    }

    public void print () {
        System.out.println(name + price + ingredient);
    }

    //Fare un override per le proprie classi per il metodo print

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

}
