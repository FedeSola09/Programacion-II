import java.util.Scanner;

public class Bicicleta implements Transporte
{
    String numeroSerie;
    TipoTransporte tipo;

    Scanner leer = new Scanner(System.in);

    public Bicicleta(String numeroSerie, TipoTransporte tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancar la cleta");
    }

    @Override
    public void detener() {
        System.out.println("Detener la cleta");
    }

    @Override
    public void obtenerCapacidad() {
        int capacidad = 1;
        System.out.println("La capacidad es de " + capacidad + "persona");
    }

    public void ajustarAsiento(int altura)
    {
        System.out.println("A que altura desea poner el asiento? : ");
        altura = leer.nextInt();
    }

}
