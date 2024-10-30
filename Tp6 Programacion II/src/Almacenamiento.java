import java.util.ArrayList;
import java.util.Objects;

public class Almacenamiento <T> {
    private T dato;
    private ArrayList<T> list;

    public Almacenamiento(T dato) {
        this.dato = dato;
        this.list = new ArrayList<>();
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Almacenamiento<?> that)) return false;
        return Objects.equals(dato, that.dato);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dato);
    }

    @Override
    public String toString() {
        return "Almacenamiento{" +
                "dato=" + dato +
                ", list=" + list +
                '}';
    }

    public void agregar(T dato) {
        if(dato != null) {
            list.add(dato);
        }
        else {
            System.out.println("No existe el dato.");
        }
    }

    public boolean eliminar(T dato) {
        if (getDato().equals(dato) == true) {
            list.remove(dato);
            return true; //se elimino correctamente
        }
        return false;
    }

    public boolean buscarObjeto(T dato) {
        if (getDato().equals(dato)) {
            return true; //se encontro el dato
        }
        return false;
    }
}



