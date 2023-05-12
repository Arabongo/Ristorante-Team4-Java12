public enum ColorsEnum {
    RESET ("\033[0m", "Resetta il colore di default"),
    // Regular Colors
    RED ("\033[0;31m", "Colore Rosso naturale"),
    GREEN ("\033[0;32m","Colore Verde naturale"),
    YELLOW ("\033[0;33m","Colore giallo naturale"),
    CYAN ("\033[0;36m","Colore ciano naturale"),
    // High Intensity
    RED_BRIGHT ("\033[0;91m","Colore Rosso brillante"),
    GREEN_BRIGHT ("\033[0;92m","Colore Verde brillante"),
    BLUE_BRIGHT ("\033[0;94m","Colore Blu brillante"),
    PURPLE_BRIGHT ("\033[0;95m","Colore Viola brillante");
    private String value;
    private String description;
    ColorsEnum(String value, String description){
        this.value=value;
        this. description=description;
    }


    public String getDescription() {
        return description;
    }
    public String getValue() {
        return value;
    }

}
