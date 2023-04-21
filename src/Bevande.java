public class Bevande {
    private String name;
    private double price;
    private boolean alcoholic;
    private double alcoholPercentage;

    public Bevande(String name, double price, boolean alcoholic, double alcoholPercentage) {
        this.name = name;
        this.price = price;
        this.alcoholic = alcoholic;
        this.alcoholPercentage = alcoholPercentage;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public boolean isAlcoholic() {
        return alcoholic;
    }
    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }
    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }
    public void setAlcoholPercentage(double alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public void printBevande() {
        if (alcoholic) {
            System.out.println(Colors.RED.getValue()+"- "+getName()+ " $"+ getPrice()+ " "+"Percentuale alcolica: " + alcoholPercentage+ "%");
        } else {
            System.out.println(Colors.RED.getValue()+"- "+getName()+" $"+ getPrice());
        }
    }
}
