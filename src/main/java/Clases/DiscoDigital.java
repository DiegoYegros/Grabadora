package Clases;

import Interfaces.Grabable;

public class DiscoDigital implements Grabable {
    private Boolean ambosLados;
    private Double cantGrabada;
    private Double capacidad;
    private Boolean cerrado;

    public Boolean isCerrado(){
        return cerrado;
    }
    public Boolean isAmbosLados(){
        return ambosLados;
    }
    @Override
    public void grabar() {
        System.out.println("Grabando en disco digital");
    }

    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "DiscoDigital{" +
                "ambosLados=" + ambosLados +
                ", cantGrabada=" + cantGrabada +
                ", capacidad=" + capacidad +
                ", cerrado=" + cerrado +
                '}';
    }
    public Boolean getAmbosLados() {
        return ambosLados;
    }

    public void setAmbosLados(Boolean ambosLados) {
        this.ambosLados = ambosLados;
    }

    public Double getCantGrabada() {
        return cantGrabada;
    }

    public void setCantGrabada(Double cantGrabada) {
        this.cantGrabada = cantGrabada;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getCerrado() {
        return cerrado;
    }

    public void setCerrado(Boolean cerrado) {
        this.cerrado = cerrado;
    }

}
