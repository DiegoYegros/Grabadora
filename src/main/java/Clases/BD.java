package Clases;

public class BD extends DiscoDigital{
    public void grabar(){
        System.out.println("Grabando BD");
        setCerrado(true);
    }
    public void mostrarInfo(){
        System.out.println(this);
    }
}
