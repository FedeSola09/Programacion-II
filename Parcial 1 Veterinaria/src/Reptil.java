import java.util.Objects;

public class Reptil extends Animal {
    private String especie;
    private boolean venenoso;

    public Reptil(String nombre, Integer edad, Integer numVet, String especie, boolean venenoso) {
        super(nombre, edad, numVet);
        this.especie = especie;
        this.venenoso = venenoso;
    }

    public Reptil(String especie, boolean venenoso) {
        this.especie = especie;
        this.venenoso = venenoso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reptil reptil)) return false;
        if (!super.equals(o)) return false;
        return getNumVet() == reptil.getNumVet();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumVet());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Reptil{" +
                "especie='" + especie + '\'' +
                ", venenoso=" + venenoso +
                '}';
    }
}
