
import enumerati.IngredientsEnum;
import enumerati.TipoMenuEnum;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws SQLException {

        Menu menuC = new Menu(TipoMenuEnum.CARNE);
        Menu menuV = new Menu(TipoMenuEnum.VEGETARIANO);
        Menu menuP = new Menu(TipoMenuEnum.PESCE);
         //Antipasti
        Antipasti antipasti1 = new Antipasti("Affettato", 7.50, Set.of(IngredientsEnum.CARNE_MISTA), true, 2, true, TipoMenuEnum.CARNE);
        Antipasti antipasti2 = new Antipasti("Vitello Tonnato", 8.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.SALE, IngredientsEnum.OLIO_EVO), true, 4, false, TipoMenuEnum.CARNE);
        Antipasti antipasti3 = new Antipasti("Olive Ascolane", 6.50, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FARINA, IngredientsEnum.FORMAGGIO), true, 1, true, TipoMenuEnum.VEGETARIANO);
        Antipasti antipasti4 = new Antipasti("Cornetti Salati", 5.50, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.FARINA, IngredientsEnum.OLIO_EVO), true, 1, false, TipoMenuEnum.CARNE);
        Antipasti antipasti5= new Antipasti("Insalata di Polpo", 10.0, Set.of(IngredientsEnum.LIMONE, IngredientsEnum.PATATE,IngredientsEnum.PEPE,IngredientsEnum.POLPO),true,1,true, TipoMenuEnum.PESCE);

        menuC.addPortata(antipasti1);
        menuC.addPortata(antipasti2);
        menuC.addPortata(antipasti3);
        menuC.addPortata(antipasti4);
        menuC.addPortata(antipasti5);

        AntipastiDAO antipastiDAO = new AntipastiDAO();

        antipastiDAO.insertAntipasti(antipasti1);
        antipastiDAO.insertAntipasti(antipasti2);
        antipastiDAO.insertAntipasti(antipasti3);
        antipastiDAO.insertAntipasti(antipasti4);
        antipastiDAO.insertAntipasti(antipasti5);

        // Primi Piatti
        PrimiPiatti primiPiatti1 = new PrimiPiatti(" alla Carbonara", 8.99, Set.of(IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PASTA), "Bucatini", true, TipoMenuEnum.CARNE);
        PrimiPiatti primiPiatti2 = new PrimiPiatti(" alla Bolognese", 9.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.POMODORI), "Lasagne", true, TipoMenuEnum.CARNE);
        PrimiPiatti primiPiatti3 = new PrimiPiatti(" all'Amatriciana", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.GUANCIALE, IngredientsEnum.FORMAGGIO), "Spaghettoni", true, TipoMenuEnum.CARNE);
        PrimiPiatti primiPiatti4 = new PrimiPiatti(" alla milanese", 7.99, Set.of(IngredientsEnum.RISO, IngredientsEnum.AROMI, IngredientsEnum.PEPE), "Risotto", true, TipoMenuEnum.VEGETARIANO);
        PrimiPiatti primiPiatti5 = new PrimiPiatti(" alla gricia", 8.99, Set.of(IngredientsEnum.PASTA, IngredientsEnum.UOVA, IngredientsEnum.GUANCIALE, IngredientsEnum.PEPE), "Calamarata", true, TipoMenuEnum.CARNE);
        PrimiPiatti primiPiatti6= new PrimiPiatti("al Coccio", 12.0,Set.of(IngredientsEnum.PASTA,IngredientsEnum.PEPRONCINO,IngredientsEnum.PEPE,IngredientsEnum.COCCIO,IngredientsEnum.POMODORI),"Paccheri",true, TipoMenuEnum.PESCE);
        menuC.addPortata(primiPiatti1);
        menuC.addPortata(primiPiatti2);
        menuC.addPortata(primiPiatti3);
        menuC.addPortata(primiPiatti4);
        menuC.addPortata(primiPiatti5);
        menuC.addPortata(primiPiatti6);

        PrimiPiattiDAO primiPiattiDAO = new PrimiPiattiDAO();

        primiPiattiDAO.insertPrimiPiatti(primiPiatti1);
        primiPiattiDAO.insertPrimiPiatti(primiPiatti2);
        primiPiattiDAO.insertPrimiPiatti(primiPiatti3);
        primiPiattiDAO.insertPrimiPiatti(primiPiatti4);
        primiPiattiDAO.insertPrimiPiatti(primiPiatti5);

        // Secondi Piatti
        SecondiPiatti secondiPiatti1 = new SecondiPiatti("Filetto di maiale al forno con salvia",11.99, Set.of(IngredientsEnum.CARNE_DI_MAIALE, IngredientsEnum.AROMI, IngredientsEnum.PATATE), false, true, TipoMenuEnum.CARNE);
        SecondiPiatti secondiPiatti2 = new SecondiPiatti("Grigliata di carne",13.99, Set.of(IngredientsEnum.CARNE_MISTA, IngredientsEnum.AROMI, IngredientsEnum.PEPE), true, true, TipoMenuEnum.CARNE);
        SecondiPiatti secondiPiatti3 = new SecondiPiatti("Cotoletta alla milanese ", 7.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.UOVA, IngredientsEnum.LIMONE), false, true, TipoMenuEnum.CARNE);
        SecondiPiatti secondiPiatti4 = new SecondiPiatti("Costine d’agnello alla griglia ",10.99, Set.of(IngredientsEnum.CARNE_DI_AGNELLO, IngredientsEnum.GUANCIALE, IngredientsEnum.VINO, IngredientsEnum.PEPRONCINO), true, true, TipoMenuEnum.CARNE);
        SecondiPiatti secondiPiatti5 = new SecondiPiatti("Tagliata di manzo con rucola e grana ",13.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.FORMAGGIO, IngredientsEnum.POMODORI, IngredientsEnum.OLIO_EVO, IngredientsEnum.PEPRONCINO), true, true, TipoMenuEnum.CARNE);
        SecondiPiatti secondiPiatti6 = new SecondiPiatti("Scaloppine (all’aceto / ai funghi porcini/ al vino bianco) ",9.99, Set.of(IngredientsEnum.CARNE_DI_VITELLO, IngredientsEnum.ACETO, IngredientsEnum.FUNGHI, IngredientsEnum.VINO), false, true, TipoMenuEnum.CARNE);
        SecondiPiatti secondiPiatti7= new SecondiPiatti("Parmigiana di melanzane", 7.50, Set.of(IngredientsEnum.FORMAGGIO,IngredientsEnum.POMODORI,IngredientsEnum.OLIO_EVO,IngredientsEnum.MOZZARELLA),false, true, TipoMenuEnum.VEGETARIANO);
        SecondiPiatti secondiPiatti8= new SecondiPiatti("Grigliata di Pesce", 15.0, Set.of(IngredientsEnum.SALE,IngredientsEnum.LIMONE,IngredientsEnum.OLIO_EVO,IngredientsEnum.PESCATO_DEL_GIORNO), true, true, TipoMenuEnum.PESCE);
        menuC.addPortata(secondiPiatti1);
        menuC.addPortata(secondiPiatti2);
        menuC.addPortata(secondiPiatti3);
        menuC.addPortata(secondiPiatti4);
        menuC.addPortata(secondiPiatti5);
        menuC.addPortata(secondiPiatti6);
        menuC.addPortata(secondiPiatti7);
        menuC.addPortata(secondiPiatti8);

        //Dolci
        Dolci dolci1 = new Dolci("Tiramisù al cucchiaio", 9.5,Set.of(IngredientsEnum.ZUCCHERO, IngredientsEnum.UOVA, IngredientsEnum.LATTE, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA), true, TipoMenuEnum.DOLCI);
        Dolci dolci2 = new Dolci("Babà", 10.5,Set.of(IngredientsEnum.FARINA, IngredientsEnum.AROMI, IngredientsEnum.UOVA, IngredientsEnum.RUM), true, TipoMenuEnum.DOLCI);
        Dolci dolci3 = new Dolci("Delizia al limone", 12.0,Set.of(IngredientsEnum.FARINA, IngredientsEnum.LATTE, IngredientsEnum.UOVA, IngredientsEnum.ZUCCHERO), true, TipoMenuEnum.DOLCI);
        Dolci dolci4 = new Dolci("Cannolo alla ricotta", 8, Set.of(IngredientsEnum.FARINA, IngredientsEnum.RICOTTA, IngredientsEnum.CIOCCOLATO, IngredientsEnum.ZUCCHERO), true, TipoMenuEnum.DOLCI);
        Dolci dolci5 = new Dolci("Tartufo al cioccolato", 9,Set.of(IngredientsEnum.FARINA, IngredientsEnum.ZUCCHERO, IngredientsEnum.CIOCCOLATO, IngredientsEnum.CAFFEINA), true, TipoMenuEnum.DOLCI);
        Dolci dolci6 = new Dolci("CheeseCake", 10,Set.of(IngredientsEnum.FORMAGGIO, IngredientsEnum.ZUCCHERO, IngredientsEnum.PANNA), true, TipoMenuEnum.DOLCI);
        menuC.addPortata(dolci1);
        menuC.addPortata(dolci2);
        menuC.addPortata(dolci3);
        menuC.addPortata(dolci4);
        menuC.addPortata(dolci5);
        menuC.addPortata(dolci6);

        //Bevande - Birre
        Bevande bevande1 = new Bevande("Gradisca 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false, TipoMenuEnum.BIRRE);
        Bevande bevande2 = new Bevande("Gradisca 0.5l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false, TipoMenuEnum.BIRRE);
        Bevande bevande3 = new Bevande("Gradisca 1l", 10.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true,4.5, false, TipoMenuEnum.BIRRE);
        Bevande bevande4 = new Bevande("Midona", 5.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL),true, 5.5, false, TipoMenuEnum.BIRRE);
        Bevande bevande5 = new Bevande("Volpina", 4.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL ), true, 5.0, false, TipoMenuEnum.BIRRE);
        Bevande bevande6 = new Bevande("Volpina", 6.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.LUPPOLO, IngredientsEnum.ALCOL), true, 5.0, false, TipoMenuEnum.BIRRE);
        menuC.addPortata(bevande1);
        menuC.addPortata(bevande2);
        menuC.addPortata(bevande3);
        menuC.addPortata(bevande4);
        menuC.addPortata(bevande5);
        menuC.addPortata(bevande6);

        //Bevande - Soft Drink
        Bevande bevande7 = new Bevande("Acqua Nat 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA),false, 0.0, false, TipoMenuEnum.SOFT_DRINK);
        Bevande bevande8 = new Bevande("Acqua Gas 1/2l", 1.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ANIDRIDE_CARBONICA), false, 0.0, false, TipoMenuEnum.SOFT_DRINK);
        Bevande bevande9 = new Bevande("Coca Cola 1/2l", 2.5,Set.of(IngredientsEnum.ACQUA, IngredientsEnum.CAFFEINA, IngredientsEnum.ZUCCHERO),false, 0.0, false, TipoMenuEnum.SOFT_DRINK);
        Bevande bevande10 = new Bevande("Chinotto 0.33l", 3.0, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0, false, TipoMenuEnum.SOFT_DRINK);
        Bevande bevande11 = new Bevande("Te Pesca 1/2l", 2.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI),false, 0.0, false, TipoMenuEnum.SOFT_DRINK);
        Bevande bevande12 = new Bevande("Te Limone 1/2l", 2.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI), false, 0.0, false, TipoMenuEnum.SOFT_DRINK);
        Bevande bevande13 = new Bevande("Succhi di frutta 0.33l", 3.5, Set.of(IngredientsEnum.ACQUA, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI),false, 0.0, false, TipoMenuEnum.SOFT_DRINK);
        menuC.addPortata(bevande7);
        menuC.addPortata(bevande8);
        menuC.addPortata(bevande9);
        menuC.addPortata(bevande10);
        menuC.addPortata(bevande11);
        menuC.addPortata(bevande12);
        menuC.addPortata(bevande13);

        //Bevande - Vini
        Bevande bevande14 = new Bevande("Rosè frizzante", 10.0,  Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 12.0, false, TipoMenuEnum.CARTA_VINI);
        Bevande bevande15 = new Bevande("Chardonnat", 13.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.5, false, TipoMenuEnum.CARTA_VINI);
        Bevande bevande16 = new Bevande("Merlot", 10.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 13.5, false, TipoMenuEnum.CARTA_VINI);
        Bevande bevande17 = new Bevande("Pinot Noir", 15.0, Set.of(IngredientsEnum.ALCOL, IngredientsEnum.ZUCCHERO, IngredientsEnum.AROMI, IngredientsEnum.MOSTO, IngredientsEnum.VINO), true, 11.0, false, TipoMenuEnum.CARTA_VINI);
        menuC.addPortata(bevande14);
        menuC.addPortata(bevande15);
        menuC.addPortata(bevande16);
        menuC.addPortata(bevande17);

        BevandeDAO bevandeDAO = new BevandeDAO();
        bevandeDAO.insertBevande(bevande1);
        bevandeDAO.insertBevande(bevande2);
        bevandeDAO.insertBevande(bevande3);
        bevandeDAO.insertBevande(bevande4);
        bevandeDAO.insertBevande(bevande5);
        bevandeDAO.insertBevande(bevande6);
        bevandeDAO.insertBevande(bevande7);
        bevandeDAO.insertBevande(bevande8);
        bevandeDAO.insertBevande(bevande9);
        bevandeDAO.insertBevande(bevande10);
        bevandeDAO.insertBevande(bevande11);
        bevandeDAO.insertBevande(bevande12);
        bevandeDAO.insertBevande(bevande13);
        bevandeDAO.insertBevande(bevande14);
        bevandeDAO.insertBevande(bevande15);
        bevandeDAO.insertBevande(bevande16);
        bevandeDAO.insertBevande(bevande17);

        Ristorante ristorante = new Ristorante("La Taverna di Pulcinella", "Via Libertà 47, Napoli", Timestamp.valueOf("2023-05-11 09:00:00"), Timestamp.valueOf("2023-06-11 01:00:00"), 3.50, menuC, 1);
        ristorante.printInfoRistorante();

        Tavolo tavolo1 = new Tavolo(1, 4);
        Tavolo tavolo2 = new Tavolo(2, 3);

        Cliente cliente1 = new Cliente("Franco Paglia", 123456789, "FrancoPaglia@gmail.com", TipoMenuEnum.VEGETARIANO);
        Cliente cliente2 = new Cliente("Riccardo Neri", 987654321, "RiccardoNeri@gmail.com", TipoMenuEnum.CARNE);

        ristorante.addPrenotazione(cliente1, 4, Timestamp.valueOf("2023-05-15 20:00:00"), tavolo1);
        ristorante.addPrenotazione(cliente2, 2, Timestamp.valueOf("2023-05-16 13:30:00"), tavolo2);
        ristorante.printPrenotazioni();

        RistoranteDAO ristoranteDAO = new RistoranteDAO();
        ristoranteDAO.createRistorante(ristorante);
//        ristorante.removePrenotazione(1);
//        ristorante.printPrenotazioni();
    }
}
