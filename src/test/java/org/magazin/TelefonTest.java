package org.magazin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TelefonTest {

    @Test
    public void testESimTelefon() {
      Telefon telefon = new Telefon("Produs 1", 1000, 5,"Samsung",true);
        telefon.isAreEsim();

        assertEquals(true, telefon.isAreEsim());

    }
    @Test
    public  void  testcalculateTVA() {
        Telefon telefon = new Telefon("Produs 1", 1000, 5,"Samsung",true);
        double tva = telefon.getPret() *19 / 100;
        assertEquals(190,tva,0.0001);


    }


}
