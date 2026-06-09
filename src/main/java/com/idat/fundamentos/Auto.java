package com.idat.fundamentos;

public class Auto extends Vehiculo {

    private String modelo;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void arrancar() {
        System.out.println("El auto " + getMarca() + " modelo " + getModelo() + " ha arrancado.");
    }

    @Override
    public void mover() {
        System.out.println("El auto " + getMarca() + " modelo " + getModelo() + " se está moviendo a " + getVelocidad() + " km/h.");
    }
    
}
