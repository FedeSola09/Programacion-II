import java.util.Scanner;

public class Libro
{
    String titulo;
    int precio;
    int stock;
    String autor;

    Scanner leer = new Scanner(System.in);

    public Libro(String titulo, int precio, int stock, String autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor='" + autor + '\'' +
                '}';
    }

    public void modificarCopias()
    {
        int agregarCopias;
        System.out.println("Ingrese la cantidad de copias que desea agregar: ");
        agregarCopias = leer.nextInt();
        setStock(getStock() + agregarCopias);
    }

    public void modificarPrecio()
    {
        int nuevoPrecio;
        System.out.println("Ingrese el nuevo precio: ");
        nuevoPrecio = leer.nextInt();
        setPrecio(nuevoPrecio);
    }
}