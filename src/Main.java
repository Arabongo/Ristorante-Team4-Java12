
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new ArrayList<>());
         //Antipasti
        menu.addPortata(new Antipasti(true));
        menu.addPortata(new Antipasti("Affettato", 7.50, Set.of(IngredientsEnum.CARNE_MISTA), true, 2, true));
        menu.addPortata(new Antipasti("Vitello Tonnato", 8.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.SALE, IngredientsEnum.OLIO_EVO), false, 4, true));
        menu.addPortata(new Antipasti("Olive Ascolane", 6.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FARINA, IngredientsEnum.FORMAGGIO), true, 1, true));
        menu.addPortata(new Antipasti("Cornetti Salati", 5.50, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.FARINA, IngredientsEnum.OLIO_EVO), false, 1, true));
        // Primi Piatti
        menu.addPortata(new PrimiPiatti(true));
        menu.addPortata(new PrimiPiatti(" alla Carbonara", 8.99, Set.of(IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PASTA), "Bucatini", true));
        menu.addPortata(new PrimiPiatti(" alla Bolognese", 9.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.POMODORI), "Lasagne", true));
        menu.addPortata(new PrimiPiatti(" all'Amatriciana", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.GUANCIALE, IngredientsEnum.FORMAGGIO), "Spaghettoni", true));
        menu.addPortata(new PrimiPiatti(" alla milanese", 7.99, Set.of(IngredientsEnum.RISO, IngredientsEnum.AROMI, IngredientsEnum.PEPE), "Risotto", true));
        menu.addPortata(new PrimiPiatti(" alla gricia", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PEPE), "Calamarata", true));
        // Secondi Piatti
        menu.addPortata(new SecondiPiatti(true));
        menu.addPortata(new SecondiPiatti("Filetto di maiale al forno con salvia",11.99, Set.of(IngredientsEnum.CARNE_DI_MAIALE, IngredientsEnum.AROMI, IngredientsEnum.PATATE), false, true));
        menu.addPortata(new SecondiPiatti("Grigliata di carne",13.99, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.AROMI, IngredientsEnum.PEPE), true, true));
        menu.addPortata(new SecondiPiatti("Cotoletta alla milanese ", 7.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.UOVA, IngredientsEnum.LIMONE), false, true));
        menu.addPortata(new SecondiPiatti("Costine d’agnello alla griglia ",10.99, Set.of(IngredientsEnum.CARNE_DI_AGNELLO, IngredientsEnum.GUANCIALE, IngredientsEnum.VINO, IngredientsEnum.PEPRONCINO), true, true));
        menu.addPortata(new SecondiPiatti("Tagliata di manzo con rucola e grana ",13.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FORMAGGIO, IngredientsEnum.POMODORI, IngredientsEnum.OLIO_EVO, IngredientsEnum.PEPRONCINO), true, true));
        menu.addPortata(new SecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco) ",9.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.ACETO, IngredientsEnum.FUNGHI, IngredientsEnum.VINO), false, true));
        //Dolci
        menu.addPortata(new Dolci(true));
        menu.addPortata(new Dolci("Tiramisù al cucchiaio", 9.5,Set.of(IngredientsEnum.ZUCCHERO, IngredientsEnum.UOVA, IngredientsEnum.LATTE, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA), true));
        menu.addPortata(new Dolci("Babà", 10.5,Set.of(IngredientsEnum.FARINA, IngredientsEnum.AROMI, IngredientsEnum.UOVA, IngredientsEnum.RUM), true));
        menu.addPortata(new Dolci("Delizia al limone", 12.0,Set.of(IngredientsEnum.FARINA, IngredientsEnum.LATTE, IngredientsEnum.UOVA, IngredientsEnum.ZUCCHERO), true));
        menu.addPortata(new Dolci("Cannolo alla ricotta", 8, Set.of(IngredientsEnum.FARINA, IngredientsEnum.RICOTTA, IngredientsEnum.CIOCCOLATO, IngredientsEnum.ZUCCHERO), true));
        menu.addPortata(new Dolci("Tartufo al cioccolato", 9,Set.of(IngredientsEnum.FARINA, IngredientsEnum.ZUCCHERO, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA), true));
        menu.addPortata(new Dolci("CheeseCake", 10,Set.of(IngredientsEnum.FORMAGGIO, IngredientsEnum.ZUCCHERO, IngredientsEnum.PANNA), true));
        //Bevande
        menu.addPortata(new Bevande(true, "Bevande: \n Birre:"));
        menu.addPortata(new Bevande("Gradisca 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false));
        menu.addPortata(new Bevande("Gradisca 0.5l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false));
        menu.addPortata(new Bevande("Gradisca 1l", 10.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false));
        menu.addPortata(new Bevande("Midona", 5.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL),true, 5.5, false));
        menu.addPortata(new Bevande("Volpina", 4.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL ), true, 5.0, false));
        menu.addPortata(new Bevande("Volpina", 6.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true, 5.0, false));
        menu.addPortata(new Bevande(true, "Soft Drink:"));
        menu.addPortata(new Bevande("Acqua Nat 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA),false, 0.0, false));
        menu.addPortata(new Bevande("Acqua Gas 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ANIDRIDE_CARBONICA), false, 0.0, false));
        menu.addPortata(new Bevande("Coca Cola 1/2l", 2.5,Set.of(IngredientsEnum.ACQUA, IngredientsEnum.CAFFEINA, IngredientsEnum.ZUCCHERO),false, 0.0, false));
        menu.addPortata(new Bevande("Chinotto 0.33l", 3.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0, false));
        menu.addPortata(new Bevande("Te Pesca 1/2l", 2.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI),false, 0.0, false));
        menu.addPortata(new Bevande("Te Limone 1/2l", 2.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0, false));
        menu.addPortata(new Bevande("Succhi di frutta 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI),false, 0.0, false));
        menu.addPortata(new Bevande(true, "Vini:"));
        menu.addPortata(new Bevande("Rosè frizzante", 10.0,  Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 12.0, false));
        menu.addPortata(new Bevande("Chardonnat", 13.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.5, false));
        menu.addPortata(new Bevande("Merlot", 10.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 13.5, false));
        menu.addPortata(new Bevande("Pinot Noir", 15.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.0, false));

        Ristorante ristorante = new Ristorante("La Taverna di Pulcinella", "Via Libertà 47, Napoli", 9.00, 1.00, 3.50, menu);
        System.out.println(ristorante);
        ristorante.printMenu(menu);

    }
}
