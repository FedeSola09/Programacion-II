public class NullAlumnoException extends Exception {

    public NullAlumnoException(String mensaje) {
        super(mensaje);
    }

    public String getMensaje() {
        return "Este alumno no existe en el listado" + super.getMessage();
    }
}