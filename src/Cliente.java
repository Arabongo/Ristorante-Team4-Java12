import enumerati.TipoMenuEnum;

public class Cliente {
    private String nome;
    private String cognome;
    private TipoMenuEnum preferenzaMenu;


    public Cliente(String nome, String cognome, TipoMenuEnum preferenzaMenu) {
        this.nome = nome;
        this.cognome = cognome;
        this.preferenzaMenu = preferenzaMenu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public TipoMenuEnum getPreferenzaMenu() {
        return preferenzaMenu;
    }

    public void setPreferenzaMenu(TipoMenuEnum preferenzaMenu) {
        this.preferenzaMenu = preferenzaMenu;
    }
}
