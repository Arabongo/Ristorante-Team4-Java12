
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new ArrayList<>());
         //Antipasti
        Antipasti sectionTitleAntipasti1 = new Antipasti(true);
        Antipasti antipasti1 = new Antipasti("Affettato", 7.50, Set.of(IngredientsEnum.CARNE_MISTA), true, 2, true);
        Antipasti antipasti2 = new Antipasti("Vitello Tonnato", 8.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.SALE, IngredientsEnum.OLIO_EVO), false, 4, true);
        Antipasti antipasti3 = new Antipasti("Olive Ascolane", 6.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FARINA, IngredientsEnum.FORMAGGIO), true, 1, true);
        Antipasti antipasti4 = new Antipasti("Cornetti Salati", 5.50, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.FARINA, IngredientsEnum.OLIO_EVO), false, 1, true);
        menu.addPortata(sectionTitleAntipasti1);
        menu.addPortata(antipasti1);
        menu.addPortata(antipasti2);
        menu.addPortata(antipasti3);
        menu.addPortata(antipasti4);
        // Primi Piatti
        PrimiPiatti sectionTitlePrimiPiatti1 = new PrimiPiatti(true);
        PrimiPiatti primiPiatti1 = new PrimiPiatti(" alla Carbonara", 8.99, Set.of(IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PASTA), "Bucatini", true);
        PrimiPiatti primiPiatti2 = new PrimiPiatti(" alla Bolognese", 9.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.POMODORI), "Lasagne", true);
        PrimiPiatti primiPiatti3 = new PrimiPiatti(" all'Amatriciana", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.GUANCIALE, IngredientsEnum.FORMAGGIO), "Spaghettoni", true);
        PrimiPiatti primiPiatti4 = new PrimiPiatti(" alla milanese", 7.99, Set.of(IngredientsEnum.RISO, IngredientsEnum.AROMI, IngredientsEnum.PEPE), "Risotto", true);
        PrimiPiatti primiPiatti5 = new PrimiPiatti(" alla gricia", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PEPE), "Calamarata", true);
        menu.addPortata(sectionTitlePrimiPiatti1);
        menu.addPortata(primiPiatti1);
        menu.addPortata(primiPiatti2);
        menu.addPortata(primiPiatti3);
        menu.addPortata(primiPiatti4);
        menu.addPortata(primiPiatti5);
        // Secondi Piatti
        SecondiPiatti sectionTitleSecondiPiatti1 = new SecondiPiatti(true);
        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Filetto di maiale al forno con salvia",11.99, Set.of(IngredientsEnum.CARNE_DI_MAIALE, IngredientsEnum.AROMI, IngredientsEnum.PATATE), false, true);
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Grigliata di carne",13.99, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.AROMI, IngredientsEnum.PEPE), true, true);
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Cotoletta alla milanese ", 7.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.UOVA, IngredientsEnum.LIMONE), false, true);
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Costine d’agnello alla griglia ",10.99, Set.of(IngredientsEnum.CARNE_DI_AGNELLO, IngredientsEnum.GUANCIALE, IngredientsEnum.VINO, IngredientsEnum.PEPRONCINO), true, true);
        SecondiPiatti secondiPiatti5 = new SecondiPiatti("Tagliata di manzo con rucola e grana ",13.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FORMAGGIO, IngredientsEnum.POMODORI, IngredientsEnum.OLIO_EVO, IngredientsEnum.PEPRONCINO), true, true);
        SecondiPiatti secondiPiatti6 = new SecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco) ",9.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.ACETO, IngredientsEnum.FUNGHI, IngredientsEnum.VINO), false, true);
        menu.addPortata(sectionTitleSecondiPiatti1);
        menu.addPortata(secondiPiatti1);
        menu.addPortata(secondiPiatti2);
        menu.addPortata(secondiPiatti3);
        menu.addPortata(secondiPiatti4);
        menu.addPortata(secondiPiatti5);
        menu.addPortata(secondiPiatti6);
        //Dolci
        Dolci sectionTitleDolci1 = new Dolci(true);
        Dolci dolci1 = new Dolci("Tiramisù al cucchiaio", 9.5,Set.of(IngredientsEnum.ZUCCHERO, IngredientsEnum.UOVA, IngredientsEnum.LATTE, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA), true);
        Dolci dolci2 = new Dolci("Babà", 10.5,Set.of(IngredientsEnum.FARINA, IngredientsEnum.AROMI, IngredientsEnum.UOVA, IngredientsEnum.RUM), true);
        Dolci dolci3 = new Dolci("Delizia al limone", 12.0,Set.of(IngredientsEnum.FARINA, IngredientsEnum.LATTE, IngredientsEnum.UOVA, IngredientsEnum.ZUCCHERO), true);
        Dolci dolci4 = new Dolci("Cannolo alla ricotta", 8, Set.of(IngredientsEnum.FARINA, IngredientsEnum.RICOTTA, IngredientsEnum.CIOCCOLATO, IngredientsEnum.ZUCCHERO), true);
        Dolci dolci5 = new Dolci("Tartufo al cioccolato", 9,Set.of(IngredientsEnum.FARINA, IngredientsEnum.ZUCCHERO, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA), true);
        Dolci dolci6 = new Dolci("CheeseCake", 10,Set.of(IngredientsEnum.FORMAGGIO, IngredientsEnum.ZUCCHERO, IngredientsEnum.PANNA), true);
        menu.addPortata(sectionTitleDolci1);
        menu.addPortata(dolci1);
        menu.addPortata(dolci2);
        menu.addPortata(dolci3);
        menu.addPortata(dolci4);
        menu.addPortata(dolci5);
        menu.addPortata(dolci6);
        //Bevande - Birre
        Bevande sectionTitleBevande1 = new Bevande(true, "Bevande: \n Birre:");
        Bevande bevande1 = new Bevande("Gradisca 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false);
        Bevande bevande2 = new Bevande("Gradisca 0.5l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false);
        Bevande bevande3 = new Bevande("Gradisca 1l", 10.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false);
        Bevande bevande4 = new Bevande("Midona", 5.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL),true, 5.5, false);
        Bevande bevande5 = new Bevande("Volpina", 4.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL ), true, 5.0, false);
        Bevande bevande6 = new Bevande("Volpina", 6.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true, 5.0, false);
        menu.addPortata(sectionTitleBevande1);
        menu.addPortata(bevande1);
        menu.addPortata(bevande2);
        menu.addPortata(bevande3);
        menu.addPortata(bevande4);
        menu.addPortata(bevande5);
        menu.addPortata(bevande6);
        //Bevande - Soft Drink
        Bevande sectionTitleBevande2 = new Bevande(true, "Soft Drink:");
        Bevande bevande7 = new Bevande("Acqua Nat 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA),false, 0.0, false);
        Bevande bevande8 = new Bevande("Acqua Gas 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ANIDRIDE_CARBONICA), false, 0.0, false);
        Bevande bevande9 = new Bevande("Coca Cola 1/2l", 2.5,Set.of(IngredientsEnum.ACQUA, IngredientsEnum.CAFFEINA, IngredientsEnum.ZUCCHERO),false, 0.0, false);
        Bevande bevande10 = new Bevande("Chinotto 0.33l", 3.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0, false);
        Bevande bevande11 = new Bevande("Te Pesca 1/2l", 2.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI),false, 0.0, false);
        Bevande bevande12 = new Bevande("Te Limone 1/2l", 2.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0, false);
        Bevande bevande13 = new Bevande("Succhi di frutta 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI),false, 0.0, false);
        menu.addPortata(sectionTitleBevande2);
        menu.addPortata(bevande7);
        menu.addPortata(bevande8);
        menu.addPortata(bevande9);
        menu.addPortata(bevande10);
        menu.addPortata(bevande11);
        menu.addPortata(bevande12);
        menu.addPortata(bevande13);
        //Bevande - Vini
        Bevande sectionTitleBevande3 = new Bevande(true, "Vini:");
        Bevande bevande14 = new Bevande("Rosè frizzante", 10.0,  Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 12.0, false);
        Bevande bevande15 = new Bevande("Chardonnat", 13.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.5, false);
        Bevande bevande16 = new Bevande("Merlot", 10.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 13.5, false);
        Bevande bevande17 = new Bevande("Pinot Noir", 15.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.0, false);
        menu.addPortata(sectionTitleBevande3);
        menu.addPortata(bevande14);
        menu.addPortata(bevande15);
        menu.addPortata(bevande16);
        menu.addPortata(bevande17);

        Ristorante ristorante = new Ristorante("La Taverna di Pulcinella", "Via Libertà 47, Napoli", 9.00, 1.00, 3.50, menu);
        System.out.println(ristorante);
        ristorante.printMenu(menu);

    }
}
