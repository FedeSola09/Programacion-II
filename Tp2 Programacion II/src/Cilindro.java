public class Cilindro extends Circulo
{
    double altura;

    public Cilindro(float radio, String color, double altura) {
        super(radio, color);
        this.altura = 1.0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    public float calcularVolumen()
    {
        return (float) (calcularArea() * altura);
    }
}
