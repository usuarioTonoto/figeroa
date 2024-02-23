import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    @Test
    void setBase() {
        Rectangulo unRectangulo = new Rectangulo("Prueba");
        unRectangulo.setBase(70);
        assertEquals(70, unRectangulo.base);
    }

    @Test
    void getBase() {
        Rectangulo unRectangulo = new Rectangulo("Prueba", 20, 80);
        assertEquals(20, unRectangulo.getBase());
    }

    @Test
    void setAltura() {
        Rectangulo unRectangulo = new Rectangulo("Prueba");
        unRectangulo.setAltura(20);
        assertEquals(20, unRectangulo.altura);
    }

    @Test
    void getAltura() {
        Rectangulo unRectangulo = new Rectangulo("Prueba", 90, 20);
        assertEquals(20, unRectangulo.getAltura());
    }

    @Test
    void obtenerArea() {
        Rectangulo unRectangulo = new Rectangulo("Prueba", 90, 2);
        assertEquals(180, unRectangulo.obtenerArea());
    }
}