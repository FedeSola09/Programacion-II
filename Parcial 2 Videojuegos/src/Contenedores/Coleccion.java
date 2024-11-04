package Contenedores;

import Excepciones.IdentificadorRepetidoException;
import Interfaces.eGenero;
import Modelo.Software;

import java.util.HashSet;
import java.util.Objects;

public class Coleccion <T extends Software> {
    HashSet<T> coleccion;

    public Coleccion() {
        this.coleccion = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coleccion<?> coleccion1)) return false;
        return Objects.equals(coleccion, coleccion1.coleccion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coleccion);
    }

    @Override
    public String toString() {
        return "Contenedores.Coleccion{" +
                "coleccion=" + coleccion +
                '}';
    }

    public void agregar(T obj) throws IdentificadorRepetidoException {
        try {
            if (!coleccion.add(obj)) {
                throw new IdentificadorRepetidoException("Este juego o expansion ya fue agregado");
            }
        } catch (IdentificadorRepetidoException e) {
            e.getMessage();
        }
    }

    public boolean eliminarPorId(T objeto) {
        if(coleccion.contains(objeto)) {
            coleccion.remove(objeto);
            return true;
        }
        return false;
    }

    public void mostrar() {
        for(T t : coleccion) {
            System.out.println(t);
        }
    }

    public void filtrarXgen(eGenero gen) {
        for (T software : coleccion) {
            if (software.getGenero() == gen) {
                System.out.println(software);

            }
        }
    }
}
