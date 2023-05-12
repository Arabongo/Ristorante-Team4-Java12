public class Prenotazione {
    private String nome;
    private Integer Persone;
    private String data;
    private String ora;
    private Integer indicePrenotazione;

    //TODO passare i tipi giusti
    public Prenotazione(String nome, Integer Persone, String data, String ora, Integer indicePrenotazione) {
        this.nome = nome;
        this.Persone = Persone;
        this.data = data;
        this.ora = ora;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public Integer getIndicePrenotazione() {
        return indicePrenotazione;
    }

    public void setIndicePrenotazione(Integer indicePrenotazione) {
        this.indicePrenotazione = indicePrenotazione;
    }

    //TODO metodo di stampa prenotazione
    @Override
    public String toString() {
        return "Prenotazione #" + indicePrenotazione + " [" +
                "Nome: " + nome  +
                ", Numero Persone: " + Persone +
                ", Data: " + data + " alle ore " + ora + "]";
    }
}
