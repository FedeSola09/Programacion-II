import Exceptions.CapacidadSuperadaException;
import Exceptions.NoExisteException;
import Exceptions.YaExisteException;
import Gestores.Registro;
import Model.*;
import Repository.UsoDeJSON;
import org.json.JSONArray;
import org.json.JSONException;

public class Main {
    public static void main(String[] args) {
        //Registros:
        Registro<Vehiculo> registroVehiculos = new Registro<>();
        Registro<Propietario> registroPropietarios = new Registro<>();

        //Vehiculos
        Camion camion = new Camion("ABC123", 1000, 2011, 50);
        Furgoneta furgoneta = new Furgoneta("DEF456", 700, 2017, 35);
        Bus bus = new Bus("GHI789", 4000, 2007, 60);
        Accesorio volanteDeDrift = new Accesorio("Volante de drift", 500);
        Auto auto = new Auto("FFF999", 400, 2008, volanteDeDrift);

        //Propietarios
        Propietario propietario1 = new Propietario("Federico", "2235206300", "45825885");
        Propietario propietario2 = new Propietario("Juan", "223667896", "46789423");
        Propietario propietario3 = new Propietario("Martina", "2231234123", "46753241");
        Propietario propietario4 = new Propietario("Estefania", "223649827", "494532623");

        try {
            registroVehiculos.agregar(camion);
            registroVehiculos.agregar(furgoneta);
            registroVehiculos.agregar(bus);
            registroVehiculos.agregar(auto);
            System.out.println(registroVehiculos.buscarXpos(3));
            registroVehiculos.eliminar(bus);
            if (!registroVehiculos.buscar(bus)) {
                System.out.println("No se encontro el vehiculo.");
            } else {
                System.out.println("Se encontro el vehiculo.");
            }

            registroPropietarios.agregar(propietario1);
            registroPropietarios.agregar(propietario2);
            registroPropietarios.agregar(propietario3);
            registroPropietarios.agregar(propietario4);
            System.out.println(registroPropietarios.buscarXpos(3));
            registroPropietarios.eliminar(propietario4);
            if (!registroPropietarios.buscar(propietario2)) {
                System.out.println("No se encontro el propietario.");
            } else {
                System.out.println("Se encontro el propietario.");
            }
        } catch (YaExisteException e) {
            e.getMessage();
        } catch (CapacidadSuperadaException f) {
            f.getMessage();
        } catch (NoExisteException d) {
            d.getMessage();
        }
        try {
            JSONArray VehiculosArray = new JSONArray();
            VehiculosArray.put(camion);
            VehiculosArray.put(furgoneta);
            VehiculosArray.put(bus);
            VehiculosArray.put(auto);
            UsoDeJSON.grabarUnJson(VehiculosArray, "vehiculos.json");
            System.out.println(UsoDeJSON.leerUnJson("vehiculos.json"));

            JSONArray PropietariosArray = new JSONArray();
            PropietariosArray.put(propietario1);
            PropietariosArray.put(propietario2);
            PropietariosArray.put(propietario3);
            PropietariosArray.put(propietario4);
            UsoDeJSON.grabarUnJson(PropietariosArray, "propietarios.json");
            System.out.println(UsoDeJSON.leerUnJson("propietarios.json"));
        } catch (JSONException e) {
            System.out.println("Error en el pasaje de datos");
        }
    }
}