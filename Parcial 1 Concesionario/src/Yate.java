import java.util.Objects;

public class Yate {

    // Variables
    protected float precio;

    // Constructores
    public Yate(float precio) {
        this.precio = precio;
    }

    public Yate() {
        this.precio = 0;
    }

    // Getters y Setters
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // toString
    @Override
    public String toString() {
        return "Yate{" +
                "precio=" + precio +
                '}';
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Yate yate)) return false;
        return Float.compare(precio, yate.precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(precio);
    }

    // Metodos
    public float calcularPrecio(Yate yate) {
        yate.precio = 100;
        return precio;
    }
}
