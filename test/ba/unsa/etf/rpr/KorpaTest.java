package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    Korpa k = new Korpa();
    @BeforeEach
    void setUp() {
        k.dodajArtikl(new Artikl("1",10,"123"));
        k.dodajArtikl(new Artikl("2",20,"456"));
    }

    @Test
    void dodajArtikl() {
        assertTrue(k.dodajArtikl(new Artikl("3",30,"789")));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        assertEquals(30,k.dajUkupnuCijenuArtikala());
    }

    @Test
    void getArtikli() {
        Artikl[] artikli = new Artikl[50];
        artikli[0]= new Artikl("1",10,"123");
        artikli[1]= new Artikl("2",20,"456");
        assertArrayEquals(artikli,k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        assertEquals(new Artikl("2",20,"456"),k.izbaciArtiklSaKodom("456"));
    }


}