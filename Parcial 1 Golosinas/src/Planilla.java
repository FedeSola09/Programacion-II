import java.util.ArrayList;

public class Planilla {
    private ArrayList<Empleado> oficina;
    private ArrayList<Repartidor> calle;

    public Planilla() {
        this.oficina = new ArrayList<>();
        this.calle = new ArrayList<>();
    }

    public ArrayList<Empleado> getOficina() {
        return oficina;
    }

    public void setOficina(ArrayList<Empleado> oficina) {
        this.oficina = oficina;
    }

    public ArrayList<Repartidor> getCalle() {
        return calle;
    }

    public void setCalle(ArrayList<Repartidor> calle) {
        this.calle = calle;
    }

    public void agregar(Empleado empleado) {
        oficina.add(empleado);
    }

    public void agregarRepartidor(Repartidor repartidor) {
        calle.add(repartidor);
    }

    public boolean buscarPorLegajo(Integer legajo) {
        for (Empleado empleado : oficina) {
            if (empleado.getLegajo().equals(legajo)) {
                return true; // Se encontro el legajo
            }
        }
        return false;
    }

    public int contarEmpleados() {
        int cantidad = 0;
        cantidad = oficina.size();
        return cantidad;
    }

    public String devolverListado() {
        return oficina.toString();
    }

    public boolean eliminarPorLegajo(Integer legajo) {
        for (Empleado empleado : oficina) {
            if (empleado.getLegajo().equals(legajo)) {
                oficina.remove(empleado);
                return true; // Se elimino el empleado
            }
        }
        return false;
    }


}
