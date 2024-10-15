public class Staff extends Persona
{
    int salario;
    String turno; // mañana o noche

    public Staff(String email, String nombre, String apellido, String direccion, int salario, String turno) {
        super(email, nombre, apellido, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

}
