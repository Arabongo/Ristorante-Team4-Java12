package src;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bevande {
    private String nomeBevanda;
    private double prezzoBevanda;

    public void Bevande (String nomeBevanda, double prezzoBevanda){
        this.nomeBevanda = nomeBevanda;
        this.prezzoBevanda = prezzoBevanda;
    }
    public String getNomeBevanda (){
        return nomeBevanda;
    }
    public void setNomeBevanda (String nomeBevanda){
        this.nomeBevanda = nomeBevanda;
    }
    public double getPrezzoBevanda(){
        return prezzoBevanda;
    }
    public void setPrezzoBevanda(double prezzoBevanda){

        this.prezzoBevanda = prezzoBevanda;
    }
    public void stampaBevande(){
        Map<String,Double>menuBirre = new LinkedHashMap<>();
        menuBirre.put("Gradisca 0.33l", 3.5);
        menuBirre.put("Gradisca 0.5l", 3.5);
        menuBirre.put("Gradisca 1l", 10.0);
        menuBirre.put("Midona", 5.0);
        menuBirre.put("Volpina", 4.0);
        menuBirre.put("Volpina", 6.0);
        System.out.println("Bevande : "+ "\n");
        System.out.println("LE BIRRE : "+"\n");
        for (String mapkey : menuBirre.keySet()){
            String stampaMenuBevande = mapkey + " - " + menuBirre.get(mapkey) + "€";
            System.out.println(stampaMenuBevande);
        }
        Map<String,Double>menuSoftDrink = new LinkedHashMap<>();
        menuSoftDrink.put("Acqua Nat 1/2l", 1.0);
        menuSoftDrink.put("Acqua Gas 1/2l", 1.0);
        menuSoftDrink.put("Coca Cola 1/2l", 2.5);
        menuSoftDrink.put("Chinotto 0.33l", 3.0);
        menuSoftDrink.put("Te Pesca 1/2l", 2.5);
        menuSoftDrink.put("Te Limone 1/2l", 2.5);
        menuSoftDrink.put("Succhi di frutta 0.33l", 3.5);
        System.out.println("\n"+"SOFT DRINK : "+ "\n");
        for (String mapkey : menuSoftDrink.keySet()){
            String stampaMenuBevande = mapkey + " - " + menuSoftDrink.get(mapkey) + "€";
            System.out.println(stampaMenuBevande);
        }
        Map<String,Double>menuVini = new LinkedHashMap<>();
        menuVini.put("Rosè frizzante", 10.0);
        menuVini.put("Chardonnat", 13.0);
        menuVini.put("Merlot", 10.0);
        menuVini.put("Pinot Noir", 15.0);
        System.out.println("\n"+"VINI : "+"\n");
        for (String mapkey : menuVini.keySet()){
            String stampaMenuBevande = mapkey + " - " + menuVini.get(mapkey) + "€";
            System.out.println(stampaMenuBevande);
        }
    }
}
