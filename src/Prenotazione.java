import java.sql.Time;
import java.sql.Timestamp;

public class Prenotazione {
    private String nome;
    private Integer Persone;
    private Timestamp data;
    private Timestamp ora;
    private Integer indicePrenotazione;

    //TODO passare i tipi giusti
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

    public void PrintPrenotazione() {
       System.out.println("Prenotazione #" + indicePrenotazione + " [" +
                "Nome: " + nome  +
                ", Numero Persone: " + Persone +
                ", Data: " + data.toLocalDateTime().toLocalDate() + " alle ore " + data.toLocalDateTime().toLocalTime() + "]");
    }
}
