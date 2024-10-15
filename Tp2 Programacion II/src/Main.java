import javax.xml.transform.Source;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);

        // Punto 1
        int opcion = 0;
        TiempoCompleto emp1 = new TiempoCompleto("Federico", 10000);
        PorHoras emp2 = new PorHoras("Lautaro", 15000, 100);
        Contratista emp3 = new Contratista("Tomas", 20000, 50, 2000);

        System.out.println("Ingrese 1 para ver empleado a tiempo completo.");
        System.out.println("Ingrese 2 para ver empleado por horas.");
        System.out.println("Ingrese 3 para ver empleado contratista.");
        System.out.println("Ingrese 4 para calcular pago de tiempo completo.");
        System.out.println("Ingrese 5 para calcular pago de empleado por horas.");
        System.out.println("Ingrese 6 para calcular pago de empleado contratista.");
        System.out.println("Opcion ingresada: ");

        opcion = leer.nextInt();

        switch (opcion)
        {
            case 1:
                System.out.println(emp1.toString());
                break;

            case 2:
                System.out.println(emp2.toString());
                break;

            case 3:
                System.out.println(emp3.toString());
                break;

            case 4:
                emp1.calcularPago();
                break;

            case 5:
                emp2.calcularPago();
                break;

            case 6:
                emp3.calcularPago();
                break;
        }

        //Punto 2
        Libro cuento = new Libro("Effective Java", 450, 150, "Joshua Bloch");
        Autor escritor = new Autor("Joshua", "Bloch", "joshua@gmail.com", 'M');
        cuento.modificarPrecio();
        cuento.modificarCopias();
        System.out.println(cuento.toString());
        System.out.println(escritor.toString());

        //Punto 3
        Cliente comprador = new Cliente(UUID.randomUUID(), "Federico", "federicosola09@gmail.com", 50);
        Factura recibo = new Factura(500, LocalDateTime.now(), "Juan");
        System.out.println("El monto total es: " + recibo.montoTotal);

        //Punto 4
        Circulo redondo = new Circulo(1.0F, "rojo");
        Cilindro alto = new Cilindro(1.0F, "rojo", 1.0);
        System.out.println("El area del circulo es: " + redondo.calcularArea());
        System.out.println("El volumen del cilindro es:" + alto.calcularVolumen());
        System.out.println(redondo.toString());
        System.out.println(alto.toString());

        //Punto 5
        Persona gente = new Persona("federicosola09@gmail.com", "Federico", "Sola", "Olavarria 3398");
        Estudiante alumno = new Estudiante("juanmedina123@gmail.com", "Juan", "Medina", "Primera junta 2234", 2023, 50000, "Programacion");
        Staff profesor = new Staff("marcosolivera78", "Marcos", "Olivera", "Dorrego 1778", 500000, "noche");
        Persona [] conjunto = new Persona[5];
        conjunto[0] = gente;
        conjunto[1] = alumno;
        conjunto[2] = profesor;

        int i = 0;
        for (i = 0; i < conjunto.length; i++)
        {
            System.out.println(conjunto[i]);
        }
    }
}