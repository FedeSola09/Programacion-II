import java.util.Objects;

public class Embalaje {
    private String tipoEmbalaje;
    private String resistencia;
    private String dimensiones;

    public Embalaje(String tipoEmbalaje, String resistencia, String dimensiones) {
        this.tipoEmbalaje = tipoEmbalaje;
        this.resistencia = resistencia;
        this.dimensiones = dimensiones;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Embalaje embalaje)) return false;
        return Objects.equals(tipoEmbalaje, embalaje.tipoEmbalaje);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipoEmbalaje);
    }

    @Override
    public String toString() {
        return "Embalaje{" +
                "tipoEmbalaje='" + tipoEmbalaje + '\'' +
                ", resistencia='" + resistencia + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                '}';
    }
}
