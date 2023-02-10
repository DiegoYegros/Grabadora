package Clases;
import Interfaces.Borrable;
import Interfaces.Grabable;
import java.util.List;

public class Grabador {
    public void borrarDiscosYAgregar(List<Borrable> listaDeBorrables, PortaDiscos portaDiscos){
        for (Borrable disco : listaDeBorrables) {
            disco.borrar();
            portaDiscos.addBorrableToList(disco);
        }
    }
    public void grabarDiscosYAgregar(List<Grabable> listaDeGrabables, PortaDiscos portaDiscos){
        for (Grabable disco : listaDeGrabables) {
            disco.grabar();
            portaDiscos.addGrabableToList(disco);
        }
    }
    public void mostrarInfoDiscosBorrables(PortaDiscos portaDiscos){
        List<Borrable> lista = portaDiscos.getListaDiscosBorrados();
        for (Borrable disco : lista){
            if (disco instanceof Grabable) {
                ((Grabable) disco).mostrarInfo();
            }
        }
    }
    public void mostrarInfoDiscosGrabables(PortaDiscos portaDiscos){
        List<Grabable> lista = portaDiscos.getListaDiscosGrabados();
        for (Grabable disco : lista){
            disco.mostrarInfo();
        }
    }
}
