
import enumerati.IngredientsEnum;
import enumerati.TipoEnum;

import java.sql.Timestamp;
import java.util.Set;

public class Main {

    private static Set<IngredientsEnum> listaComune;

    public static void main(String[] args) {


        Set<IngredientsEnum>listaComune = Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI);
        Menu menu = new Menu();
         //Antipasti
        Antipasti antipasti1 = new Antipasti("Affettato", 7.50, Set.of(IngredientsEnum.CARNE_MISTA), true, 2, true, TipoEnum.CARNE);
        Antipasti antipasti2 = new Antipasti("Vitello Tonnato", 8.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.SALE, IngredientsEnum.OLIO_EVO), true, 4, false, TipoEnum.CARNE);
        Antipasti antipasti3 = new Antipasti("Olive Ascolane", 6.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FARINA, IngredientsEnum.FORMAGGIO), true, 1, true, TipoEnum.VEGETARIANO);
        Antipasti antipasti4 = new Antipasti("Cornetti Salati", 5.50, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.FARINA, IngredientsEnum.OLIO_EVO), true, 1, false, TipoEnum.CARNE);
        Antipasti antipasti5= new Antipasti("Insalata di Polpo", 10.0, Set.of(IngredientsEnum.LIMONE, IngredientsEnum.PATATE,IngredientsEnum.PEPE,IngredientsEnum.POLPO),true,1,true, TipoEnum.PESCE);
        menu.addPortata(antipasti1);
        menu.addPortata(antipasti2);
        menu.addPortata(antipasti3);
        menu.addPortata(antipasti4);
        menu.addPortata(antipasti5);
        // Primi Piatti
        PrimiPiatti primiPiatti1 = new PrimiPiatti(" alla Carbonara", 8.99, Set.of(IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PASTA), "Bucatini", true, TipoEnum.CARNE);
        PrimiPiatti primiPiatti2 = new PrimiPiatti(" alla Bolognese", 9.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.POMODORI), "Lasagne", true, TipoEnum.CARNE);
        PrimiPiatti primiPiatti3 = new PrimiPiatti(" all'Amatriciana", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.GUANCIALE, IngredientsEnum.FORMAGGIO), "Spaghettoni", true, TipoEnum.CARNE);
        PrimiPiatti primiPiatti4 = new PrimiPiatti(" alla milanese", 7.99, Set.of(IngredientsEnum.RISO, IngredientsEnum.AROMI, IngredientsEnum.PEPE), "Risotto", true, TipoEnum.VEGETARIANO);
        PrimiPiatti primiPiatti5 = new PrimiPiatti(" alla gricia", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PEPE), "Calamarata", true, TipoEnum.CARNE);
        PrimiPiatti primiPiatti6= new PrimiPiatti("al Coccio", 12.0,Set.of(IngredientsEnum.PASTA,IngredientsEnum.PEPRONCINO,IngredientsEnum.PEPE,IngredientsEnum.COCCIO,IngredientsEnum.POMODORI),"Paccheri",true, TipoEnum.PESCE);
        menu.addPortata(primiPiatti1);
        menu.addPortata(primiPiatti2);
        menu.addPortata(primiPiatti3);
        menu.addPortata(primiPiatti4);
        menu.addPortata(primiPiatti5);
        menu.addPortata(primiPiatti6);

        // Secondi Piatti
        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Filetto di maiale al forno con salvia",11.99, Set.of(IngredientsEnum.CARNE_DI_MAIALE, IngredientsEnum.AROMI, IngredientsEnum.PATATE), false, true, TipoEnum.CARNE);
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Grigliata di carne",13.99, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.AROMI, IngredientsEnum.PEPE), true, true, TipoEnum.CARNE);
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Cotoletta alla milanese ", 7.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.UOVA, IngredientsEnum.LIMONE), false, true, TipoEnum.CARNE);
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Costine d’agnello alla griglia ",10.99, Set.of(IngredientsEnum.CARNE_DI_AGNELLO, IngredientsEnum.GUANCIALE, IngredientsEnum.VINO, IngredientsEnum.PEPRONCINO), true, true, TipoEnum.CARNE);
        SecondiPiatti secondiPiatti5 = new SecondiPiatti("Tagliata di manzo con rucola e grana ",13.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FORMAGGIO, IngredientsEnum.POMODORI, IngredientsEnum.OLIO_EVO, IngredientsEnum.PEPRONCINO), true, true, TipoEnum.CARNE);
        SecondiPiatti secondiPiatti6 = new SecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco) ",9.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.ACETO, IngredientsEnum.FUNGHI, IngredientsEnum.VINO), false, true, TipoEnum.CARNE);
        SecondiPiatti secondiPiatti7= new SecondiPiatti("Parmigiana di melanzane", 7.50, Set.of(IngredientsEnum.FORMAGGIO,IngredientsEnum.POMODORI,IngredientsEnum.OLIO_EVO,IngredientsEnum.MOZZARELLA),false, true, TipoEnum.VEGETARIANO);
        SecondiPiatti secondiPiatti8= new SecondiPiatti("Grigliata di Pesce", 15.0, Set.of(IngredientsEnum.SALE,IngredientsEnum.LIMONE,IngredientsEnum.OLIO_EVO,IngredientsEnum.PESCATO_DEL_GIORNO), true, true, TipoEnum.PESCE);
        menu.addPortata(secondiPiatti1);
        menu.addPortata(secondiPiatti2);
        menu.addPortata(secondiPiatti3);
        menu.addPortata(secondiPiatti4);
        menu.addPortata(secondiPiatti5);
        menu.addPortata(secondiPiatti6);
        menu.addPortata(secondiPiatti7);
        menu.addPortata(secondiPiatti8);
        //Dolci
        Dolci dolci1 = new Dolci("Tiramisù al cucchiaio", 9.5,Set.of(IngredientsEnum.ZUCCHERO, IngredientsEnum.UOVA, IngredientsEnum.LATTE, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA), true, TipoEnum.DOLCI);
        Dolci dolci2 = new Dolci("Babà", 10.5,Set.of(IngredientsEnum.FARINA, IngredientsEnum.AROMI, IngredientsEnum.UOVA, IngredientsEnum.RUM), true, TipoEnum.DOLCI);
        Dolci dolci3 = new Dolci("Delizia al limone", 12.0,Set.of(IngredientsEnum.FARINA, IngredientsEnum.LATTE, IngredientsEnum.UOVA, IngredientsEnum.ZUCCHERO), true, TipoEnum.DOLCI);
        Dolci dolci4 = new Dolci("Cannolo alla ricotta", 8, Set.of(IngredientsEnum.FARINA, IngredientsEnum.RICOTTA, IngredientsEnum.CIOCCOLATO, IngredientsEnum.ZUCCHERO), true, TipoEnum.DOLCI);
        Dolci dolci5 = new Dolci("Tartufo al cioccolato", 9,Set.of(IngredientsEnum.FARINA, IngredientsEnum.ZUCCHERO, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA), true, TipoEnum.DOLCI);
        Dolci dolci6 = new Dolci("CheeseCake", 10,Set.of(IngredientsEnum.FORMAGGIO, IngredientsEnum.ZUCCHERO, IngredientsEnum.PANNA), true, TipoEnum.DOLCI);
        menu.addPortata(dolci1);
        menu.addPortata(dolci2);
        menu.addPortata(dolci3);
        menu.addPortata(dolci4);
        menu.addPortata(dolci5);
        menu.addPortata(dolci6);
        //Bevande - Birre
        Bevande bevande1 = new Bevande("Gradisca 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false, TipoEnum.BIRRE);
        Bevande bevande2 = new Bevande("Gradisca 0.5l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false, TipoEnum.BIRRE);
        Bevande bevande3 = new Bevande("Gradisca 1l", 10.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false, TipoEnum.BIRRE);
        Bevande bevande4 = new Bevande("Midona", 5.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL),true, 5.5, false, TipoEnum.BIRRE);
        Bevande bevande5 = new Bevande("Volpina", 4.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL ), true, 5.0, false, TipoEnum.BIRRE);
        Bevande bevande6 = new Bevande("Volpina", 6.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true, 5.0, false, TipoEnum.BIRRE);
        menu.addPortata(bevande1);
        menu.addPortata(bevande2);
        menu.addPortata(bevande3);
        menu.addPortata(bevande4);
        menu.addPortata(bevande5);
        menu.addPortata(bevande6);
        //Bevande - Soft Drink
        Bevande bevande7 = new Bevande("Acqua Nat 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA),false, 0.0, false, TipoEnum.SOFT_DRINK);
        Bevande bevande8 = new Bevande("Acqua Gas 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ANIDRIDE_CARBONICA), false, 0.0, false, TipoEnum.SOFT_DRINK);
        Bevande bevande9 = new Bevande("Coca Cola 1/2l", 2.5,Set.of(IngredientsEnum.ACQUA, IngredientsEnum.CAFFEINA, IngredientsEnum.ZUCCHERO),false, 0.0, false, TipoEnum.SOFT_DRINK);
        Bevande bevande10 = new Bevande("Chinotto 0.33l", 3.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0, false, TipoEnum.SOFT_DRINK);
        Bevande bevande11 = new Bevande("Te Pesca 1/2l", 2.5, listaComune,false, 0.0, false, TipoEnum.SOFT_DRINK);
        Bevande bevande12 = new Bevande("Te Limone 1/2l", 2.5, listaComune, false, 0.0, false, TipoEnum.SOFT_DRINK);
        Bevande bevande13 = new Bevande("Succhi di frutta 0.33l", 3.5, listaComune,false, 0.0, false, TipoEnum.SOFT_DRINK);
        menu.addPortata(bevande7);
        menu.addPortata(bevande8);
        menu.addPortata(bevande9);
        menu.addPortata(bevande10);
        menu.addPortata(bevande11);
        menu.addPortata(bevande12);
        menu.addPortata(bevande13);
        //Bevande - Vini
        Bevande bevande14 = new Bevande("Rosè frizzante", 10.0,  Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 12.0, false, TipoEnum.CARTA_VINI);
        Bevande bevande15 = new Bevande("Chardonnat", 13.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.5, false, TipoEnum.CARTA_VINI);
        Bevande bevande16 = new Bevande("Merlot", 10.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 13.5, false, TipoEnum.CARTA_VINI);
        Bevande bevande17 = new Bevande("Pinot Noir", 15.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.0, false, TipoEnum.CARTA_VINI);
        menu.addPortata(bevande14);
        menu.addPortata(bevande15);
        menu.addPortata(bevande16);
        menu.addPortata(bevande17);

        Timestamp openingHours = Timestamp.valueOf("2023-05-11 09:00:00");
        Timestamp closingHours = Timestamp.valueOf("2023-06-11 01:00:00");

        Ristorante ristorante = new Ristorante("La Taverna di Pulcinella", "Via Libertà 47, Napoli", openingHours, closingHours, 3.50, menu);
        ristorante.printInfoRistorante();

        //TODO passiamo già tutto in formato timestamp
        ristorante.addPrenotazione("Franco Paglia", 4, Timestamp.valueOf("2023-05-15 20:00:00"));
        ristorante.addPrenotazione("Riccardo Neri", 2, Timestamp.valueOf("2023-05-16 13:30:00"));
        ristorante.printPrenotazioni();
        ristorante.removePrenotazione(1);
        ristorante.printPrenotazioni();
    }
}
