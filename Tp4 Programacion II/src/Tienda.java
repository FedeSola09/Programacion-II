import java.util.ArrayList;
import java.util.Scanner;

public class Tienda
{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Libro> stock = new ArrayList<>();

    public void agregarLibro(Libro agregar)
    {
        stock.add(agregar);
    }

    public void eliminarLibro(Libro eliminar)
    {
        stock.remove(eliminar);
    }

    public boolean buscarLibro()
    {
        String tituloBuscado;
        System.out.println("Ingrese el nombre del libro que desea buscar: ");
        tituloBuscado = scanner.nextLine();

        if(stock.contains(tituloBuscado))
        {
            return true;
        }
        return false;
    }

    public void actualizarPrecioLibro()
    {
        Integer posLibro = 0;
        Integer nuevoPrecio = 0;
        System.out.println("Ingrese la posicion del libro que desea actualizar: ");
        posLibro = scanner.nextInt();
        System.out.println("Ingrese el nuevo precio del libro que desea actualizar: ");
        nuevoPrecio = scanner.nextInt();

        Libro libro = stock.get(posLibro);
        libro.setPrecio(nuevoPrecio);
    }

    public int precioTotalLibro()
    {
        int precioTotal = 0;

        for(int i = 0; i < stock.size(); i++)
        {
            Libro libro = stock.get(i);
            precioTotal += libro.getPrecio();
        }
        return precioTotal;
    }

    public int contarTotalLibro()
    {
        int totalLibros = stock.size();
        return totalLibros;
    }

    public Libro encontrarCaroLibro()
    {
        Libro libroMasCaro = stock.get(0);

        for (int i = 1; i < stock.size(); i++)
        {
            Libro libroActual = stock.get(i);
            if (libroActual.getPrecio() > libroMasCaro.getPrecio())
            {
                libroMasCaro = libroActual;
            }
        }

        return libroMasCaro;
    }

    public Libro encontrarBaratoLibro()
    {
        Libro libroMasBarato = stock.get(0);

        for (int i = 1; i < stock.size(); i++)
        {
            Libro libroActual = stock.get(i);
            if (libroActual.getPrecio() < libroMasBarato.getPrecio())
            {
                libroMasBarato = libroActual;
            }
        }

        return libroMasBarato;
    }

}
