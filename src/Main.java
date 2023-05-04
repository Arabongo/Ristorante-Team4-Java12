
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new ArrayList<>());
         //Antipasti
        menu.addPortata(new Antipasti(true));
        menu.addPortata(new Antipasti("Affettato", 7.50, Set.of(IngredientsEnum.CARNE_MISTA), true, 2));
        menu.addPortata(new Antipasti("Vitello Tonnato", 8.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.SALE, IngredientsEnum.OLIO_EVO), false, 4));
        menu.addPortata(new Antipasti("Olive Ascolane", 6.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FARINA, IngredientsEnum.FORMAGGIO), true, 1));
        menu.addPortata(new Antipasti("Cornetti Salati", 5.50, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.FARINA, IngredientsEnum.OLIO_EVO), false, 1));

        System.out.println(ColorsEnum.YELLOW.getValue() + "Antipasti:");
//        antipasti1.print();
//        antipasti2.print();
//        antipasti3.print();
//        antipasti4.print();
        System.out.println();
//
//        menu.addPortata(antipasti1);

        // Primi Piatti
        PrimiPiatti primiPiatti1 = new PrimiPiatti(" alla Carbonara", 8.99, Set.of(IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PASTA), true, "Bucatini");
        PrimiPiatti primiPiatti2 = new PrimiPiatti(" alla Bolognese", 9.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.POMODORI), false, "Lasagne");
        PrimiPiatti primiPiatti3 = new PrimiPiatti(" all'Amatriciana", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.GUANCIALE, IngredientsEnum.FORMAGGIO), false, "Spaghettoni");
        PrimiPiatti primiPiatti4 = new PrimiPiatti(" alla milanese", 7.99, Set.of(IngredientsEnum.RISO, IngredientsEnum.AROMI, IngredientsEnum.PEPE), false, "Risotto");
        PrimiPiatti primiPiatti5 = new PrimiPiatti(" alla gricia", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PEPE), false, "Calamarata");

        System.out.println(ColorsEnum.GREEN.getValue() + "Primi Piatti");
        primiPiatti1.print();
        primiPiatti2.print();
        primiPiatti3.print();
        primiPiatti4.print();
        primiPiatti5.print();
        System.out.println();

        menu.addPortata(primiPiatti1);

        // Secondi Piatti
        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Filetto di maiale al forno con salvia",11.99, Set.of(IngredientsEnum.CARNE_DI_MAIALE, IngredientsEnum.AROMI, IngredientsEnum.PATATE), false);
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Grigliata di carne",13.99, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.AROMI, IngredientsEnum.PEPE), true);
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Cotoletta alla milanese ", 7.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.UOVA, IngredientsEnum.LIMONE), false);
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Costine d’agnello alla griglia ",10.99, Set.of(IngredientsEnum.CARNE_DI_AGNELLO, IngredientsEnum.GUANCIALE, IngredientsEnum.VINO, IngredientsEnum.PEPRONCINO), true);
        SecondiPiatti secondiPiatti5 = new SecondiPiatti("Tagliata di manzo con rucola e grana ",13.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FORMAGGIO, IngredientsEnum.POMODORI, IngredientsEnum.OLIO_EVO, IngredientsEnum.PEPRONCINO), true);
        SecondiPiatti secondiPiatti6 = new SecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco) ",9.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.ACETO, IngredientsEnum.FUNGHI, IngredientsEnum.VINO), false);

        System.out.println(ColorsEnum.PURPLE_BRIGHT.getValue() + "Secondi Piatti:");
        secondiPiatti1.print();
        secondiPiatti2.print();
        secondiPiatti3.print();
        secondiPiatti4.print();
        secondiPiatti5.print();
        secondiPiatti6.print();
        System.out.println();

        menu.addPortata(secondiPiatti1);

        // Dolci
        Dolci dolce1= new Dolci("Tiramisù al cucchiaio", 9.5,Set.of(IngredientsEnum.ZUCCHERO, IngredientsEnum.UOVA, IngredientsEnum.LATTE, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA));
        Dolci dolce2= new Dolci("Babà", 10.5,Set.of(IngredientsEnum.FARINA, IngredientsEnum.AROMI, IngredientsEnum.UOVA, IngredientsEnum.RUM));
        Dolci dolce3=new Dolci("Delizia al limone", 12.0,Set.of(IngredientsEnum.FARINA, IngredientsEnum.LATTE, IngredientsEnum.UOVA, IngredientsEnum.ZUCCHERO));
        Dolci dolce4=new Dolci("Cannolo alla ricotta", 8, Set.of(IngredientsEnum.FARINA, IngredientsEnum.RICOTTA, IngredientsEnum.CIOCCOLATO, IngredientsEnum.ZUCCHERO));
        Dolci dolce5=new Dolci("Tartufo al cioccolato", 9,Set.of(IngredientsEnum.FARINA, IngredientsEnum.ZUCCHERO, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA));
        Dolci dolce6=new Dolci("CheeseCake", 10,Set.of(IngredientsEnum.FORMAGGIO, IngredientsEnum.ZUCCHERO, IngredientsEnum.PANNA));
        System.out.println(ColorsEnum.RED_BRIGHT.getValue() + "Dolci:");
        dolce1.print();
        dolce2.print();
        dolce3.print();
        dolce4.print();
        dolce5.print();
        dolce6.print();
        System.out.println();

        menu.addPortata(dolce1);

        // Bevande
        Bevande bevande1 = new Bevande("Gradisca 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5);
        Bevande bevande2 = new Bevande("Gradisca 0.5l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5);
        Bevande bevande3 = new Bevande("Gradisca 1l", 10.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5);
        Bevande bevande4 = new Bevande("Midona", 5.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL),true, 5.5);
        Bevande bevande5 = new Bevande("Volpina", 4.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL ), true, 5.0);
        Bevande bevande6 = new Bevande("Volpina", 6.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true, 5.0);
        Bevande bevande7 = new Bevande("Acqua Nat 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA),false, 0.0);
        Bevande bevande8 = new Bevande("Acqua Gas 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ANIDRIDE_CARBONICA), false, 0.0);
        Bevande bevande9 = new Bevande("Coca Cola 1/2l", 2.5,Set.of(IngredientsEnum.ACQUA, IngredientsEnum.CAFFEINA, IngredientsEnum.ZUCCHERO),false, 0.0);
        Bevande bevande10 = new Bevande("Chinotto 0.33l", 3.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0);
        Bevande bevande11 = new Bevande("Te Pesca 1/2l", 2.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI),false, 0.0);
        Bevande bevande12 = new Bevande("Te Limone 1/2l", 2.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0);
        Bevande bevande13 = new Bevande("Succhi di frutta 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI),false, 0.0);
        Bevande bevande14 = new Bevande("Rosè frizzante", 10.0,  Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 12.0);
        Bevande bevande15 = new Bevande("Chardonnat", 13.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.5);
        Bevande bevande16 = new Bevande("Merlot", 10.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 13.5);
        Bevande bevande17 = new Bevande("Pinot Noir", 15.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.0);

        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue()+"Bevande : ");
        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue()+"BIRRE : ");
        bevande1.print();
        bevande2.print();
        bevande3.print();
        bevande4.print();
        bevande5.print();
        bevande6.print();
        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue()+"\n"+"SOFT DRINK : ");
        bevande7.print();
        bevande8.print();
        bevande9.print();
        bevande10.print();
        bevande11.print();
        bevande12.print();
        bevande13.print();
        System.out.println(ColorsEnum.BLUE_BRIGHT.getValue()+"\n"+"VINI : ");
        bevande14.print();
        bevande15.print();
        bevande16.print();
        bevande17.print();
        System.out.println();

        menu.addPortata(bevande1);

        Ristorante ristorante = new Ristorante("WIP", "WIP", 9.00, 1.00, 3.50, menu);
        ristorante.getMenu().printPortataList(menu);

    }
}
