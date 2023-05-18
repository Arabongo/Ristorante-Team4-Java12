import javax.sound.sampled.Port;
import java.util.ArrayList;

public class Tavolo {
    private int numeroCoperti;
    private int numeroTavolo;
    private ArrayList<Portata> listaOrdinazioni;
    private ArrayList<Cliente> listaClientiAlTavolo;
    private double conto;
    public Tavolo(int numeroTavolo, int numeroCoperti){
        this.numeroTavolo=numeroTavolo;
        this.numeroCoperti=numeroCoperti;
        this.listaOrdinazioni=new ArrayList<>();
        this.conto=0.0;
        this.listaClientiAlTavolo=new ArrayList<>();
    }

    public ArrayList<Cliente> getListaClientiAlTavolo() {
        return listaClientiAlTavolo;
    }
    public void addListaClientiAlTavolo(Cliente cliente){
        listaClientiAlTavolo.add(cliente);
    }
    public void removeListaClientiAlTavolo(Cliente cliente){
        listaClientiAlTavolo.remove(cliente);
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    public ArrayList<Portata> getListaOrdinazioni() {
        return listaOrdinazioni;
    }

    public void addListaOrdinazioni(Portata portata) {
        listaOrdinazioni.add(portata);
        this.conto+=portata.getPrice();
    }
    public void removeListaOrdinazioni(Portata portata) {
        listaOrdinazioni.remove(portata);
        this.conto-=portata.getPrice();
    }

    public double getConto() {
        return conto;
    }

    public void setConto(double conto) {
        this.conto = conto;
    }
}
