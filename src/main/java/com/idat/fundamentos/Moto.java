package com.idat.fundamentos;

public class Moto extends Vehiculo {

    private String tipo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void arrancar() {
        System.out.println("La moto " + getMarca() + " tipo " + getTipo() + " ha arrancado.");
    }

    @Override
    public void mover() {
        System.out.println("La moto " + getMarca() + " tipo " + getTipo() + " se está moviendo a " + getVelocidad() + " km/h.");
    }
    
}
