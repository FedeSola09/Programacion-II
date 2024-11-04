import java.util.Objects;

public class Portatil extends ProductoElectronico{
    private String procesador;
    private Integer memoriaRAM;

    public Portatil(String nombre, String marca, Integer precio, Integer stock, eSeccion seccionDeTienda,
                    String especificaciones, String procesador, Integer memoriaRAM) {
        super(nombre, marca, precio, stock, seccionDeTienda, especificaciones);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Integer getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(Integer memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
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
                "Portatil{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", seccionDeTienda=" + seccionDeTienda +
                ", embalajes=" + embalajes +
                '}';
    }

    @Override
    public void detalleTecnico() {
        super.detalleTecnico();
    }
}
