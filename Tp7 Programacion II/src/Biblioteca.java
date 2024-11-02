import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {
    private String nombreBiblioteca;
    private ArrayList<Libro> biblioteca;

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.biblioteca = new ArrayList<>();
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public ArrayList<Libro> getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(ArrayList<Libro> biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Biblioteca that)) return false;
        return Objects.equals(nombreBiblioteca, that.nombreBiblioteca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreBiblioteca);
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombreBiblioteca='" + nombreBiblioteca + '\'' +
                ", biblioteca=" + biblioteca +
                '}';
    }

    public void agregarLibro(Libro libro) {
        if(libro != null) {
            biblioteca.add(libro);
        }
    }

    public boolean eliminarLibro(Libro libro) {
        if (libro != null) {
            if (biblioteca.contains(libro)) {
                biblioteca.remove(libro);
                System.out.println("Se eliminó correctamente");
                return true;
            }
        }
        return false;
    }

    public void bibliotecaAjson() {
        JSONObject obj = new JSONObject();
        obj.put("Nombre: ", this.nombreBiblioteca);
        obj.put("Libros guardados: ", this.biblioteca);

        try (FileWriter file = new FileWriter("biblioteca.json")) {
            file.write(obj.toString(2));
            System.out.println("Archivo guardado correctamente");
        }
        catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static  JSONTokener leerBiblioteca(String archivo) {
        JSONTokener tokenerJson = null;
        try {
            tokenerJson = new JSONTokener(new FileReader(archivo));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return  tokenerJson;
    }

}
