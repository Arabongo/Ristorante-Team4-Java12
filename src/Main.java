

import java.util.ArrayList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
         //Antipasti
        Antipasti antipasti1 = new Antipasti("Affettato", 7.50, IngredientiAntipasti.AFFETTATO);
        Antipasti antipasti2 = new Antipasti("Vitello Tonnato", 8.50, IngredientiAntipasti.VITELLO_TONNATO);
        Antipasti antipasti3 = new Antipasti("Olive Ascolane", 6.50, IngredientiAntipasti.OLIVE_ASCOLANE);
        Antipasti antipasti4 = new Antipasti("Cornetti Salati", 5.50, IngredientiAntipasti.CORNETTI_SALATI);

        System.out.println(Colors.YELLOW.getValue() + "Antipasti:");
        antipasti1.print();
        antipasti2.print();
        antipasti3.print();
        antipasti4.print();
        System.out.println();

        // Primi Piatti
        PrimiPiatti primiPiatti1 = new PrimiPiatti("Bucatini alla Carbonara", 8.99, Set.of(Ingredients.UOVA,Ingredients.GUANCIALE,Ingredients.PASTA));
        PrimiPiatti primiPiatti2 = new PrimiPiatti("Lasagne alla Bolognese", 9.99, Set.of(Ingredients.PASTA,Ingredients.CARNE_DI_VITELLO,Ingredients.POMODORI));
        PrimiPiatti primiPiatti3 = new PrimiPiatti("Spaghetti all Amatriciana (piatto del giorno)", 8.99, Set.of(Ingredients.PASTA,Ingredients.GUANCIALE,Ingredients.FORMAGGIO));
        PrimiPiatti primiPiatti4 = new PrimiPiatti("Risotto alla milanese", 7.99, Set.of(Ingredients.RISO,Ingredients.AROMI,Ingredients.PEPE));
        PrimiPiatti primiPiatti5 = new PrimiPiatti("Pasta alla gricia", 8.99, Set.of(Ingredients.PASTA,Ingredients.UOVA,Ingredients.GUANCIALE,Ingredients.PEPE));

        System.out.println(Colors.GREEN.getValue() + "Primi Piatti");
        primiPiatti1.print();
        primiPiatti2.print();
        primiPiatti3.print();
        primiPiatti4.print();
        primiPiatti5.print();
        System.out.println();

        // Secondi Piatti
        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Filetto di maiale al forno con salvia",11.99, Set.of(Ingredients.CARNE_DI_MAIALE,Ingredients.AROMI,Ingredients.PATATE));
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Grigliata di carne",13.99, Set.of(Ingredients.CARNE_MISTA,Ingredients.AROMI,Ingredients.PEPE));
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Cotoletta alla milanese ", 7.99, Set.of(Ingredients.CARNE_DI_VITELLO,Ingredients.UOVA));
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Costine d’agnello alla griglia ",10.99, Set.of(Ingredients.CARNE_DI_AGNELLO,Ingredients.GUANCIALE,Ingredients.VINO,Ingredients.AROMI));
        SecondiPiatti secondiPiatti5 = new SecondiPiatti("Tagliata di manzo con rucola e grana ",13.99, Set.of(Ingredients.CARNE_DI_VITELLO,Ingredients.FORMAGGIO,Ingredients.POMODORI,Ingredients.OLIO_EVO));
        SecondiPiatti secondiPiatti6 = new SecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco) ",9.99, Set.of(Ingredients.CARNE_DI_VITELLO,Ingredients.ACETO,Ingredients.FUNGHI,Ingredients.VINO));

        System.out.println(Colors.PURPLE_BRIGHT.getValue() + "Secondi Piatti:");
        secondiPiatti1.print();
        secondiPiatti2.print();
        secondiPiatti3.print();
        secondiPiatti4.print();
        secondiPiatti5.print();
        secondiPiatti6.print();
        System.out.println();
        // Dolci
        Dolci dolce1= new Dolci("Tiramisù al cucchiaio", 9.5,Set.of(Ingredients.ZUCCHERO,Ingredients.UOVA,Ingredients.LATTE,Ingredients.CIOCCOLATO,Ingredients.CAFFEINA));
        Dolci dolce2= new Dolci("Babà", 10.5,Set.of(Ingredients.FARINA,Ingredients.AROMI,Ingredients.UOVA,Ingredients.RUM));
        Dolci dolce3=new Dolci("Delizia al limone", 12.0,Set.of(Ingredients.FARINA,Ingredients.LATTE,Ingredients.UOVA,Ingredients.ZUCCHERO));
        Dolci dolce4=new Dolci("Cannolo alla ricotta", 8, Set.of(Ingredients.FARINA,Ingredients.RICOTTA,Ingredients.CIOCCOLATO,Ingredients.ZUCCHERO));
        Dolci dolce5=new Dolci("Tartufo al cioccolato", 9,Set.of(Ingredients.FARINA,Ingredients.ZUCCHERO,Ingredients.CIOCCOLATO,Ingredients.CAFFEINA));
        Dolci dolce6=new Dolci("CheeseCake", 10,Set.of(Ingredients.FORMAGGIO,Ingredients.ZUCCHERO,Ingredients.PANNA));
        System.out.println(Colors.RED_BRIGHT.getValue() + "Dolci:");
        dolce1.print();
        dolce2.print();
        dolce3.print();
        dolce4.print();
        dolce5.print();
        dolce6.print();
        System.out.println();
        // Bevande
        Bevande bevande1 = new Bevande("Gradisca 0.33l", 3.5, true, 4.5);
        Bevande bevande2 = new Bevande("Gradisca 0.5l", 3.5,true, 4.5);
        Bevande bevande3 = new Bevande("Gradisca 1l", 10.0, true, 4.5);
        Bevande bevande4 = new Bevande("Midona", 5.0, true, 5.5);
        Bevande bevande5 = new Bevande("Volpina", 4.0, true, 5.0);
        Bevande bevande6 = new Bevande("Volpina", 6.0, true, 5.0);
        Bevande bevande7 = new Bevande("Acqua Nat 1/2l", 1.0, false, 0.0);
        Bevande bevande8 = new Bevande("Acqua Gas 1/2l", 1.0, false, 0.0);
        Bevande bevande9 = new Bevande("Coca Cola 1/2l", 2.5,false, 0.0);
        Bevande bevande10 = new Bevande("Chinotto 0.33l", 3.0, false, 0.0);
        Bevande bevande11 = new Bevande("Te Pesca 1/2l", 2.5, false, 0.0);
        Bevande bevande12 = new Bevande("Te Limone 1/2l", 2.5, false, 0.0);
        Bevande bevande13 = new Bevande("Succhi di frutta 0.33l", 3.5, false, 0.0);
        Bevande bevande14 = new Bevande("Rosè frizzante", 10.0, true, 12.0);
        Bevande bevande15 = new Bevande("Chardonnat", 13.0, true, 11.5);
        Bevande bevande16 = new Bevande("Merlot", 10.0, true, 13.5);
        Bevande bevande17 = new Bevande("Pinot Noir", 15.0, true, 11.0);


        System.out.println(Colors.BLUE_BRIGHT.getValue()+"Bevande : ");
        System.out.println(Colors.BLUE_BRIGHT.getValue()+"BIRRE : ");
        bevande1.printBevande();
        bevande2.printBevande();
        bevande3.printBevande();
        bevande4.printBevande();
        bevande5.printBevande();
        bevande6.printBevande();
        System.out.println(Colors.BLUE_BRIGHT.getValue()+"\n"+"SOFT DRINK : ");
        bevande7.printBevande();
        bevande8.printBevande();
        bevande9.printBevande();
        bevande10.printBevande();
        bevande11.printBevande();
        bevande12.printBevande();
        bevande13.printBevande();
        System.out.println(Colors.BLUE_BRIGHT.getValue()+"\n"+"VINI : ");
        bevande14.printBevande();
        bevande15.printBevande();
        bevande16.printBevande();
        bevande17.printBevande();
        System.out.println();


    }
}
