public class TiempoCompleto extends  Empleado
{
    public TiempoCompleto(String nombre, int salario) {
        super(nombre, salario);
    }

    @Override
    public String toString() {
        return "TiempoCompleto{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public String calcularPago() {
        return "El salario es de: " + salario;
    }
}