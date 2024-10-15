import java.util.Scanner;

public class Tranvia implements Transporte
{
    String ruta;
    int capacidad;
    TipoTransporte tipo;

    Scanner leer = new Scanner(System.in);

    public Tranvia(String ruta, int capacidad, TipoTransporte tipo) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tranvia{" +
                "ruta='" + ruta + '\'' +
                ", capacidad=" + capacidad +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancar el subte");
    }

    @Override
    public void detener() {
        System.out.println("Detener el subte");
    }

    @Override
    public void obtenerCapacidad() {
        System.out.println("Ingrese la capacidad del subte: ");
        capacidad = leer.nextInt();
    }

    public void cambiarVia(int nuevaVia)
    {
        System.out.println("Ingrese la nueva via: ");
        nuevaVia = leer.nextInt();
    }
}
