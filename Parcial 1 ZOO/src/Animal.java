

public abstract class Animal {
    private String especie;
    private String nombre;
    private Integer edad;
    private eSalud salud;

    public Animal(String especie, String nombre, Integer edad, eSalud salud) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.salud = salud;
    }

    public Animal() {
        this("Desconocido", "Sin Nombre", 0, eSalud.regular);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public eSalud getSalud() {
        return salud;
    }

    public void setSalud(eSalud salud) {
        this.salud = salud;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
