import java.util.Scanner;

public class Autobus implements Transporte
{
    int numerolinea;
    int capacidad;
    TipoTransporte tipo;

    Scanner leer = new Scanner(System.in);

    public Autobus(int numerolinea, int capacidad, TipoTransporte tipo) {
        this.numerolinea = numerolinea;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public int getNumerolinea() {
        return numerolinea;
    }

    public void setNumerolinea(int numerolinea) {
        this.numerolinea = numerolinea;
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
        return "Autobus{" +
                "numerolinea=" + numerolinea +
                ", capacidad=" + capacidad +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancar el bondi");
    }

    @Override
    public void detener() {
        System.out.println("Detener el bondi");
    }

    @Override
    public void obtenerCapacidad() {
        System.out.println("Ingrese la capacidad del bondi: ");
        capacidad = leer.nextInt();
    }

    public void anunciarParada(String parada) {
        System.out.println("La siguente parada es " + parada);
    }
}
