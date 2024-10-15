import java.util.ArrayList;
import java.util.Objects;

public class Gato extends Animal {
    private boolean esterilizado;
    private ArrayList<String> visitas;

    public Gato(String nombre, Integer edad, Integer numVet, boolean esterilizado) {
        super(nombre, edad, numVet);
        this.esterilizado = esterilizado;
        this.visitas = new ArrayList<>();;
    }

    public Gato(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public ArrayList<String> getVisitas() {
        return visitas;
    }

    public void setVisitas(ArrayList<String> visitas) {
        this.visitas = visitas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gato gato)) return false;
        if (!super.equals(o)) return false;
        return getNumVet() == gato.getNumVet();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumVet());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Gato{" +
                "esterilizado=" + esterilizado +
                '}';
    }
}
