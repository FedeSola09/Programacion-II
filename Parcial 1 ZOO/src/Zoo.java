import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> jaula;

    public Zoo() {
        this.jaula = new ArrayList<>();
    }

    public ArrayList<Animal> getJaula() {
        return jaula;
    }

    public void setJaula(ArrayList<Animal> jaula) {
        this.jaula = jaula;
    }

    public void agregar(Animal animal) {
        jaula.add(animal);
    }

    public boolean buscarPorEspecie(String especie) {
        for (Animal animal : jaula) {
            if (animal.getEspecie().equals(especie)) {
                return true; // Se encontro correctamente
            }
        }
        return false;
    }

    public int contar(){
        Integer cantidad = 0;
        cantidad *= jaula.size();
        return cantidad;
    }

    public String devolverListado() {
        return jaula.toString();
    }

    public boolean eliminarPorNombre(String nombre) {
        for (Animal animal : jaula) {
            if (animal.getNombre().equals(nombre)) {
                jaula.remove(animal);
                return true; // Se elimino correctamente
            }
        }
        return false;
    }

    public int cambiarValor(boolean finDeSemana) {
        int valor = 50;

        if (finDeSemana = true)
        {
            valor *= 2;
        }
        return valor;
    }
}
