package Model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Propietario {
    private String nombre;
    private String celular;
    private String dni;

    public Propietario(String nombre, String celular, String dni) {
        this.nombre = nombre;
        this.celular = celular;
        this.dni = dni;
    }

    public Propietario() {
        this.nombre = nombre;
        this.celular = celular;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Propietario that)) return false;
        return Objects.equals(dni, that.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public JSONObject propietariosToJSON(Propietario propietario) {
        JSONObject object = new JSONObject();
        try {
            object.put("Nombre", propietario.getNombre());
            object.put("Celular", propietario.getCelular());
            object.put("DNI", propietario.getDni());
        } catch (JSONException e) {
            System.out.println("Error en el pasaje de datos.");
        }
        return object;
    }

    public Propietario JSONtoPropietario(JSONObject object) {
        Propietario propietario = new Propietario();
        try {
            propietario.setNombre(object.getString("Nombre"));
            propietario.setCelular(object.getString("Celular"));
            propietario.setDni(object.getString("DNI"));
        } catch (JSONException e) {
            System.out.println("Error en el pasaje de datos.");
        }
        return propietario;
    }
}
