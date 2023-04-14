
package ejercicioextraextra3;

import Servicio.PassServicio;
import entidad.Pass;


public class Ejercicioextraextra3 {

    public static void main(String[] args) {
    PassServicio ps= new PassServicio();
    Pass p1=ps.ingresarDatos();
  ps.menu(p1);
    }
    
}
