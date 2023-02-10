package Main;
import Clases.*;
import Interfaces.Grabable;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Grabador grabador = new Grabador();
        PortaDiscos portaDiscos = new PortaDiscos();
        CD cd = new CD();
        cd.setAmbosLados(true);
        DVD dvd = new DVD();
        dvd.setCapacidad(1.23);
        CD cd1 = new CD();
        cd1.setCerrado(true);
        List<Grabable> discos = Arrays.asList(cd, cd1, dvd);
        grabador.grabarDiscosYAgregar(discos, portaDiscos);
        System.out.println(portaDiscos.getListaDiscosGrabados());

    }
}
