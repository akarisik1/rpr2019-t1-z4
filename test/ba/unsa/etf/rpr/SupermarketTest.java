package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
Supermarket s = new Supermarket();
    @BeforeEach
    void setUp() {
        s.dodajArtikl(new Artikl("1",10,"123"));
        s.dodajArtikl(new Artikl("2",20,"456"));
    }

    @Test
    void dodajArtikl() {
    }

    @Test
    void getArtikli() {
        Artikl[] artikli = new Artikl[1000];
        artikli[0]= new Artikl("1",10,"123");
        artikli[1]= new Artikl("2",20,"456");
        assertArrayEquals(artikli,s.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        assertEquals(new Artikl("2",20,"456"), s.izbaciArtiklSaKodom("456"));
    }

    @Test
    void getBrojArtikala() {
        assertEquals(2,s.getBrojArtikala());
    }
}