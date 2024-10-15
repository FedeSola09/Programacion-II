public abstract class Animal
{
    boolean hambre;
    boolean sueño;
    String sonido;

    public Animal(boolean hambre, boolean sueño, String sonido) {
        this.hambre = hambre;
        this.sueño = sueño;
        this.sonido = sonido;
    }

    public boolean isHambre() {
        return hambre;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }

    public boolean isSueño() {
        return sueño;
    }

    public void setSueño(boolean sueño) {
        this.sueño = sueño;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "hambre=" + hambre +
                ", sueño=" + sueño +
                ", sonido='" + sonido + '\'' +
                '}';
    }
}
