package Modelo;

import Interfaces.eGenero;

import java.util.Objects;

public class Expansion extends Software {
    String FechaLanzamiento;

    public Expansion(String titulo, String creador, eGenero genero, Integer identificador, String fechaLanzamiento) {
        super(titulo, creador, genero, identificador);
        FechaLanzamiento = fechaLanzamiento;
    }

    public String getFechaLanzamiento() {
        return FechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        FechaLanzamiento = fechaLanzamiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Expansion expansion)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getIdentificador(), expansion.getIdentificador());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIdentificador());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Modelo.Expansion{" +
                "FechaLanzamiento='" + FechaLanzamiento + '\'' +
                '}';
    }
}
