import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Persona {
    String nombre;
    Integer edad;
    String dni;
    String genero;

    public Persona(String nombre, Integer edad, String dni, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.genero = genero;
    }

    public Persona() {
        this.nombre = "";
        this.edad = null;
        this.dni = "";
        this.genero = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void guardarEnJSON() {
        JSONObject objeto = new JSONObject();
        objeto.put("Nombre: ", this.nombre);
        objeto.put("Edad: ", this.edad);
        objeto.put("DNI: ", this.dni);
        objeto.put("Genero: ", String.valueOf(this.genero));

        try (FileWriter file = new FileWriter("persona.json")) {
            file.write(objeto.toString(4));
            System.out.println("Archivo guardado correctamente");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static JSONTokener leer(String archivo) {
        JSONTokener tokener = null;

        try {
            tokener = new JSONTokener(new FileReader(archivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return tokener;
    }
}