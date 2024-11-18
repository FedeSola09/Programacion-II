package Model;

import Exceptions.CapacidadSuperadaException;
import Repository.IvehiculosJSON;
import org.json.JSONException;
import org.json.JSONObject;

public class Furgoneta extends Vehiculo implements CalcularCosto, IvehiculosJSON {
    private Integer volumenCarga;
    private Integer tarifa;

    public Furgoneta(String patente, Integer kilometraje, Integer anioFabricacion, Integer volumenCarga) {
        super(patente, kilometraje, anioFabricacion);
        this.volumenCarga = volumenCarga;
        this.tarifa = 300;
    }

    public Furgoneta() {
        super();
    }

    public Integer getVolumenCarga() {
        return volumenCarga;
    }

    public void setVolumenCarga(Integer volumenCarga) {
        this.volumenCarga = volumenCarga;
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
                "Model.Furgoneta{" +
                "volumenCarga=" + volumenCarga +
                ", tarifa=" + tarifa +
                '}';
    }

    @Override
    public Integer calcularCostoDeViaje(Integer distancia, Integer peso) {
        if(peso > volumenCarga) {
            Integer resto = peso - volumenCarga;
            throw new CapacidadSuperadaException("Capacidad de carga insuficiente, se excede por " + resto + " litros.");
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
        Furgoneta vehiculo = new Furgoneta();
        try {
            vehiculo.setPatente(object.getString("Patente"));
            vehiculo.setKilometraje(object.getInt("Kilometraje"));
            vehiculo.setAnioFabricacion(object.getInt("Anio de Fabricacion"));
            vehiculo.setVolumenCarga(object.getInt("Volumen de carga"));
            vehiculo.setTarifa(object.getInt("Tarifa"));
        } catch (JSONException e) {
            System.out.println("Error en el pasaje de datos.");
        }
        return vehiculo;
    }
}
