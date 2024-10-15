import java.util.Objects;

public final class Administrador extends Empleado implements iSueldo{
    private eArea area;     // (finanzas, ventas, marketing, logistica)

    public Administrador(int legajo, String nombre, String apellido, String direccion, String fechaDeNacimiento, eArea area) {
        super(legajo, nombre, apellido, direccion, fechaDeNacimiento);
        this.area = area;
    }

    public Administrador(eArea area) {
        this.area = area;
    }

    public eArea getArea() {
        return area;
    }

    public void setArea(eArea area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Administrador that)) return false;
        if (!super.equals(o)) return false;
        return legajo == that.legajo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), area);
    }

    @Override
    public String toString() {
        return super.toString() + "Administrador{" +
                "area=" + area +
                ", nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                '}';
    }

    @Override
    public double cobrarSueldo(double sueldoFinal) {
        sueldoFinal = 15;
        return sueldoFinal;
    }
}
