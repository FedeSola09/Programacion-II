package Model;

import Repository.IvehiculosJSON;
import org.json.JSONException;
import org.json.JSONObject;

public class Bus extends Vehiculo implements IvehiculosJSON {
    private Integer capacidadDePasajeros;

    public Bus(String patente, Integer kilometraje, Integer anioFabricacion, Integer capacidadDePasajeros) {
        super(patente, kilometraje, anioFabricacion);
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    public Bus() {
        super();
    }

    public Integer getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    public void setCapacidadDePasajeros(Integer capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Model.Bus{" +
                "capacidadDePasajeros=" + capacidadDePasajeros +
                '}';
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
        Bus vehiculo = new Bus();
        try {
            vehiculo.setPatente(object.getString("Patente"));
            vehiculo.setKilometraje(object.getInt("Kilometraje"));
            vehiculo.setAnioFabricacion(object.getInt("Anio de Fabricacion"));
            vehiculo.setCapacidadDePasajeros(object.getInt("Capacidad de pasajeros"));
        } catch (JSONException e) {
            System.out.println("Error en el pasaje de datos.");
        }
        return vehiculo;
    }
}
