import java.util.ArrayList;
import java.util.Objects;

public class Conjunto <T> {
    private T elemento;
    private ArrayList<T> lista;

    public Conjunto(T elemento) {
        this.elemento = elemento;
        this.lista = new ArrayList<>();
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conjunto<?> conjunto)) return false;
        return Objects.equals(elemento, conjunto.elemento);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(elemento);
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "elemento=" + elemento +
                '}';
    }

    public void agregar(T t) {
        if(t != null) {
            lista.add(t);
        }
    }

    public boolean eliminar(T t) {
        if(lista.equals(t)) {
            lista.remove(t);
            return true; // se elimino correctamente
        }
        return false;
    }

    public boolean verificarElemento(T t) {
        if (t != null) {
            if (lista.contains(t)) {
                return true; // se encontro el elemento
            }
        }
        return false;
    }
}
