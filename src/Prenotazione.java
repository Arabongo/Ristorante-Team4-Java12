import java.sql.Time;
import java.sql.Timestamp;

public class Prenotazione {
    private String nome;
    private Integer Persone;
    private Timestamp data;
    private Integer indicePrenotazione;

    /**
     * Crea una prenotazione da aggiungere alla lista.
     * @param nome il nome del cliente
     * @param Persone il numero di persone al tavolo
     * @param  data indica giorno e ora della prenotazione
     * @param indicePrenotazione è l'indice con cui identificare la prenotazione
     */
    public Prenotazione(String nome, Integer Persone, Timestamp data, Integer indicePrenotazione) {
        this.nome = nome;
        this.Persone = Persone;
        this.data = data;
        this.indicePrenotazione = indicePrenotazione;
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

    /**
     * Metodo di stampa per le prenotazioni.
     */
    public void PrintPrenotazione() {
       System.out.println("Prenotazione #" + indicePrenotazione + " [" +
                "Nome: " + nome  +
                ", Numero Persone: " + Persone +
                ", Data: " + data.toLocalDateTime().toLocalDate() + " alle ore " + data.toLocalDateTime().toLocalTime() + "]");
    }
}
