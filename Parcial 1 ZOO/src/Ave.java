import java.util.Objects;

public final class Ave extends Animal implements iValoracion{
    private String tipoPlumaje;
    private Boolean migratorias;

    public Ave(String especie, String nombre, Integer edad, eSalud salud, String tipoPlumaje, Boolean migratorias) {
        super(especie, nombre, edad, salud);
        this.tipoPlumaje = tipoPlumaje;
        this.migratorias = migratorias;
    }

    public Ave(String tipoPlumaje, Boolean migratorias) {
        this.tipoPlumaje = "Desconocido";
        this.migratorias = false;
    }

    public String getTipoPlumaje() {
        return tipoPlumaje;
    }

    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    public Boolean getMigratorias() {
        return migratorias;
    }

    public void setMigratorias(Boolean migratorias) {
        this.migratorias = migratorias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ave ave)) return false;
        return Objects.equals(getEspecie(), ave.getEspecie());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipoPlumaje);
    }

    @Override
    public String toString() {
        return super.toString() + "Ave{" +
                "tipoPlumaje='" + tipoPlumaje + '\'' +
                ", migratorias=" + migratorias +
                '}';
    }

    @Override
    public int cambiarVal(Animal ave) {
        int valorLocal = 10;
        if (ave.getSalud().equals(eSalud.malo)) {
            valorLocal /= 2;
        }
        else if (ave.getSalud().equals(eSalud.regular)) {
            valorLocal *= 1;
        }
        else if (ave.getSalud().equals(eSalud.estupendo)) {
            valorLocal *= 2;
        }
        return valorLocal;
    }
}
