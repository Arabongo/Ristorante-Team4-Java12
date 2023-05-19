import enumerati.TipoMenuEnum;

import java.sql.Timestamp;

public class Prenotazione {
    private String nome;
    private Integer Persone;
    private Timestamp data;
    private Integer indicePrenotazione;
    private Integer numeroTavolo;
    private TipoMenuEnum selectedMenu;

    /**
     * Crea una prenotazione da aggiungere alla lista.
     * @param nome il nome del cliente
     * @param Persone il numero di persone al tavolo
     * @param  data indica giorno e ora della prenotazione
     * @param indicePrenotazione è l'indice con cui identificare la prenotazione
     */
    public Prenotazione(String nome, Integer Persone, Timestamp data, Integer indicePrenotazione, Integer numeroTavolo, TipoMenuEnum selectedMenu) {
        this.nome = nome;
        this.Persone = Persone;
        this.data = data;
        this.indicePrenotazione = indicePrenotazione;
        this.numeroTavolo = numeroTavolo;
        this.selectedMenu = selectedMenu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPersone() {
        return Persone;
    }

    public void setPersone(Integer persone) {
        this.Persone = persone;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public Integer getIndicePrenotazione() {
        return indicePrenotazione;
    }

    public void setIndicePrenotazione(Integer indicePrenotazione) {
        this.indicePrenotazione = indicePrenotazione;
    }

    public Integer getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(Integer numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public TipoMenuEnum getSelectedMenu() {
        return selectedMenu;
    }

    public void setSelectedMenu(TipoMenuEnum selectedMenu) {
        this.selectedMenu = selectedMenu;
    }

    /**
     * Metodo di stampa per le prenotazioni.
     */
    public void PrintPrenotazione() {
       System.out.println("Prenotazione #" + indicePrenotazione + " [" +
                "Nome: " + nome  +
                ", Numero Persone: " + Persone +
                ", Tavolo n°" + numeroTavolo +
                ", Menù scelto: " + selectedMenu +
                ", Data: " + data.toLocalDateTime().toLocalDate() + " alle ore " + data.toLocalDateTime().toLocalTime() + "]");
    }
}
