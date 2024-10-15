public class Pato extends Animal implements CaminarYvolar, Nadar
{
    public Pato(boolean hambre, boolean sueño, String sonido) {
        super(hambre, sueño, sonido);
    }

    @Override
    public String toString() {
        return "Pato{" +
                "hambre=" + hambre +
                ", sueño=" + sueño +
                ", sonido='" + sonido + '\'' +
                '}';
    }

    public void caminata()
    {
        if (caminar == true)
        {
            System.out.println("El pato camina.");
        }
        else
        {
            System.out.println("El pato no camina.");
        }
    }

    public void vuelo()
    {
        if (volar == true)
        {
            System.out.println("El pato vuela.");
        }
        else
        {
            System.out.println("El pato no vuela.");
        }
    }

    public void natacion()
    {
        if (nadar == true)
        {
            System.out.println("El pato nada.");
        }
        else
        {
            System.out.println("El pato no nada.");
        }
    }
}
