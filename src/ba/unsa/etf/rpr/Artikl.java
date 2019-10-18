package ba.unsa.etf.rpr;

public class Artikl {
    String[] naziv;
    int kod;
    String[] cijena;
   public Artikl(String[] naziv, int kod, String[] cijena){
        this.naziv=naziv;
        this.kod=kod;
        this.cijena=cijena;
    }
    public void getNaziv() {return naziv;}
    public void getKod() {return kod;}
    public void getCijena() {return cijena;}
}
