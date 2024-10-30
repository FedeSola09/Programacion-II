import java.util.ArrayList;

public class Pila <T> {
    private T objeto;
    private ArrayList<T> pila;

    public Pila(T objeto) {
        this.objeto = objeto;
        this.pila = new ArrayList<>();
    }

    public void agregar(T obj) {
        if(obj != null) {
            pila.add(obj);
        }
        else {
            System.out.println("Dato no encontrado");
        }
    }

    public void quitar() {
        pila.removeLast();
    }

    public boolean verificarContenido() {
        if(pila.isEmpty() == true) {
            return true; // esta vacia
        }
        return false;
    }

    public int cantElementos() {
        int i = 0;
        i = pila.size();
        return i;
    }

    @Override
    public String toString() {
        return "Pila{" +
                ", pila=" + pila +
                '}';
    }
}
