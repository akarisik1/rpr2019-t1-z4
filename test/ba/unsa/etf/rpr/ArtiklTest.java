package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl artikl = new Artikl("Olovka", 5, "12345");
        assertTrue(artikl.getNaziv() == "Olovka");
    }

    @Test
    void getCijena() {
        Artikl artikl = new Artikl("Olovka", 5, "12345");
        assertTrue(artikl.getCijena() == 5);
    }

    @Test
    void getKod() {
        Artikl artikl = new Artikl("Olovka", 5, "12345");
        assertTrue(artikl.getKod() == "12345");
    }
}