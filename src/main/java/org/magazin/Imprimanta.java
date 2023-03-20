package org.magazin;

public class Imprimanta  extends Produs {
    private String marcaProdus;
    private String tipImprimanta;

    public String getMarcaProdus() {
        return marcaProdus;
    }

    public String getTipImprimanta() {
        return tipImprimanta;
    }

    public Imprimanta(String nume, double pret, int cantitate, String marcaProdus, String tipImprimanta) {
        super(nume, pret, cantitate);
        this.marcaProdus = marcaProdus;
        this.tipImprimanta = tipImprimanta;
    }


        public void infoProdus() {
            System.out.println("Imprimanta:" + getNume() + " Pret:" + getPret() + " RON" + " Stoc: " + getCantitate() + "buc");
        }
        public double calculateTVA() {
            double tva = getPret() * 19 / 100;
            System.out.println("Pret produs cu TVA : "+getMarcaProdus() +" - "+ getNume() +" - "+  (getPret() + tva)+ " RON");
            return tva;

        }

}