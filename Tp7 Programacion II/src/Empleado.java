import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Empleado {
    private Integer id;
    private String nombre;
    private double salario;
    private String departamento;
    private ArrayList<Empleado> empleadoArrayList;

    public Empleado(Integer id, String nombre, double salario, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        this.empleadoArrayList = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado empleado)) return false;
        return Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", departamento=" + departamento +
                '}';
    }

    public void empleadoAjson() {
        JSONObject object = new JSONObject();
        object.put("Nombre: ", this.nombre);
        object.put("Salario: ", this.salario);
        object.put("Departamento: ", this.departamento);

        try (FileWriter file = new FileWriter("empleado.json")) {
            file.write(object.toString(1));
            System.out.println("Archivo guardado correctamente");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static JSONTokener leerEmpleado(String archivo) {
        JSONTokener jsonTokener = null;
        try {
            jsonTokener = new JSONTokener(new FileReader(archivo));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return jsonTokener;
    }

    public boolean validarClaveJson() {
        for (Object object : empleadoArrayList) {
            if(object != null) {
                return true;
            }
        }
        return false;
    }
}

