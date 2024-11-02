import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Curso {
    private String nombreCurso;
    private Integer código;
    private ArrayList<Persona> inscriptas;

    public Curso(String nombreCurso, Integer código) {
        this.nombreCurso = nombreCurso;
        this.código = código;
        this.inscriptas = new ArrayList<>();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Integer getCódigo() {
        return código;
    }

    public void setCódigo(Integer código) {
        this.código = código;
    }

    public ArrayList<Persona> getInscriptas() {
        return inscriptas;
    }

    public void setInscriptas(ArrayList<Persona> inscriptas) {
        this.inscriptas = inscriptas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso curso)) return false;
        return Objects.equals(código, curso.código);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(código);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", código=" + código +
                ", inscriptas=" + inscriptas +
                '}';
    }

    public void agregarPersonas(Persona persona) {
        if(persona != null) {
            inscriptas.add(persona);
        }
    }

    public boolean eliminarPersonas(Persona persona) {
        if(persona != null) {
            if (inscriptas.equals(persona)) {
                inscriptas.remove(persona);
                System.out.println("Se elimino correctamente");
                return true;
            }
        }
        return false;
    }

    public void cursoAjson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Nombre: ", this.nombreCurso);
        jsonObject.put("Codigo: ", this.código);
        jsonObject.put("Insciptos: ", this.inscriptas);

        try (FileWriter file = new FileWriter("curso.json")) {
            file.write(jsonObject.toString(3));
            System.out.println("Archivo guardado correctamente");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static JSONTokener leerCurso(String archivo) {
        JSONTokener jsonTokener = null;
        try {
            jsonTokener = new JSONTokener(new FileReader(archivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return jsonTokener;
    }

}
