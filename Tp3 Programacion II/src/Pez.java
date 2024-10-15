public class Pez extends Animal implements Nadar
{
    public Pez(boolean hambre, boolean sueño, String sonido) {
        super(hambre, sueño, sonido);
    }

    @Override
    public String toString() {
        return "Pez{" +
                "hambre=" + hambre +
                ", sueño=" + sueño +
                ", sonido='" + sonido + '\'' +
                '}';
    }

    public void natacion()
    {
        if (nadar == true)
        {
            System.out.println("El pez nada.");
        }
        else
        {
            System.out.println("El pez no nada.");
        }
    }
}
