package Clases;

import Interfaces.Borrable;

public class CD extends DiscoDigital implements Borrable {
    public void borrar(){
        System.out.println("Borrando CD");
        this.setCantGrabada(0.0);
    }
    public void grabar(){

        System.out.println("Grabando CD");
    }
    public void mostrarInfo(){
        System.out.println(this);
    }
}
