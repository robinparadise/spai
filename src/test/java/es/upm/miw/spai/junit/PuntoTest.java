package es.upm.miw.spai.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PuntoTest {
    private Punto pt;

    @Before
    public void before() {
        pt = new Punto(2, 3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(pt.getX(), 2);
        assertEquals(pt.getY(), 3);
    }

    @Test
    public void testPunto() {
        pt = new Punto();
        assertEquals(pt.getX(), 0);
        assertEquals(pt.getY(), 0);
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.modulo(), 10e-5);
    }

    @Test
    public void testFase() {
        Punto pt = new Punto(2, 3);
        assertEquals(0.9828, pt.fase(), 10e-5);
    }

    @Test
    public void testToString() {
        assertEquals("Punto[2,3]", pt.toString());
    }

}
