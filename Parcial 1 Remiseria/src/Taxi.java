import java.util.Objects;

public final class Taxi extends Vehiculo {
    private Integer contadorKM;
    private Integer bajadaBandera;
    private Integer precioXkm;

    public Taxi(String marca, Integer modelo, String tipoCombustible, String patente, Integer contadorKM, Integer bajadaBandera, Integer precioXkm) {
        super(marca, modelo, tipoCombustible, patente);
        this.contadorKM = contadorKM;
        this.bajadaBandera = bajadaBandera;
        this.precioXkm = precioXkm;
    }

    public Taxi(Integer contadorKM, Integer bajadaBandera, Integer precioXkm) {
        this.contadorKM = contadorKM;
        this.bajadaBandera = bajadaBandera;
        this.precioXkm = precioXkm;
    }

    public Integer getContadorKM() {
        return contadorKM;
    }

    public void setContadorKM(Integer contadorKM) {
        this.contadorKM = contadorKM;
    }

    public Integer getBajadaBandera() {
        return bajadaBandera;
    }

    public void setBajadaBandera(Integer bajadaBandera) {
        this.bajadaBandera = bajadaBandera;
    }

    public Integer getPrecioXkm() {
        return precioXkm;
    }

    public void setPrecioXkm(Integer precioXkm) {
        this.precioXkm = precioXkm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Taxi taxi)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getPatente(), taxi.getPatente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPatente());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Taxi{" +
                "contadorKM=" + contadorKM +
                ", bajadaBandera=" + bajadaBandera +
                ", precioXkm=" + precioXkm +
                '}';
    }

    @Override
    public Integer cobrar() {
        Integer total = 0;
        total = (bajadaBandera + (contadorKM * precioXkm));
        return total;
    }

    @Override
    public Integer totalRecaudado() {
        Integer total = 0;
        total += cobrar();
        return total;
    }
}
