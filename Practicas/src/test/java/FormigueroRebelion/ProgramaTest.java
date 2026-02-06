package FormigueroRebelion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProgramaTest {

    @Test
    void testDirectorSeAñadeAListaEmpleados() {
        Cadena c = new Cadena("Antena 3");
        Empleado d = new Empleado("Ana", "director", null);
        Programa p = new Programa("El Hormiguero", c, d);

        assertTrue(p.getListaEmpleados().contains(d));
        assertEquals(1, p.getListaEmpleados().size());
    }

    @Test
    void testInsertarEmpleado() {
        Cadena c = new Cadena("Antena 3");
        Empleado d = new Empleado("Ana", "director", null);
        Programa p = new Programa("El Hormiguero", c, d);

        Empleado t = new Empleado("Luis", "técnico", d);
        p.insertarEmpleado(t);

        assertEquals(2, p.getListaEmpleados().size());
    }

    @Test
    void testBuscarInvitado() {
        Programa p = programaConInvitados();
        assertTrue(p.buscarInvitado("Aitana"));
        assertFalse(p.buscarInvitado("Shakira"));
    }

    @Test
    void testVecesInvitado() {
        Programa p = programaConInvitados();
        assertEquals(2, p.vecesInvitado("Aitana"));
    }

    private Programa programaConInvitados() {
        Cadena c = new Cadena("Antena 3");
        Empleado d = new Empleado("Ana", "director", null);
        Programa p = new Programa("El Hormiguero", c, d);

        Invitado Aitana = new Invitado("Aitana", "cantante", 1);
        Invitado Aitana2 = new Invitado("Aitana", "cantante", 2);
        p.insertarInvitado(Aitana);
        p.insertarInvitado(Aitana2);

        return p;
    }
}
