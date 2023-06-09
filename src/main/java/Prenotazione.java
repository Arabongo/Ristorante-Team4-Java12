import enumerati.TipoMenuEnum;

import java.sql.Timestamp;

public class Prenotazione {
    private String nome;
    private Integer numeroPersone;
    private Timestamp data;
    private Integer indicePrenotazione;
    private Integer numeroTavolo;
    private TipoMenuEnum selectedMenu;

    /**
     * Crea una prenotazione da aggiungere alla lista.
     * @param nome il nome del cliente
     * @param numeroPersone il numero di persone al tavolo
     * @param  data indica giorno e ora della prenotazione
     * @param indicePrenotazione è l'indice con cui identificare la prenotazione
     */
    public Prenotazione(String nome, Integer numeroPersone, Timestamp data, Integer indicePrenotazione, Integer numeroTavolo, TipoMenuEnum selectedMenu) {
        this.nome = nome;
        this.numeroPersone = numeroPersone;
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

    public Integer getNumeroPersone() {
        return numeroPersone;
    }

    public void setNumeroPersone(Integer numeroPersone) {
        this.numeroPersone = numeroPersone;
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

    //TODO rifattorizzare nome PrintPrenotazione
    public void printPrenotazione() {
       System.out.println("Prenotazione #" + indicePrenotazione +
                "Nome: " + nome  +
                ", Numero Persone: " + numeroPersone +
                ", Tavolo n°" + numeroTavolo +
                ", Menù scelto: " + selectedMenu +
                ", Data: " + data.toLocalDateTime().toLocalDate() + " alle ore " + data.toLocalDateTime().toLocalTime());
    }
}
