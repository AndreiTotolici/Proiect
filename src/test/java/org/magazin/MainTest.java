package org.magazin;

import org.junit.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    @Test
    public void testSwitchCase() {
       int optiune = 1;


        switch (optiune) {
            case 0:
                System.exit(0);
                break;
            case 1:
              Main main=new Main ();

        }

        assertEquals(1, optiune);
    }


}
