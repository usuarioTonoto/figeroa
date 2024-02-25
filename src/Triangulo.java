public class Triangulo {
    Integer base;
    Integer altura;
    String nombre;

    Triangulo(String nombre) {
        this.nombre=nombre;
    }

    Triangulo(String nombre, int base, int altura) {
        this.nombre=nombre;
        this.base=base;
        this.altura=altura;
    }

    public void setBase(int base) {
        this.base=base;
    }

    public Integer getBase() {return this.base;}

    public void setAltura(int altura) {
        this.altura=altura;
    }

    public Integer getAltura() {
        return this.altura;
    }

    public Integer obtenerArea() {
        Integer area=(this.base*this.altura)/2;
        return area;
    }
}
