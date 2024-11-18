package Model;

import java.util.Objects;

public class Accesorio {
    private String nombre;
    private Integer precio;

    public Accesorio(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accesorio accesorio)) return false;
        return Objects.equals(nombre, accesorio.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "Model.Accesorio{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
