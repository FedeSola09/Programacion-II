import java.util.Objects;

public class DispositivoMovil extends ProductoElectronico {
    private String pantalla;
    private Integer bateria;

    public DispositivoMovil(String nombre, String marca, Integer precio, Integer stock, eSeccion seccionDeTienda,
                            String especificaciones, String pantalla, Integer bateria) {
        super(nombre, marca, precio, stock, seccionDeTienda, especificaciones);
        this.pantalla = pantalla;
        this.bateria = bateria;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public Integer getBateria() {
        return bateria;
    }

    public void setBateria(Integer bateria) {
        this.bateria = bateria;
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
                "DispositivoMovil{" +
                "pantalla='" + pantalla + '\'' +
                ", bateria=" + bateria +
                ", seccionDeTienda=" + seccionDeTienda +
                ", embalajes=" + embalajes +
                '}';
    }

    @Override
    public void detalleTecnico() {
        super.detalleTecnico();
    }
}
