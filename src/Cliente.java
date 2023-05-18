import enumerati.TipoMenuEnum;

public class Cliente {
    private String nome;
    private String cognome;
    private int numeroDiTelefono;
    private String eMail;
    private TipoMenuEnum preferenzaMenu;


    public Cliente(String nome, String cognome, int numeroDiTelefono, String eMail, TipoMenuEnum preferenzaMenu) {
        this.nome = nome;
        this.cognome = cognome;
        this.numeroDiTelefono = numeroDiTelefono;
        this.eMail = eMail;
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

    public int getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setNumeroDiTelefono(int numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public TipoMenuEnum getPreferenzaMenu() {
        return preferenzaMenu;
    }

    public void setPreferenzaMenu(TipoMenuEnum preferenzaMenu) {
        this.preferenzaMenu = preferenzaMenu;
    }
}
