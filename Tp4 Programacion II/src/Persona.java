import java.util.Random;

public class Persona
{
    private static final char SEXO_POR_DEFECTO = 'H';
    private static final int INFRAPESO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private float peso;
    private float altura;

    public Persona()
    {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String dni, char sexo, float peso, float altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC()
    {
        float imc = peso / (altura * 2);

        if(imc < 20)
        {
            return INFRAPESO;
        } else if (imc > 20 && imc < 25)
        {
            return PESO_IDEAL;
        }
        else
        {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad()
    {
        if(edad >= 18)
        {
            return true;
        }
        return false;
    }

    private char comprobarSexo(char sexo)
    {
        if(sexo == 'H' || sexo == 'M')
        {
            return sexo;
        }
        return SEXO_POR_DEFECTO;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String generarDNI()
    {
        Random random = new Random();
        int numeroDNI = random.nextInt(90000000) + 10000000;
        char letraDNI = generarLetraDNI(numeroDNI);
        return Integer.toString(numeroDNI) + letraDNI;
    }

    private char generarLetraDNI(int numeroDNI)
    {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return letras.charAt(numeroDNI % 23);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
