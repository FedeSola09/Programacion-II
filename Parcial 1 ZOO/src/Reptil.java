import java.util.Objects;

public final class Reptil extends Animal implements iValoracion{
    private String tipoEscamas;
    private Boolean venenoso;

    public Reptil(String especie, String nombre, Integer edad, eSalud salud, String tipoEscamas, Boolean venenoso) {
        super(especie, nombre, edad, salud);
        this.tipoEscamas = tipoEscamas;
        this.venenoso = venenoso;
    }

    public Reptil(String tipoEscamas, Boolean venenoso) {
        this.tipoEscamas = "Desconocido";
        this.venenoso = true;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public Boolean getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reptil reptil)) return false;
        return Objects.equals(getEspecie(), reptil.getEspecie());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipoEscamas);
    }

    @Override
    public String toString() {
        return super.toString() + "Reptil{" +
                "tipoEscamas='" + tipoEscamas + '\'' +
                ", venenoso=" + venenoso +
                '}';
    }

    @Override
    public int cambiarVal(Animal reptil) {
        int valorLocal = 10;
        if (reptil.getSalud().equals(eSalud.malo)) {
            valorLocal *= 1;
        }
        else if (reptil.getSalud().equals(eSalud.regular)) {
            valorLocal *= 1;
        }
        else if (reptil.getSalud().equals(eSalud.estupendo)) {
            valorLocal *= 3;
        }
        return valorLocal;
    }
}
