import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.TreeSet;

public class ListaOrdenada <T> {
    private T objeto;
    private ArrayList<T> list;

    public ListaOrdenada(T objeto) {
        this.objeto = objeto;
        this.list = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListaOrdenada<?> that)) return false;
        return Objects.equals(objeto, that.objeto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(objeto);
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                ", list=" + list +
                '}';
    }

    public void agregar(T t) {
        if(t != null) {
            list.add(t);
        }
    }

    public boolean eliminar(T t) {
        if(list.equals(t)) {
            list.remove(t);
            return true; // se elimino correctamente
        }
        return false;
    }

    public TreeSet ordenAscendente() {
        TreeSet<T> treeSet = new TreeSet<>();
        treeSet.addAll(list);

        return treeSet;
    }

    public TreeSet ordenDescendente() {
        TreeSet<T> treeSet2 = new TreeSet<>(Collections.reverseOrder());
        treeSet2.addAll(list);

        return treeSet2;
    }

    public int obtenerPosicion(T pos) {
        return list.indexOf(pos);
    }
}
