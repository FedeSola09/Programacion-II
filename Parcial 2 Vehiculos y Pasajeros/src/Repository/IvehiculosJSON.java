package Repository;

import Model.Vehiculo;
import org.json.JSONException;
import org.json.JSONObject;

public interface IvehiculosJSON {
    public JSONObject vehiculosToJSON(Vehiculo vehiculo);

    public Vehiculo JSONtoVehiculo(JSONObject object);
}
