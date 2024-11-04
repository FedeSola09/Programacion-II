import java.util.Objects;

public class Accesorio extends ProductoElectronico {
    private String tipoDeTecla;
    private String retroiluminacion;

    public Accesorio(String nombre, String marca, Integer precio, Integer stock, eSeccion seccionDeTienda,
                     String especificaciones, String tipoDeTecla, String retroiluminacion) {
        super(nombre, marca, precio, stock, seccionDeTienda, especificaciones);
        this.tipoDeTecla = tipoDeTecla;
        this.retroiluminacion = retroiluminacion;
    }

    public String getTipoDeTecla() {
        return tipoDeTecla;
    }

    public void setTipoDeTecla(String tipoDeTecla) {
        this.tipoDeTecla = tipoDeTecla;
    }

    public String getRetroiluminacion() {
        return retroiluminacion;
    }

    public void setRetroiluminacion(String retroiluminacion) {
        this.retroiluminacion = retroiluminacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoElectronico that)) return false;
        return Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getMarca(), that.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getMarca());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Accesorio{" +
                "tipoDeTecla='" + tipoDeTecla + '\'' +
                ", retroiluminacion='" + retroiluminacion + '\'' +
                ", seccionDeTienda=" + seccionDeTienda +
                ", embalajes=" + embalajes +
                '}';
    }

    @Override
    public void detalleTecnico() {
        super.detalleTecnico();
    }
}
