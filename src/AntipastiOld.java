public class AntipastiOld {
    private String name;
    private double price;

    AntipastiOld(String name, Double price) {
        this.name = name;

        this.price = price;

    }
    public void setPrice(Double price) {this.price = price;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
}

