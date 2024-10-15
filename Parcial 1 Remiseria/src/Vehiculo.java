import java.util.Objects;

public abstract class Vehiculo {
    private String marca;
    private Integer modelo;
    private String tipoCombustible;
    private String patente;

    public Vehiculo(String marca, Integer modelo, String tipoCombustible, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.patente = patente;
    }

    public Vehiculo() {
        this.marca = "";
        this.modelo = 0;
        this.tipoCombustible = "";
        this.patente = "";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo vehiculo)) return false;
        return Objects.equals(patente, vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(patente);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", patente='" + patente + '\'' +
                '}';
    }

    public abstract Integer cobrar();
    public abstract Integer totalRecaudado();
}
