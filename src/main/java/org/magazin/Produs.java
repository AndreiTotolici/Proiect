package org.magazin;


public class Produs {

        private String nume;
        private double pret;
        private int cantitate;

        public Produs(String nume, double pret, int cantitate) {
            this.nume = nume;
            this.pret = pret;
            this.cantitate = cantitate;
        }

        public String getNume() {
            return nume;
        }

        public double getPret() {
            return pret;
        }

        public int getCantitate() {
            return cantitate;
        }

        public void setCantitate(int cantitate) {
            this.cantitate = cantitate;
        }

        public void valTotal () {

            System.out.println("Produs: "+getNume()+" - "+ getPret()*getCantitate()+ " RON");
        }



    public void infoProdus(){
        System.out.println("Nume:"+getNume()+" Pret:"+ getPret()+" RON"+ " Stoc: "+getCantitate()+" buc");
    }
    public void vanzareProdus (int vanzare){
            setCantitate(getCantitate()-vanzare);

    }
    public void intrareProdus (int intrare) {
        setCantitate(getCantitate() + intrare);
    }

    public double calculateTVA() {
        double tva = pret  *19 / 100;
        System.out.println("Pret produs cu TVA : "+" "+getNume()+" - "+(getPret()+ tva)+ " RON");
        return tva;

    }




}
