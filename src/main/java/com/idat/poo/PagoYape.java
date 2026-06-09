package com.idat.poo;

public class PagoYape extends MetodoPago {

    private String numeroYape;

    public String getNumeroYape() {
        return numeroYape;
    }
    public void setNumeroYape(String numeroYape) {
        this.numeroYape = numeroYape;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con Yape número " + getNumeroYape());
    }
    
}
