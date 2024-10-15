import java.util.Objects;

public abstract class Empleado {
    public Integer legajo;
    public String nombre;
    public String apellido;
    public String direccion;
    public String fechaDeNacimiento;

    public Empleado(int legajo, String nombre, String apellido, String direccion, String fechaDeNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Empleado() {
        this.legajo = 0;
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.fechaDeNacimiento = "";
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado empleado)) return false;
        return legajo == empleado.legajo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(legajo);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                '}';
    }
}
