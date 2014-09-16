package es.upm.miw.spai.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 3);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(pt.getX(), 2);
        assertEquals(pt.getY(), 3);
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(pt.getX(), 0);
        assertEquals(pt.getY(), 0);
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }
    
    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1,1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3]", pt.toString());
    }

}
