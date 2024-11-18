package Model;

import Repository.IvehiculosJSON;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Auto extends Vehiculo implements IvehiculosJSON {
    private ArrayList<Accesorio> listaDeAccesorios;

    public Auto(String patente, Integer kilometraje, Integer anioFabricacion, Accesorio volanteDeDrift) {
        super(patente, kilometraje, anioFabricacion);
        this.listaDeAccesorios = new ArrayList<>();
    }

    public Auto() {
        super();
    }

    public ArrayList<Accesorio> getListaDeAccesorios() {
        return listaDeAccesorios;
    }

    public void setListaDeAccesorios(ArrayList<Accesorio> listaDeAccesorios) {
        this.listaDeAccesorios = listaDeAccesorios;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Model.Auto{" +
                "listaDeAccesorios=" + listaDeAccesorios +
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
        Auto vehiculo = new Auto();
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
