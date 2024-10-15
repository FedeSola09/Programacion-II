import java.util.ArrayList;
import java.util.Objects;

public final class Mamifero extends Animal implements iValoracion{
    private ArrayList<String> habilidades;
    private String tipoPelaje;

    public Mamifero(String especie, String nombre, Integer edad, eSalud salud, ArrayList<String> habilidades, String tipoPelaje) {
        super(especie, nombre, edad, salud);
        this.habilidades = habilidades;
        this.tipoPelaje = tipoPelaje;
    }

    public Mamifero(ArrayList<String> habilidades, String tipoPelaje) {
        this.habilidades = new ArrayList<>();
        this.tipoPelaje = "Desconocido";
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mamifero mamifero)) return false;
        return Objects.equals(getEspecie(), mamifero.getEspecie());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipoPelaje);
    }

    @Override
    public String toString() {
        return super.toString() + "Mamifero{" +
                "habilidades=" + habilidades +
                ", tipoPelaje='" + tipoPelaje + '\'' +
                '}';
    }

    @Override
    public int cambiarVal(Animal mamifero) {
        int valorLocal = 30;
        if (mamifero.getSalud().equals(eSalud.malo)) {
            valorLocal *= 1;
        }
        else if (mamifero.getSalud().equals(eSalud.regular)) {
            valorLocal *= 2;
        }
        else if (mamifero.getSalud().equals(eSalud.estupendo)) {
           valorLocal *= 3;
        }
        return valorLocal;
    }
}
