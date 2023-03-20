package org.magazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImprimantaTest {
    @Test
    public void testTipImprimanta() {
        Imprimanta imprimanta = new Imprimanta("Produs 1", 1000, 5,"Epson","Laser");
        imprimanta.getTipImprimanta();
        imprimanta.getMarcaProdus();
        assertEquals("Epson",imprimanta.getMarcaProdus());

        assertEquals("Laser", imprimanta.getTipImprimanta());

    }
    @Test
    public  void  testcalculateTVA() {
        Imprimanta imprimanta = new Imprimanta("Produs 1", 1000, 5, "Epson", "Laser");
        double tva = imprimanta.getPret() * 19 / 100;
        assertEquals(190, tva, 0.0001);
    }
}
