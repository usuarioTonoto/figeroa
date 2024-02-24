import java.util.Scanner;

public class Rectangulo {
    Integer base;
    Integer altura;
    String nombre;

    Rectangulo(String nombre) {
        this.nombre = nombre;
    }

    Rectangulo(String nombre, int base, int altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;

    }

    public Integer getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Integer getAltura() {
        return altura;
    }

    public Integer obtenerArea() {
        int area = base * altura;
        return area;
    }
}
