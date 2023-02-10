package Clases;

import Interfaces.Borrable;

public class DVD extends DiscoDigital implements Borrable {
    public void borrar(){
        System.out.println("Borrando DVD");
        this.setCantGrabada(0.0);
    }
    public void grabar(){
        System.out.println("Grabando DVD");
    }
    public void mostrarInfo(){
        System.out.println(this);
    }
}
