import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Punto 1
        Tienda local = new Tienda();
        Libro libro = new Libro("El oso poderoso", "Javier Sola", 10000, 2004);
        Libro libro2 = new Libro("El oso poderoso 2", "Federico Sola", 20000, 2005);

        local.agregarLibro(libro);
        local.agregarLibro(libro2);

        local.buscarLibro();
        local.actualizarPrecioLibro();
        System.out.println("El precio total de todos los libros es: " + local.precioTotalLibro());
        System.out.println("El total de libros es: " + local.contarTotalLibro());
        local.encontrarCaroLibro();
        local.encontrarBaratoLibro();

        local.eliminarLibro(libro);
        local.eliminarLibro(libro2);

        // Punto 2
        Scanner scanner = new Scanner(System.in);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Federico", 20, 'M');
        Persona persona3 = new Persona();

        String nombre;
        int edad;
        char sexo;
        float peso;
        float altura;
        System.out.println("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        persona1.setNombre(nombre);
        System.out.println("Ingrese la edad: ");
        edad = scanner.nextInt();
        persona1.setEdad(edad);
        System.out.println("Ingrese el genero: ");
        sexo = scanner.next().charAt(0);
        persona1.setSexo(sexo);
        System.out.println("Ingrese el peso: ");
        peso = scanner.nextFloat();
        persona1.setPeso(peso);
        System.out.println("Ingrese la altura: ");
        altura = scanner.nextFloat();
        persona1.setAltura(altura);

        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);

        Map <String, Persona> personas = new HashMap<>();
        personas.put(persona1.generarDNI(), persona1);
        personas.put(persona2.generarDNI(), persona2);
        personas.put(persona3.generarDNI(), persona3);

        for(Persona persona : personas.values())
        {
            int weight = persona.calcularIMC();

            if(weight == -1)
            {
                System.out.println("Esta por debajo del peso ideal");
            } else if (weight == 0)
            {
                System.out.println("Esta en el peso ideal");
            }
            else
            {
                System.out.println("Esta sobre el peso ideal");
            }
        }
    }
}