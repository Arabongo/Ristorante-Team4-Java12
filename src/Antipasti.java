import java.util.*;

public class Antipasti {
    private String nome;
    private Double prezzo;

    Antipasti(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public void print(){
        String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        System.out.println(ANSI_YELLOW_BACKGROUND + nome + prezzo +ANSI_YELLOW_BACKGROUND);
    }
}
