public class Libro
{
    private static int idCounter = 0;
    int libroID;
    String autor;
    double precio;
    int copiasDisp;

    public Libro(String autor, double precio, int copiasDisp) {
        this.libroID = ++idCounter;
        this.autor = autor;
        this.precio = precio;
        this.copiasDisp = copiasDisp;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Libro.idCounter = idCounter;
    }

    public int getLibroID() {
        return libroID;
    }

    public void setLibroID(int libroID) {
        this.libroID = libroID;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCopiasDisp() {
        return copiasDisp;
    }

    public void setCopiasDisp(int copiasDisp) {
        this.copiasDisp = copiasDisp;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "libroID=" + libroID +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", copiasDisp=" + copiasDisp +
                '}';
    }

    public void venderLibro()
    {
        int copiasVendidas = 6;

        if (getCopiasDisp() >= copiasVendidas)
        {
            setCopiasDisp(getCopiasDisp() - copiasVendidas);
        }
        else
        {
            System.out.println("No hay suficientes copias");
        }
    }

    public void pedirCopias()
    {
        int copiasNuevas = 9;
        setCopiasDisp(getCopiasDisp() + copiasNuevas);
    }
}
