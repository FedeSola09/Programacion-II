import java.util.ArrayList;

public class Gestor {
    private ArrayList<Vehiculo> listaAutos;
    private ArrayList<Cliente> listaPersonas;

    public Gestor(ArrayList<Vehiculo> listaAutos, ArrayList<Cliente> listaPersonas) {
        this.listaAutos = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }

    public Gestor() {
        this.listaAutos = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Vehiculo> listaAutos) {
        this.listaAutos = listaAutos;
    }

    public ArrayList<Cliente> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Cliente> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void agregarAuto(Vehiculo vehiculo) {
        listaAutos.add(vehiculo);
    }

    public void agregarPersona(Cliente cliente) {
        listaPersonas.add(cliente);
    }

    public String listarAutos() {
        return listaAutos.toString();
    }

    public String listarPersonas() {
        return listaPersonas.toString();
    }

    public Integer sueldoDelDia() {
        Integer aux = 0;
        for (Vehiculo vehiculo : listaAutos) {
            aux += vehiculo.totalRecaudado();
        }
        return aux;
    }
}
