import java.util.HashMap;

public class Dolci {
        public HashMap<String, Double> menuDolci= new HashMap<>();

        public Dolci(){

        }

        public HashMap<String, Double> getMenuDolci() {
            return menuDolci;
        }

        public void setMenuDolci(HashMap<String, Double> menuDolci) {
            this.menuDolci = menuDolci;
        }

        public void stampaDolci(){
            menuDolci.put("Panna cotta" , 8.55);
            menuDolci.put("Tiramisù al cucchiaio", 9.33);
            menuDolci.put("Frutta di stagione", 10.55);
            menuDolci.put("Babbà", 10d);
            menuDolci.put("Delizia al limone", 12d);
            System.out.println("\n" + "Dolci : " +'\n');
            for (String mapKey : menuDolci.keySet()){
                String stampaMenuDolci = mapKey + '-' + menuDolci.get(mapKey) + '€'+'\n';
                System.out.println(stampaMenuDolci);
            }
        }

    }

