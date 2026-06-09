package com.idat.fundamentos;

public abstract class Vehiculo {

    private String marca;
    private double velocidad;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        if (velocidad < 0) {
            System.out.println("La velocidad no puede ser negativa. Se establecerá a 0.");
            this.velocidad = 0;
        } else {
            this.velocidad = velocidad;
        }
    }

    public abstract void arrancar();

    public abstract void mover();
    
}
