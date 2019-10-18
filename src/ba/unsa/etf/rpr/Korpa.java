package ba.unsa.etf.rpr;

public class Korpa {

    int brojArtikalaUKorpi=0;
    Artikl[] artikliUKorpi = new Artikl[50]

    public void dodajArtikl(Artikl artikl) {
        artikliUKorpi[brojArtikalaUKorpi]=artikl;
        brojArtikalaUKorpi++;
    }

    public void izbaciArtiklSaKodom(int kod) {
        for(int i=0; i<brojArtikalaUKorpi; i++) {
            if(kod==artikliUKorpi[i].getKod()) {
                for(int j=i; j<brojArtikalaUKorpi-1; j++)
                    artikliUKorpi[j]=artikliUKorpi[j+1];
            }
            artikliUKorpi[brojArtikalaUKorpi-1]=null;
            brojArtikalaUKorpi--;
        }
    }
    public int getArtikli() {
        for(Artikl a: artikliUKorpi){
            System.out.println("Naziv: " + a.getNaziv() + ", Kod: " + a.getKod() + ", Cijena: " + a.getCijena() + " KM");
        }
    }
    public int dajUkupnuCijenuArtikala(){
        int ukupnaCijena = 0;
        for (Artikl a: artikliUKorpi) {
            ukupnaCijena+=a.getCijena();
        }
        return ukupnaCijena;
    }



}
