package org.magazin;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ProdusTest {


    @Test
    public void testVanzareProdus() {
        Produs produs = new Produs("Produs 1", 10.0, 5);
        produs.vanzareProdus(3);
        assertEquals(2, produs.getCantitate());

    }
    @Test
    public  void  testcalculateTVA() {
        Produs produs = new Produs("Produs 1", 1000, 5);
        double tva = produs.getPret() *19 / 100;
        assertEquals(190,tva,0.0001);


    }
}
