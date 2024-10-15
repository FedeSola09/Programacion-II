public class Murcielago extends Animal implements CaminarYvolar
{
    public Murcielago(boolean hambre, boolean sueño, String sonido) {
        super(hambre, sueño, sonido);
    }

    @Override
    public String toString() {
        return "Murcielago{" +
                "sueño=" + sueño +
                ", hambre=" + hambre +
                ", sonido='" + sonido + '\'' +
                '}';
    }

    public void caminata()
    {
        if (caminar == true)
        {
            System.out.println("El murcielago camina.");
        }
        else
        {
            System.out.println("El murcielago no camina.");
        }
    }

    public void vuelo()
    {
        if (volar == true)
        {
            System.out.println("El murcielago vuela.");
        }
        else
        {
            System.out.println("El murcielago no vuela.");
        }
    }
}
