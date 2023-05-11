public enum TipoMenuEnum {
    CARNE("Menu a base di carne"),
    PESCE("Menu a base di pesce"),
    VEGETARIANO("Menu vegetariano"),
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


