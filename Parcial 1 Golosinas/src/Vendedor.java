import java.util.Objects;

public final class Vendedor extends Empleado implements iSueldo{
    private double montoVentaMensual;

    public Vendedor(int legajo, String nombre, String apellido, String direccion, String fechaDeNacimiento, double montoVentaMensual) {
        super(legajo, nombre, apellido, direccion, fechaDeNacimiento);
        this.montoVentaMensual = montoVentaMensual;
    }

    public Vendedor(double montoVentaMensual) {
        this.montoVentaMensual = montoVentaMensual;
    }

    public double getMontoVentaMensual() {
        return montoVentaMensual;
    }

    public void setMontoVentaMensual(double montoVentaMensual) {
        this.montoVentaMensual = montoVentaMensual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vendedor vendedor)) return false;
        if (!super.equals(o)) return false;
        return legajo == vendedor.legajo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), montoVentaMensual);
    }

    @Override
    public String toString() {
        return super.toString() + "Vendedor{" +
                "montoVentaMensual=" + montoVentaMensual +
                ", legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaDeNacimiento='" + fechaDeNacimiento + '\'' +
                '}';
    }

    @Override
    public double cobrarSueldo(double sueldoFinal) {
        sueldoFinal = (getMontoVentaMensual() / 0.3);
        return sueldoFinal;
    }
}
