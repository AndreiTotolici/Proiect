package org.magazin;

public class Telefon extends Produs{
    private String marcaProdus;
    private boolean areEsim;


    public String getMarcaProdus() {
        return marcaProdus;
    }


    public Telefon(String nume, double pret, int cantitate, String marcaProdus, boolean areEsim) {
        super(nume, pret, cantitate);
        this.marcaProdus = marcaProdus;
        this.areEsim = areEsim;

    }

    public void setMarcaProdus(String marcaProdus) {
        this.marcaProdus = marcaProdus;
    }

    public boolean isAreEsim() {
        return areEsim;
    }

    public void setAreEsim(boolean areEsim) {
        this.areEsim = areEsim;
    }

    public void infoProdus(){
        System.out.println("Telefon:"+getNume()+" Pret:"+ getPret()+" RON"+ " Stoc: "+getCantitate()+"buc");
    }
    public double calculateTVA() {
        double tva = getPret()  *19 / 100;
        System.out.println("Pret produs cu TVA : "+getMarcaProdus() +" - "+getNume()+" - "+(getPret()+ tva)+ " RON");
        return tva;

    }

}
