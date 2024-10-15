import java.util.ArrayList;
import java.util.Objects;

public final class Perro extends Animal {
    private boolean vacunado;
    private ArrayList<String> visitas;

    public Perro(String nombre, Integer edad, Integer numVet, boolean vacunado) {
        super(nombre, edad, numVet);
        this.vacunado = vacunado;
        this.visitas = new ArrayList<>();
    }

    public ArrayList<String> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<String> visitas) {
        this.visitas = visitas;
    }

    public Perro(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perro perro)) return false;
        if (!super.equals(o)) return false;
        return getNumVet() == perro.getNumVet();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumVet());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Perro{" +
                "vacunado=" + vacunado +
                '}';
    }
}
