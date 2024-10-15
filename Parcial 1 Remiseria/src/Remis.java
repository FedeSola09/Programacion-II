import java.util.Objects;

public final class Remis extends Vehiculo {
    private Integer tarifaXcuadra;
    private Integer distanciaArecorrer;

    public Remis(String marca, Integer modelo, String tipoCombustible, String patente, Integer tarifaXcuadra, Integer distanciaArecorrer) {
        super(marca, modelo, tipoCombustible, patente);
        this.tarifaXcuadra = tarifaXcuadra;
        this.distanciaArecorrer = distanciaArecorrer;
    }

    public Remis(Integer tarifaXcuadra, Integer distanciaArecorrer) {
        this.tarifaXcuadra = tarifaXcuadra;
        this.distanciaArecorrer = distanciaArecorrer;
    }

    public Integer getTarifaXcuadra() {
        return tarifaXcuadra;
    }

    public void setTarifaXcuadra(Integer tarifaXcuadra) {
        this.tarifaXcuadra = tarifaXcuadra;
    }

    public Integer getDistanciaArecorrer() {
        return distanciaArecorrer;
    }

    public void setDistanciaArecorrer(Integer distanciaArecorrer) {
        this.distanciaArecorrer = distanciaArecorrer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Remis remis)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getPatente(), remis.getPatente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPatente());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Remis{" +
                "tarifaXcuadra=" + tarifaXcuadra +
                ", distanciaArecorrer=" + distanciaArecorrer +
                '}';
    }

    @Override
    public Integer cobrar() {
        Integer precioFinal = 0;
        precioFinal = (tarifaXcuadra * distanciaArecorrer);
        return precioFinal;
    }

    @Override
    public Integer totalRecaudado() {
        Integer total = 0;
        total += cobrar();
        return total;
    }
}
