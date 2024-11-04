package Modelo;

import Interfaces.eGenero;

import java.util.Objects;

public class Juego extends Software {
    Integer nroVersion;

    public Juego(String titulo, String creador, eGenero genero, Integer identificador, Integer nroVersion) {
        super(titulo, creador, genero, identificador);
        this.nroVersion = nroVersion;
    }

    public Integer getNroVersion() {
        return nroVersion;
    }

    public void setNroVersion(Integer nroVersion) {
        this.nroVersion = nroVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Juego juego)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getIdentificador(), juego.getIdentificador());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIdentificador());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Modelo.Juego{" +
                "nroVersion=" + nroVersion +
                '}';
    }
}
