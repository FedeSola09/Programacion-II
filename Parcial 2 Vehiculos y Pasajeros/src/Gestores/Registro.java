package Gestores;

import Exceptions.NoExisteException;
import Exceptions.YaExisteException;

import java.util.ArrayList;

public class Registro <T> {
    private ArrayList<T> lista;

    public Registro() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<T> getLista() {
        return lista;
    }

    public void setLista(ArrayList<T> lista) {
        this.lista = lista;
    }

    public void agregar(T objeto) throws YaExisteException {
        if (lista.contains(objeto)) {
            throw new YaExisteException("El dato que intenta cargar ya se encuentra dentro de la lista.");
        }
        else {
            lista.add(objeto);
            System.out.println("Datos cargados correctamente.");
        }
    }

    public boolean buscar(T objeto) {
        if(lista.contains(objeto)) {
            return true;
        }
        return false;
    }

    public Object buscarXpos(int posicion) {
        return lista.get(posicion);
    }

    public boolean eliminar(T objeto) throws NoExisteException {
        if (objeto != null) {
            throw new NoExisteException("No existe el dato buscado");
        }
        if (lista.contains(objeto)){
            lista.remove(objeto);
            return true;
        }
        return false;
    }


}

