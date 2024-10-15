import java.util.Scanner;

public class VehiculoVarios implements Vehiculo, VehiculoDePasajeros, VehiculoDeCarga
{
    String tipoVehiculo;
    Scanner scanner = new Scanner(System.in);

    public VehiculoVarios(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "VehiculoVarios{" +
                "tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }

    @Override
    public void contarPasajeros()
    {
        cantPasajeros = scanner.nextInt();
        System.out.println("Entran" + cantPasajeros + "pasajeros.");
    }

    @Override
    public void contarToneladas()
    {
        cantToneladas = scanner.nextInt();
        System.out.println("Entran" + cantToneladas + "toneladas.");
    }
}
