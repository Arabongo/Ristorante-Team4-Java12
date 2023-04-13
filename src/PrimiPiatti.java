public class PrimiPiatti {
    private String name;
    private double price;

    public PrimiPiatti(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {this.price = price;}
}
