package enumerati;

public enum TipoMenuEnum {
    CARNE("Menù a base di carne"),
    PESCE("Menù a base di pesce"),
    VEGETARIANO("Menù vegetariano"),

    //TODO tipologie portate

    BIRRE ("Menu Birre"),
    SOFT_DRINK ("Menu Soft Drink"),
    CARTA_VINI ("Carta dei vini"),
    DOLCI ("Menu dei Dolci");
    private final String tipoMenu;
    TipoMenuEnum(String tipoMenu){
        this.tipoMenu=tipoMenu;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }
}


