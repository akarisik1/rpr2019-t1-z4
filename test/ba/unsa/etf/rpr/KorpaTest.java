package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    Korpa k = null;
    @BeforeEach
    void setUp() {
        k.dodajArtikl(new Artikl("1",10,"12345"));
        k.dodajArtikl(new Artikl("2",20,"12346"));
    }

    @Test
    void dodajArtikl() {

    }

    @Test
    void dajUkupnuCijenuArtikala() {
    }

    @Test
    void getArtikli() {
        Artikl[] artikli = new Artikl[2];
        artikli[0]=new Artikl("1",10,"12345");
        artikli[1]=new Artikl("2", 20, "12346");
        assertArrayEquals(artikli, k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
    }


}