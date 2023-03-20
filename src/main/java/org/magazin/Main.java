package org.magazin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produs produs1 = new Laptop("Latitude",3500,20,"Hp","Intel");
        Produs produs2 = new Imprimanta("D400",750, 15,"Epson","laser");
        Produs produs3 = new Telefon("14 Pro Max",6000,30,"IPhone",true);
        Produs produs4 = new Laptop("Legion",5500,10,"Lenovo","AMD");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Buna ziua !");

     while (true) {

         System.out.println("\n Alegeti o optiune :\n" +
                 "0 – Iesire din program.\n" +
                 "1 –  Arata produse \n" +
                 "2 –  Arata valoare stoc total produs \n" +
                 "3 –  Pret produs cu TVA\n" +
                 "4 –  Iesire din stoc \n" +
                 "5 –  Intrare in stoc \n");

         int optiune = scanner.nextInt();

         switch (optiune) {
             case 0:
                 System.exit(0);
                 break;
             case 1:
                 System.out.println("Acestea sunt produsele din stoc: ");
                 produs1.infoProdus();
                 produs2.infoProdus();
                 produs3.infoProdus();
                 produs4.infoProdus();
                 System.out.println("Produsele nu contin TVA ");
                 break;
             case 2:
                 System.out.println("Valoare  stocuri: ");
                 produs1.valTotal();
                 produs2.valTotal();
                 produs3.valTotal();
                 produs4.valTotal();
                 break;
             case 3:
                 System.out.println("Calculare pret cu TVA");
                 produs1.calculateTVA();
                 produs2.calculateTVA();
                 produs3.calculateTVA();
                 produs4.calculateTVA();
                 break;
             case 4:
                 System.out.println("Vinde un produs");

                 System.out.println("Alegeti o optiune :\n" +
                         "1 – " + produs1.getNume() + "\n" +
                         "2 – " + produs2.getNume() + "\n" +
                         "3 – " + produs3.getNume() + "\n" +
                         "4 – " + produs4.getNume() + "\n");
                 int y = scanner.nextInt();
                 System.out.println("Introduceti numarul de bucati");
                 int z = scanner.nextInt();
                 switch (y) {
                     case 1:
                         produs1.vanzareProdus(z);
                         System.out.println("Ati vandut  : " + z + "buc  " + produs1.getNume());
                         break;
                     case 2:
                         produs2.vanzareProdus(z);
                         System.out.println("Ati vandut  : " + z + "buc  " + produs2.getNume());
                         break;
                     case 3:
                         produs3.vanzareProdus(z);
                         System.out.println("Ati vandut  : " + z + "buc  " + produs3.getNume());
                         break;
                     case 4:
                         produs4.vanzareProdus(z);
                         System.out.println("Ati vandut  : " + z + "buc  " + produs4.getNume());
                         break;
                     }default:
                         System.out.println("La revedere");
             break;

             case 5:
                 System.out.println("Intrare produs");
                 System.out.println("Alegeti o optiune :\n" +
                         "1 – " + produs1.getNume() + "\n" +
                         "2 – " + produs2.getNume() + "\n" +
                         "3 – " + produs3.getNume() + "\n" +
                         "4 – " + produs4.getNume() + "\n");
                 y = scanner.nextInt();
                 System.out.println("Introduceti numarul de bucati");
                 z = scanner.nextInt();
                 switch (y) {
                     case 1:
                         produs1.intrareProdus(z);
                         System.out.println("Ati introdus in stoc  : " +z+"buc  " + produs1.getNume());
                         break;
                     case 2:
                         produs2.intrareProdus(z);
                         System.out.println("Ati introdus in stoc  : " +z+"buc  "+ produs2.getNume());
                         break;
                     case 3:
                         produs3.intrareProdus(z);
                         System.out.println("Ati introdus in stoc  : " +z+"buc  " + produs3.getNume());
                         break;
                     case 4:
                         produs4.intrareProdus(z);
                         System.out.println("Ati introdus in stoc  : " +z+"buc  "+ produs4.getNume());
                         break;
                     }
             break;


             }
     }


    }

}