package enumerati;

public enum TipoEnum {
    CARNE("Menu a base di carne"),
    PESCE("Menu a base di pesce"),
    VEGETARIANO("Menu vegetariano"),

    //TODO tipologie portate

    BIRRE ("Menu Birre"),
    SOFT_DRINK ("Menu Soft Drink"),
    CARTA_VINI ("Carta dei vini"),
    DOLCI ("Menu dei Dolci");
    private final String tipoMenu;
    TipoEnum(String tipoMenu){
        this.tipoMenu=tipoMenu;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }
}

