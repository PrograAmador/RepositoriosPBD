package FormigueroRebelion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadenaTest {

    @Test
    void testListaProgramasInicializada() {
        Cadena c = new Cadena("Antena 3");
        assertNotNull(c.getListaProgramas());
    }

    @Test
    void testAgregarPrograma() {
        Cadena c = new Cadena("Antena 3");
        Empleado d = new Empleado("Ana", "director", null);
        Programa p = new Programa("El Hormiguero", c, d);

        assertTrue(c.getListaProgramas().contains(p));
    }

    @Test
    void testEliminarPrograma() {
        Cadena c = new Cadena("Antena 3");
        Empleado d = new Empleado("Ana", "director", null);
        Programa p = new Programa("El Hormiguero", c, d);

        c.eliminarPrograma(p);
        assertFalse(c.getListaProgramas().contains(p));
    }
}
