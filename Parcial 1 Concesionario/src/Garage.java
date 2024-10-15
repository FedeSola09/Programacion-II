import java.util.ArrayList;

public class Garage {

    //Variables
    private ArrayList<Vehiculo> cochera;
    private ArrayList<Yate> puerto;

    // Constructores
    public Garage(ArrayList<Vehiculo> cochera, ArrayList<Yate> puerto) {
        this.cochera = new ArrayList<>();
        this.puerto = new ArrayList<>();
    }

    public Garage() {
        this.cochera = new ArrayList<>();
        this.puerto = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<Vehiculo> getCochera() {
        return cochera;
    }

    public void setCochera(ArrayList<Vehiculo> cochera) {
        this.cochera = cochera;
    }

    public ArrayList<Yate> getPuerto() {
        return puerto;
    }

    public void setPuerto(ArrayList<Yate> puerto) {
        this.puerto = puerto;
    }

    // Metodos
    public void agregar(Vehiculo transporte) {
        cochera.add(transporte);
    }

    public boolean buscarPorPatente(String patente) {
        for (Vehiculo transporte : cochera) {
            if(transporte.getPatente().equals(patente)) {
                return  true; // Se encontro correctamente
            }
        }
        return false;
    }

    public int contar() {
        Integer cantidad = 0;
        cantidad += cochera.size();
        return cantidad;
    }

    public void devolverListado() {
        System.out.println(cochera);
    }

    public boolean eliminarPorPatente(String patente) {
        for (Vehiculo transporte : cochera) {
            if(transporte.getPatente().equals(patente)) {
                cochera.remove(transporte);
                return  true; // Se elimino correctamente
            }
        }
        return false; // No se elimino
    }

    public void precioXobj() {
        for (Vehiculo transporte : cochera) {
            if(transporte instanceof Auto) {
                transporte.precio = 15;
            }
            else {
                transporte.precio = 7;
            }
        }

        for (Yate barco : puerto) {
            if(barco instanceof Yate) {
                barco.precio = 100;
            }
        }
    }

    public float totalInventario() {
        float totalV = 0;
        float totalY = 0;
        float totalU = 0;

        totalV = cochera.size();
        totalY = puerto.size();
        totalU = totalV + totalY;

        return totalU;
    }

}
