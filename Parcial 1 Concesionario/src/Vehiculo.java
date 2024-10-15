

public abstract class Vehiculo {

    // Variables
    protected String patente;
    protected String marca;
    protected Integer modelo;
    protected Integer consumoCombustible;
    protected Integer cantRuedas;
    protected float precio;

    // Constructores
    public Vehiculo(String patente, String marca, int modelo, int consumoCombustible, int cantRuedas, float precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.consumoCombustible = consumoCombustible;
        this.cantRuedas = cantRuedas;
        this.precio = precio;
    }

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = 0;
        this.consumoCombustible = 0;
        this.cantRuedas = 0;
        this.precio = 0;
    }

    // Getters y Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // toString
    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", consumoCombustible=" + consumoCombustible +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                '}';
    }
}
