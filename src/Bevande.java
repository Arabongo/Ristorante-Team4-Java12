import java.util.Set;

public class Bevande extends Portata {

    private boolean alcoholic;
    private double alcoholPercentage;

    public Bevande(String name, double price, Set<Ingredients> ingredients, boolean alcoholic,double alcoholPercentage ) {
        super(name, price, ingredients);
        this.alcoholic = alcoholic;
        this.alcoholPercentage = alcoholPercentage;
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
    @Override
    public void print() {
        if (alcoholic) {
            System.out.println(Colors.RED.getValue()+"- "+getName()+ " $"+ getPrice()+ " "+"Percentuale alcolica: " + alcoholPercentage+ "%");
        } else {
            System.out.println(Colors.RED.getValue()+"- "+getName()+" $"+ getPrice());
        }
    }
}
