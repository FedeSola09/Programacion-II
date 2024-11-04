import java.util.Objects;

public abstract class ProductoElectronico {
    private String nombre;
    private String marca;
    private Integer precio;
    private Integer stock;
    eSeccion seccionDeTienda;
    private String especificaciones;
    Embalaje embalajes;

    public ProductoElectronico(String nombre, String marca, Integer precio, Integer stock, eSeccion seccionDeTienda, String especificaciones) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.seccionDeTienda = seccionDeTienda;
        this.especificaciones = especificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public eSeccion getSeccionDeTienda() {
        return seccionDeTienda;
    }

    public void setSeccionDeTienda(eSeccion seccionDeTienda) {
        this.seccionDeTienda = seccionDeTienda;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    public Embalaje getEmbalajes() {
        return embalajes;
    }

    public void setEmbalajes(Embalaje embalajes) {
        this.embalajes = embalajes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoElectronico that)) return false;
        return Objects.equals(nombre, that.nombre) && Objects.equals(marca, that.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, marca);
    }

    @Override
    public String toString() {
        return "ProductoElectronico{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", seccionDeTienda=" + seccionDeTienda +
                ", especificaciones='" + especificaciones + '\'' +
                ", embalajes=" + embalajes +
                '}';
    }

    public void detalleTecnico() {

    }
}

