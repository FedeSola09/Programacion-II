import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import javax.xml.validation.Schema;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Punto 1:
        System.out.println("\nPUNTO 1: \n");
        Persona persona = new Persona("Federico", 20, "45825885", "Masculino");
        persona.guardarEnJSON();

        // Punto 2:
        System.out.println("\nPUNTO 2: \n");
        JSONTokener tokener = persona.leer("persona.json");

        if (tokener != null) {
            System.out.println("Archivo JSON leído exitosamente");
            JSONObject jsonObject = new JSONObject(tokener);
            System.out.println(jsonObject.toString(4));
        } else {
            System.out.println("No se pudo leer el archivo JSON");
        }

        // Punto 3:
        System.out.println("\nPUNTO 3: \n");
        Curso curso = new Curso("Sexto_Economia", 23);
        Persona persona2 = new Persona("Matias", 15, "123456789", "Masculino");
        Persona persona3 = new Persona("Martina", 21, "987654321", "Femenino");
        curso.agregarPersonas(persona);
        curso.agregarPersonas(persona2);
        curso.agregarPersonas(persona3);
        curso.eliminarPersonas(persona);
        curso.cursoAjson();
        JSONTokener jsonTokener = curso.leerCurso("curso.json");

        if (jsonTokener != null) {
            System.out.println("Archivo JSON leído exitosamente");
            JSONObject jsonObject = new JSONObject(jsonTokener);
            System.out.println(jsonObject.toString(4));
        } else {
            System.out.println("No se pudo leer el archivo JSON");
        }

        // Punto 4:
        System.out.println("\nPUNTO 4: \n");
        Libro libro1 = new Libro("Libro1", "Escritor1", 1);
        Libro libro2 = new Libro("Libro2", "Escritor2", 2);
        Libro libro3 = new Libro("Libro3", "Escritor3", 3);
        Biblioteca biblioteca = new Biblioteca("Biblioteca_Nacional");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.bibliotecaAjson();
        JSONTokener tokener1 = biblioteca.leerBiblioteca("biblioteca.json");

        if (tokener1 != null) {
            System.out.println("Archivo leido exitosamente");
            JSONObject obj = new JSONObject(tokener1);
            System.out.println(obj.toString(4));
        } else {
            System.out.println("No se pudo leer el archivo JSON");
        }

        biblioteca.eliminarLibro(libro1);
        biblioteca.eliminarLibro(libro2);
        biblioteca.bibliotecaAjson();
        JSONTokener tokener2 = biblioteca.leerBiblioteca("biblioteca.json");

        if (tokener2 != null) {
            System.out.println("Archivo leido exitosamente");
            JSONObject obj = new JSONObject(tokener2);
            System.out.println(obj.toString(4));
        } else {
            System.out.println("No se pudo leer el archivo JSON");
        }

        // Punto 5:
        System.out.println("\nPUNTO 5: \n");

        Empleado empleado = new Empleado(1, "Federico", 500, "4A");
        empleado.empleadoAjson();
        JSONTokener tokener3 = empleado.leerEmpleado("empleado.json");

        if (tokener3 != null) {
            System.out.println("Archivo leido exitosamente");
            JSONObject obj = new JSONObject(tokener3);
            System.out.println(obj.toString(4));
        } else {
            System.out.println("No se pudo leer el archivo JSON");
        }

       try {
           if (empleado.validarClaveJson()) {
               throw new RuntimeException();
           }
       }
       catch (RuntimeException e) {
           System.out.println("Error en el archivo JSON " + e.getMessage());
       }

    }
}
