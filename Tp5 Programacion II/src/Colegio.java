import java.util.ArrayList;
import java.util.HashSet;

public class Colegio {
    private ArrayList<Alumno> salon;

    public Colegio() {
        this.salon = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) throws NullAlumnoException {
        if (alumno != null) {
            salon.add(alumno);
        }
        else {
            throw new NullAlumnoException("El alumno no existe");
        }
    }

    public String verNacionalidad(String nacionalidad) {
        int cantidad = 0;
        System.out.println("Siendo la nacionalidad: " + nacionalidad);
        for(Alumno alumno : salon) {
            if (alumno.getNacionalidad().equals(nacionalidad)) {
                cantidad++;
            }
        }
        return "Se encontraron " + cantidad + " alumnos";
    }

    public int cuantos() {
        HashSet<Alumno> clase = new HashSet<>();
        clase.addAll(salon);
        return clase.size();
    }

    public boolean borrar(Alumno alumno) throws NullAlumnoException {
        if(alumno != null) {
            if (salon.remove(alumno) == true) {
                return true; //se elimino correctamente
            }
        }
        else {
            throw new NullAlumnoException("El alumno no existe");
        }
        return false;
    }

    public void verTodos() {
        HashSet<String> nacionalidades = new HashSet<>();

        for (Alumno alumno : salon) {
            nacionalidades.add(alumno.getNacionalidad());
        }

        for (String nacionalidad : nacionalidades) {
            int cantidad = 0;
            for (Alumno alumno : salon) {
                if (alumno.getNacionalidad().equals(nacionalidad)) {
                    cantidad++;
                }
            }
            System.out.println("Nacionalidad: " + nacionalidad + " - Cantidad: " + cantidad);
        }
    }
}

