import java.util.ArrayList;

public class Tavolo {
    private Integer numeroCopertiMassimi;
    private Integer numeroTavolo;
    private ArrayList<Portata> listaOrdinazioni;
    private ArrayList<Cliente> listaClientiAlTavolo;
    private double conto;
    public Tavolo(Integer numeroTavolo, Integer numeroCopertiMassimi){
        this.numeroTavolo=numeroTavolo;
        this.numeroCopertiMassimi = numeroCopertiMassimi;
//        this.listaOrdinazioni=new ArrayList<>();
//        this.conto=0.0;
//        this.listaClientiAlTavolo=new ArrayList<>();
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

    public Integer getNumeroCopertiMassimi() {
        return numeroCopertiMassimi;
    }

    public void setNumeroCopertiMassimi(Integer numeroCopertiMassimi) {
        this.numeroCopertiMassimi = numeroCopertiMassimi;
    }

    public Integer getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(Integer numeroTavolo) {
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
