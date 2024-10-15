import java.util.UUID;
public class Cliente
{
    UUID valorRandom = UUID.randomUUID();
    String nombre;
    String email;
    int porcentajeDesc;

    public Cliente(UUID valorRandom, String nombre, String email, int porcentajeDesc) {
        this.valorRandom = valorRandom;
        this.nombre = nombre;
        this.email = email;
        this.porcentajeDesc = porcentajeDesc;
    }

    public UUID getValorRandom() {
        return valorRandom;
    }

    public void setValorRandom(UUID valorRandom) {
        this.valorRandom = valorRandom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(int porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "valorRandom=" + valorRandom +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", porcentajeDesc=" + porcentajeDesc +
                '}';
    }
}
