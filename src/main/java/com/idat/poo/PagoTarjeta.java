package com.idat.poo;

public class PagoTarjeta extends MetodoPago {

    private String numeroTarjeta;

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con tarjeta " + getNumeroTarjeta());
    }
    
}
