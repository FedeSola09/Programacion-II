public class Contratista extends Empleado
{
    double horasTrabadas;
    double tarifaXproyecto;

    public Contratista(String nombre, int salario, double horasTrabadas, double tarifaXproyecto) {
        super(nombre, salario);
        this.horasTrabadas = horasTrabadas;
        this.tarifaXproyecto = tarifaXproyecto;
    }

    public double getHorasTrabadas() {
        return horasTrabadas;
    }

    public void setHorasTrabadas(double horasTrabadas) {
        this.horasTrabadas = horasTrabadas;
    }

    public double getTarifaXproyecto() {
        return tarifaXproyecto;
    }

    public void setTarifaXproyecto(double tarifaXproyecto) {
        this.tarifaXproyecto = tarifaXproyecto;
    }

    @Override
    public String toString() {
        return "Contratista{" +
                "horasTrabadas=" + horasTrabadas +
                ", tarifaXproyecto=" + tarifaXproyecto +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public String calcularPago() {
        return String.valueOf((int) (getHorasTrabadas() * getTarifaXproyecto()));
    }
}