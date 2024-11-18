package Model;

import Exceptions.CapacidadSuperadaException;
import Repository.IvehiculosJSON;
import org.json.JSONException;
import org.json.JSONObject;

public class Camion extends Vehiculo implements CalcularCosto, IvehiculosJSON {
    private Integer capacidadCarga; // en toneladas
    private Integer tarifa;

    public Camion(String patente, Integer kilometraje, Integer anioFabricacion, Integer capacidadCarga) {
        super(patente, kilometraje, anioFabricacion);
        this.capacidadCarga = capacidadCarga;
        this.tarifa = 500;
    }

    public Camion() {
        super();
    }

    public Integer getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Integer capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Integer getTarifa() {
        return tarifa;
    }

    public void setTarifa(Integer tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Model.Camion{" +
                "capacidadCarga=" + capacidadCarga +
                ", tarifa=" + tarifa +
                '}';
    }

    @Override
    public Integer calcularCostoDeViaje(Integer distancia, Integer peso) {
        if(peso > capacidadCarga) {
            Integer resto = peso - capacidadCarga;
            throw new CapacidadSuperadaException("Capacidad de carga insuficiente, se excede por " + resto + " toneladas.");
        }
        Integer costoViaje = ((distancia * peso) * tarifa);
        return costoViaje;
    }

    public JSONObject vehiculosToJSON(Vehiculo vehiculo) {
        JSONObject object = new JSONObject();
        try {
            object.put("Patente", vehiculo.getPatente());
            object.put("Kilometraje", vehiculo.getKilometraje());
            object.put("Anio de fabricacion", vehiculo.getAnioFabricacion());
            object.put("Tipo de vehiculo", vehiculo.getClass());
        } catch (JSONException e) {
            System.out.println("Error en el pasaje de datos.");
        }
        return object;
    }

    public Vehiculo JSONtoVehiculo(JSONObject object) {
        Camion vehiculo = new Camion();
        try {
            vehiculo.setPatente(object.getString("Patente"));
            vehiculo.setKilometraje(object.getInt("Kilometraje"));
            vehiculo.setAnioFabricacion(object.getInt("Anio de Fabricacion"));
            vehiculo.setCapacidadCarga(object.getInt("Capacidad de carga"));
            vehiculo.setTarifa(object.getInt("Tarifa"));
        } catch (JSONException e) {
            System.out.println("Error en el pasaje de datos.");
        }
        return vehiculo;
    }
}
