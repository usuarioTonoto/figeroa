//Pto quien lo lea
public class Cuadrado {
    private String nombre;
    public int lado;

    public Cuadrado(String nombre) {
        this.nombre = nombre;
        this.lado = 0;
    }

    // Segundo constructor
    public Cuadrado(String nombre, int lado) {
        this.nombre = nombre;
        this.lado = lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return this.lado;
    }

    public int obtenerArea() {
        return this.lado * this.lado;
    }
}