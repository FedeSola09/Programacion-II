

public class Repartidor implements iSueldo{
    private double kmRecorrido;

    public Repartidor(double kmRecorrido) {
        this.kmRecorrido = kmRecorrido;
    }

    public Repartidor() {
        this.kmRecorrido = 0;
    }

    public double getKmRecorrido() {
        return kmRecorrido;
    }

    public void setKmRecorrido(double kmRecorrido) {
        this.kmRecorrido = kmRecorrido;
    }

    @Override
    public double cobrarSueldo(double sueldoFinal) {
        sueldoFinal = (kmRecorrido * 3);
        return sueldoFinal;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "kmRecorrido=" + kmRecorrido +
                '}';
    }
}
