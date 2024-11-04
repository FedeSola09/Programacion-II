import java.util.Objects;

public class Clientes {
    private String nombre;
    private String mail;
    private Integer paqueteAcomprar;

    public Clientes(String nombre, String mail, Integer paqueteAcomprar) {
        this.nombre = nombre;
        this.mail = mail;
        this.paqueteAcomprar = paqueteAcomprar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getPaqueteAcomprar() {
        return paqueteAcomprar;
    }

    public void setPaqueteAcomprar(Integer paqueteAcomprar) {
        this.paqueteAcomprar = paqueteAcomprar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clientes clientes)) return false;
        return Objects.equals(mail, clientes.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mail);
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
