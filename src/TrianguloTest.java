import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void setBase() {
        Triangulo unTriangulo = new Triangulo("Otro triangulo");
        unTriangulo.setBase(20);
        assertEquals(20, unTriangulo.base);
    }

    @Test
    void getBase() {
        Triangulo unTriangulo = new Triangulo("Otro triangulo", 20, 80);
        assertEquals(80, unTriangulo.getBase());
    }

    @Test
    void setAltura() {
        Triangulo unTriangulo = new Triangulo("Otro triangulo");
        unTriangulo.setAltura(21);
        assertEquals(21, unTriangulo.altura);
    }

    @Test
    void getAltura() {
        Triangulo unTriangulo = new Triangulo("Otro triangulo", 20, 20);
        assertEquals(20, unTriangulo.getAltura());
    }

    @Test
    void obtenerArea() {
        Triangulo unTriangulo = new Triangulo("Nuevo triangulo", 80, 2);
        assertEquals(80, unTriangulo.obtenerArea());
    }
}