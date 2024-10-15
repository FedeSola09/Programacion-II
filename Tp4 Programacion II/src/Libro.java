import java.util.Objects;

public class Libro
{
    String titulo;
    String autor;
    Integer precio;
    Integer publicacion;

    public Libro(String titulo, String autor, Integer precio, Integer publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Integer publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }
}
