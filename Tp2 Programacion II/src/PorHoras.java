public class PorHoras extends  Empleado
{
    double horasTrabajadas;

    public PorHoras(String nombre, int salario, double horasTrabajadas) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "PorHoras{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public String calcularPago() {
        double resultado = getSalario() * horasTrabajadas;
        return String.valueOf((int) resultado);
    }
}