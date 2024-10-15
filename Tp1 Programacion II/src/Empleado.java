import java.util.Scanner;

public class Empleado
{
    int dni;
    String nombre;
    String apellido;
    double salario;

    public Empleado(int dni, String nombre, String apellido, double salario)
    {
        this.dni= dni;
        this.nombre= nombre;
        this.apellido= apellido;
        this.salario= salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularAnual(Empleado emp1) {
        Scanner leerString = new Scanner(System.in);
        String elegir = "Si";
        System.out.println("Ingrese Si para calcular el salario anual: ");
        String ingresado = leerString.nextLine();
        if (elegir.compareTo(ingresado) == 0) {
            System.out.println("Salario anual de " + emp1.nombre + emp1.apellido + ": " + emp1.salario * 12);
        }
        return emp1.salario;
    }

    public double aumentarSalario(Empleado emp1) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el % de aumento de salario: ");
        double aumento = entrada.nextDouble();
        entrada.nextLine();
        double resultado = emp1.salario + (emp1.salario * aumento / 100);
        return resultado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }
}