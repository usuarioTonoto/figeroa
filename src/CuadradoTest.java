import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {
    @org.junit.jupiter.api.Test
    void setLadoPrimerCostructor() {
        Cuadrado otroCuadrado = new Cuadrado("Cuadrado de prueba");
        otroCuadrado.setLado(20);
        assertEquals(20, otroCuadrado.lado);
    }

    @org.junit.jupiter.api.Test
    void setLadoSegundoCostructor() {
        Cuadrado otroCuadrado = new Cuadrado("Cuadrado de prueba", 25);
        otroCuadrado.setLado(70);
        assertEquals(70, otroCuadrado.lado);
    }

    @org.junit.jupiter.api.Test
    void getLadoPrimerCostructor() {
        Cuadrado otroCuadrado = new Cuadrado("Cuadrado de prueba");
        otroCuadrado.lado = 80;
        assertEquals(80, otroCuadrado.getLado());
    }

    @org.junit.jupiter.api.Test
    void getLadoSegundoCostructor() {
        Cuadrado otroCuadrado = new Cuadrado("Cuadrado de prueba", 25);
        assertEquals(25, otroCuadrado.getLado());
    }

    @org.junit.jupiter.api.Test
    void obtenerArea() {
        Cuadrado otroCuadrado = new Cuadrado("Cuadrado de este", 2);
        assertEquals(4, otroCuadrado.obtenerArea());
    }
}