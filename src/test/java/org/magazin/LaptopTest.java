package org.magazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    @Test
    public void testTipImprimanta() {
       Laptop laptop = new Laptop("Produs 1", 1000, 5,"HP","Intel");
        laptop.getMarcaProdus();
        laptop.getProcessor();
        assertEquals("HP",laptop.getMarcaProdus());

        assertEquals("Intel",laptop.getProcessor());

    }
    @Test
    public  void  testcalculateTVA() {
        Laptop laptop = new Laptop("Produs 1", 1000, 5,"HP","Intel");
        double tva = laptop.getPret() * 19 / 100;
        assertEquals(190, tva, 0.0001);
    }
}
