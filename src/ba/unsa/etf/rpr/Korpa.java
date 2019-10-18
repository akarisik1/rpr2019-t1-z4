package ba.unsa.etf.rpr;

public class Korpa {

    int brojArtikalaUKorpi=0;
    Artikl[] artikliUKorpi = new Artikl[50];

    public boolean dodajArtikl(Artikl artikl) {
        if(brojArtikalaUKorpi<50) {
            artikliUKorpi[brojArtikalaUKorpi] = artikl;
            brojArtikalaUKorpi++;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(int kod) {
        Artikl a = null;
        for(int i=0; i<brojArtikalaUKorpi; i++) {
            if(kod==artikliUKorpi[i].getKod()) {
                for(int j=i; j<brojArtikalaUKorpi-1; j++)
                    artikliUKorpi[j]=artikliUKorpi[j+1];
            }
            artikliUKorpi[brojArtikalaUKorpi-1]=null;
            brojArtikalaUKorpi--;
        }
        return a;
    }
    public Artikl[] getArtikli() {return artikliUKorpi;}

    public int dajUkupnuCijenuArtikala(){
        int ukupnaCijena = 0;
        for (Artikl a: artikliUKorpi) {
            ukupnaCijena+=Integer.parseInt(a.getCijena());
        }
        return ukupnaCijena;
    }



}
