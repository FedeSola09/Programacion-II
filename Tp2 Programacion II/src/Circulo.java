public class Circulo
{
    double radio;
    String color;

    public Circulo(float radio, String color) {
        this.radio = 1.0F;
        this.color = "rojo";
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    public double calcularArea()
    {
        double pi = 3.14;
        double area = pi * (getRadio() * getRadio());
        return area;
    }
}
