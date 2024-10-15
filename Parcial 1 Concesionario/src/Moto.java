import java.util.ArrayList;
import java.util.Objects;

public final class Moto extends Vehiculo{

    // Variables
    protected Integer cc;
    protected Boolean baul;

    // Constructores
    public Moto(String patente, String marca, int modelo, int consumoCombustible, int cantRuedas, float precio, boolean baul, int cc) {
        super(patente, marca, modelo, consumoCombustible, cantRuedas, precio);
        this.baul = baul;
        this.cc = cc;
    }

    public Moto(boolean baul, int cc) {
        this.baul = baul;
        this.cc = cc;
    }

    // Getters y Setters
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isBaul() {
        return baul;
    }

    public void setBaul(boolean baul) {
        this.baul = baul;
    }

    // toString
    @Override
    public String toString() {
        return "Moto{" +
                "cc=" + cc +
                ", baul=" + baul +
                ", patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", consumoCombustible=" + consumoCombustible +
                ", cantRuedas=" + cantRuedas +
                ", precio=" + precio +
                '}';
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moto moto)) return false;
        return patente == moto.patente;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cc);
    }
}
