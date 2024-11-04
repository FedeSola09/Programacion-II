import java.util.ArrayList;
import java.util.Objects;

public class Actividades {
    private String descripcion;
    Integer cupoMax;
    Double costo;
    ArrayList<Clientes> lista;

    public Actividades(String descripcion, Integer cupoMax, Double costo) {
        this.descripcion = descripcion;
        this.cupoMax = cupoMax;
        this.costo = costo;
        this.lista = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCupoMax() {
        return cupoMax;
    }

    public void setCupoMax(Integer cupoMax) {
        this.cupoMax = cupoMax;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public ArrayList<Clientes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Clientes> lista) {
        this.lista = lista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actividades that)) return false;
        return Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descripcion);
    }

    @Override
    public String toString() {
        return "Actividades{" +
                "descripcion='" + descripcion + '\'' +
                ", cupoMax=" + cupoMax +
                ", costo=" + costo +
                ", lista=" + lista +
                '}';
    }

    public void agregar(Clientes cliente) throws CupoLlenoException {
        if(lista.size() >= getCupoMax()) {
            throw new CupoLlenoException("No quedan lugares disponibles");
        }
        if(cliente != null) {
            lista.add(cliente);
        }
    }

    public boolean eliminar(Clientes cliente) {
        if(cliente != null) {
            if (lista.contains(cliente)) {
                lista.remove(cliente); // se elimino correctamente
                return true;
            }
            else {
                System.out.println("El cliente no estaba dentro de la reserva");
            }
        }
        return false;
    }
}
