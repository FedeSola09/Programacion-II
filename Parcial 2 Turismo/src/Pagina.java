import org.json.JSONArray;
import org.json.JSONObject;

public class Pagina {
    public void gestor() {
        //Clientes:
        Clientes cliente1 = new Clientes("Federico", "federicosola09", 1);
        Clientes cliente2 = new Clientes("Matias", "matisola2009", 1);
        Clientes cliente3 = new Clientes("Tomas", "tomi123", 2);
        Clientes cliente4 = new Clientes("maria", "maria1996", 2);
        //Actividades:
        Actividades paseo = new Actividades("Paseo", 2, 1000.0);
        Actividades ski = new Actividades("Ski", 2, 1200.0);
        Actividades caminata = new Actividades("Caminata", 2, 300.0);
        Actividades cabalgata = new Actividades("Cabalgata", 2, 1600.0);
        //Paquetes de reserva:
        PaqueteReserva paquete1 = new PaqueteReserva<>();
        PaqueteReserva paquete2 = new PaqueteReserva<>();

        try {
            paquete1.reservar(paseo, caminata, cliente2);
            paquete1.reservar(paseo, caminata, cliente4);
            paquete2.reservar(ski, cabalgata, cliente1);
            paquete2.reservar(ski, cabalgata, cliente3);
            System.out.println(paquete1.listar());
            System.out.println(paquete2.listar());
        }
        catch(CupoLlenoException e) {
            System.out.println(e.getMessage());
        }
    }
    public void gestorJson() {
        System.out.println("JSON: ");
        JSONArray array = new JSONArray();
//        JSONArray clientesArr = new JSONArray();
//        JSONArray actividadesArr = new JSONArray();
//        JSONArray paquetesArr = new JSONArray();

        JSONObject clienteN1 = new JSONObject();
        clienteN1.put("Nombre", "Federico");
        clienteN1.put("Mail", "federicosola09");
        JSONObject clienteN2 = new JSONObject();
        clienteN2.put("Nombre", "matisola2009");
        clienteN2.put("Mail", "matisola2009");
        JSONObject clienteN3 = new JSONObject();
        clienteN3.put("Nombre", "tomi123");
        clienteN3.put("Mail", "tomi123");
        JSONObject clienteN4 = new JSONObject();
        clienteN4.put("Nombre", "maria1996");
        clienteN4.put("Mail", "maria1996");
        array.put(clienteN1);
        array.put(clienteN2);
        array.put(clienteN3);
        array.put(clienteN4);

        JSONObject act1 = new JSONObject();
        act1.put("Nombre", "Paseo");
        act1.put("Cupo maximo", "2");
        act1.put("Precio", "1000");
        JSONObject act2 = new JSONObject();
        act2.put("Nombre", "Ski");
        act2.put("Cupo maximo", "2");
        act2.put("Precio", "1200");
        JSONObject act3 = new JSONObject();
        act3.put("Nombre", "Caminata");
        act3.put("Cupo maximo", "2");
        act3.put("Precio", "300");
        JSONObject act4 = new JSONObject();
        act4.put("Nombre", "Cabalgata");
        act4.put("Cupo maximo", "2");
        act4.put("Precio", "1600");
        array.put(act1);
        array.put(act2);
        array.put(act3);
        array.put(act4);

        JSONObject combo1 = new JSONObject();
        combo1.put("Primera actividad", act1);
        combo1.put("Segunda actividad", act3);
        JSONObject combo2 = new JSONObject();
        combo2.put("Primera actividad", act2);
        combo2.put("Segunda actividad", act4);

        JsonUtiles.grabar(array);
//        JsonUtiles.grabar(actividadesArr);
//        JsonUtiles.grabar(paquetesArr);
        System.out.println(JsonUtiles.leer("archivo"));

    }
}
