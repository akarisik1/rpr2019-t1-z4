package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] sviartikli = new Artikl[1000];
    int  brojArtikalaUMarketu=0;
    public void dodajArtikl(Artikl artikl) {
        if (brojArtikalaUMarketu < 1000) {
            sviartikli[brojArtikalaUMarketu] = artikl;
            brojArtikalaUMarketu++;
        }
    }
        public Artikl[] getArtikli() {return sviartikli;}

        public void izbaciArtiklSaKodom(int kod) {
            for(int i=0; i<brojArtikalaUMarketu; i++) {
                if (kod == sviartikli[i].getKod()) {
                    for(int j=i; j<brojArtikalaUMarketu-1; j++)
                        sviartikli[j]=sviartikli[j+1];
                }
                sviartikli[brojArtikalaUMarketu-1]=null;
                brojArtikalaUMarketu--;
                    }
            }


}
