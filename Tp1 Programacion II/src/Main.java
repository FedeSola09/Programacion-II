import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //PUNTO 1 --------------------------------------------------------------------------------------------------
        Empleado emp1 = new Empleado(23456345, "Carlos", "Gutiérrez", 25000);
        Empleado emp2 = new Empleado(34234123, "Ana", "Sánchez", 27500);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        double salarioAnual = emp1.calcularAnual(emp1);
        double aumento = emp1.aumentarSalario(emp1);
        System.out.println("Sueldo anual con aumento aplicado: " + aumento * salarioAnual);

        // PUNTO 2 --------------------------------------------------------------------------------------------------
        CuentaBanco cuenta1 = new CuentaBanco(123456, "Federico", 15000);

        cuenta1.recibirCredito();
        cuenta1.enviarDebito();
        System.out.println(cuenta1.toString());

        // PUNTO 3 --------------------------------------------------------------------------------------------------
        Libro libro1 = new Libro("Federico Sola", 20000, 30);

        libro1.venderLibro();
        libro1.pedirCopias();
        System.out.println(libro1.toString());
    }

        // PUNTO 4 --------------------------------------------------------------------------------------------------
        ItemVenta objeto1 = new ItemVenta(1, "Juguete", 100, 1000);
        double totalPrecio;
        totalPrecio = objeto1.calcularPrecioTotal();
        System.out.println("Precio total: " + precioTotal);
        System.out.println(objeto1.toString());
}



