package FormigueroRebelion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    void testIdAutogeneradoYUnico() {
        Empleado e1 = new Empleado("Ana", "director", null);
        Empleado e2 = new Empleado("Luis", "técnico", e1);

        assertNotNull(e1.getId());
        assertNotNull(e2.getId());
        assertNotEquals(e1.getId(), e2.getId());
        assertTrue(e1.getId().startsWith("EP"));
    }

    @Test
    void testCargoValido() {
        Empleado e = new Empleado("Ana", "presentador", null);
        assertEquals("presentador", e.getCargo());
    }

    @Test
    void testCargoInvalido() {
        Empleado e = new Empleado("Ana", "jefe", null);
        assertEquals("pte", e.getCargo());
    }

    @Test
    void testDirectorNoTieneDirector() {
        Empleado d = new Empleado("Ana", "director", null);
        assertNull(d.getDirector());
    }

    @Test
    void testEmpleadoTieneDirector() {
        Empleado d = new Empleado("Ana", "director", null);
        Empleado t = new Empleado("Luis", "técnico", d);

        assertEquals(d, t.getDirector());
    }
}
