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
    public String[] getNaziv() {return naziv;}
    public int getKod() {return kod;}
    public String[] getCijena() {return cijena;}
}
