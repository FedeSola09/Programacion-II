package Model;

import Repository.IvehiculosJSON;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public abstract class Vehiculo implements IvehiculosJSON {
    private String patente;
    private Integer kilometraje;
    private Integer anioFabricacion;

    public Vehiculo(String patente, Integer kilometraje, Integer anioFabricacion) {
        this.patente = patente;
        this.kilometraje = kilometraje;
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo() {

    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo vehiculo)) return false;
        return Objects.equals(patente, vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(patente);
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
        Vehiculo vehiculo = null;
        try {
            vehiculo.setPatente(object.getString("Patente"));
            vehiculo.setKilometraje(object.getInt("Kilometraje"));
            vehiculo.setAnioFabricacion(object.getInt("Anio de Fabricacion"));
        } catch (JSONException e) {
            System.out.println("Error en el pasaje de datos.");
        }
        return vehiculo;
    }
}
