import java.util.ArrayList;

public class PaqueteReserva<T> {
    private final ArrayList<T> paquetes;

    public PaqueteReserva() {
        this.paquetes = new ArrayList<>();
    }

    // Recibe todas las actividades disponibles y un cliente, luego el cliente pasa por parametro que paquete comprar, y en caso de ser posible, se lo agrega al cupo
    public String reservar(Actividades act1, Actividades act2, Clientes cliente) throws CupoLlenoException {
        String respuesta = "Se compro el paquete";
        Double descuentoXpaquete = 0.70;

        try {
            act1.agregar(cliente);
            act2.agregar(cliente);
            Double aux = (act1.getCosto() + act2.getCosto()) * descuentoXpaquete;
            act1.setCosto(aux);
            act2.setCosto(aux);
            paquetes.add((T) act1);
            paquetes.add((T) act2);
        } catch (CupoLlenoException e) {
            System.out.println(e.getMessage());
            respuesta = "No se pudo completar la reserva";
        }

        return respuesta;
    }

    public String listar() {
        return paquetes.toString();
    }
}
