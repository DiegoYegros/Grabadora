package Clases;
import Interfaces.Borrable;
import Interfaces.Grabable;
import java.util.ArrayList;
import java.util.List;
public class PortaDiscos {
    private List<Borrable> listaDiscosBorrados = new ArrayList<>();
    private  List<Grabable> listaDiscosGrabados = new ArrayList<>();

    public List<Borrable> getListaDiscosBorrados() {
        return listaDiscosBorrados;
    }

    public List<Grabable> getListaDiscosGrabados() {
        return listaDiscosGrabados;
    }
    public void addGrabableToList(Grabable grabable){
        listaDiscosGrabados.add(grabable);
    }
    public void addBorrableToList(Borrable borrable){
        listaDiscosBorrados.add(borrable);
    }
    public void deleteGrabableFromList(Grabable grabable){
        listaDiscosGrabados.remove(grabable);
    }
    public void deleteBorrableFromList(Borrable borrable){
        listaDiscosBorrados.remove(borrable);
    }
}