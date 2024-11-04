package Modelo;

import Interfaces.eGenero;

import java.util.Objects;

public abstract class Software {
    private String titulo;
    private String creador;
    private eGenero genero;
    private Integer identificador;

    public Software(String titulo, String creador, eGenero genero, Integer identificador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.identificador = identificador;
    }

    public Software(Integer identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public eGenero getGenero() {
        return genero;
    }

    public void setGenero(eGenero genero) {
        this.genero = genero;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Software software)) return false;
        return Objects.equals(identificador, software.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificador);
    }

    @Override
    public String toString() {
        return "Modelo.Software{" +
                "titulo='" + titulo + '\'' +
                ", creador='" + creador + '\'' +
                ", genero=" + genero +
                ", identificador=" + identificador +
                '}';
    }
}
