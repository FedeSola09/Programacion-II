import java.util.ArrayList;
import java.util.Objects;

public final class Auto extends Vehiculo{

    // Variables
    protected ArrayList<String> ListaPrestaciones;
    protected Integer pasarCambios;

    // Constructores
    public Auto(String patente, String marca, int modelo, int consumoCombustible, int cantRuedas, float precio, String listaPrestaciones, int pasarCambios) {
        super(patente, marca, modelo, consumoCombustible, cantRuedas, precio);
        ListaPrestaciones = new ArrayList<>();
        this.pasarCambios = pasarCambios;
    }

    public Auto(ArrayList<String> listaPrestaciones, int pasarCambios) {
        ListaPrestaciones = new ArrayList<>();
        this.pasarCambios = pasarCambios;
    }

    // Getters y Setters
    public ArrayList<String> getListaPrestaciones() {
        return ListaPrestaciones;
    }

    public void setListaPrestaciones(ArrayList<String> listaPrestaciones) {
        ListaPrestaciones = listaPrestaciones;
    }

    public int getPasarCambios() {
        return pasarCambios;
    }

    public void setPasarCambios(int pasarCambios) {
        this.pasarCambios = pasarCambios;
    }

    // toString
    @Override
    public String toString() {
        return "Auto{" +
                "ListaPrestaciones=" + ListaPrestaciones +
                ", pasarCambios=" + pasarCambios +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", consumoCombustible=" + consumoCombustible +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                '}';
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto)) return false;
        return patente == auto.patente;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pasarCambios);
    }
}
