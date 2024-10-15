import java.util.Objects;

public abstract class Animal {
    private String nombre;
    private Integer edad;
    private Integer numVet;

    public Animal(String nombre, Integer edad, Integer numVet) {
        this.nombre = nombre;
        this.edad = edad;
        this.numVet = numVet;
    }

    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.numVet = 0;
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

    public Integer getNumVet() {
        return numVet;
    }

    public void setNumVet(Integer numVet) {
        this.numVet = numVet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return getNumVet() == animal.getNumVet();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumVet());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numVet=" + numVet +
                '}';
    }
}
