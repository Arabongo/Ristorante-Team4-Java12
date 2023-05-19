import enumerati.TipoMenuEnum;

public class Cliente {
    private String nome;
    private int numeroDiTelefono;
    private String eMail;
    private TipoMenuEnum preferenzaMenu;


    public Cliente(String nome, int numeroDiTelefono, String eMail, TipoMenuEnum preferenzaMenu) {
        this.nome = nome;
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
