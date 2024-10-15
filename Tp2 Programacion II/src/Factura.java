import java.time.LocalDateTime;
import java.util.Scanner;

public class Factura
{
    int montoTotal;
    LocalDateTime fecha = LocalDateTime.now();
    String comprador;

    Scanner leer = new Scanner(System.in);

    public Factura(int montoTotal, LocalDateTime fecha, String comprador) {
        this.montoTotal = montoTotal;
        this.fecha = fecha;
        this.comprador = comprador;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "montoTotal=" + montoTotal +
                ", fecha=" + fecha +
                ", comprador='" + comprador + '\'' +
                '}';
    }

    public int montoFinal()
    {
        int montoUltimo;
        int descuento;
        System.out.println("Ingrese el % de descuento que tiene: ");
        descuento = leer.nextInt();
        montoUltimo = getMontoTotal() - (descuento / 100);
        return montoUltimo;
    }

}
