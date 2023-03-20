package org.magazin;

public class Laptop extends Produs {
    private String marcaProdus;
    private String processor;

    public Laptop(String nume, double pret, int cantitate, String marcaProdus, String processor) {
        super(nume, pret, cantitate);
        this.marcaProdus = marcaProdus;
        this.processor = processor;
    }
    public String getMarcaProdus() {
        return marcaProdus;
    }

    public String getProcessor() {
        return processor;
    }
    public void infoProdus(){
        System.out.println("Laptop: "+getNume()+" Pret:"+ getPret()+" RON"+ " Stoc: "+getCantitate()+"buc");
    }
    public double calculateTVA() {
        double tva = getPret()  *19 / 100;
        System.out.println("Pret produs cu TVA : "+getMarcaProdus() +" - "+getNume()+" - "+(getPret()+ tva)+ " RON");
        return tva;

    }


}
