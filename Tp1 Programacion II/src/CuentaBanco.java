public class CuentaBanco
{
    int cvu;
    String nombre;
    int balance;

    public CuentaBanco(int cvu, String nombre, int balance) {
        this.cvu = cvu;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getCvu() {
        return cvu;
    }

    public void setCvu(int cvu) {
        this.cvu = cvu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void recibirCredito()
    {
        double credito = 200000.00;
        setBalance((int) (getBalance() + credito));
    }

    public void enviarDebito()
    {
        double debito = 550.00;

        if (getBalance() > debito) {
            setBalance((int) (getBalance() - debito));
        } else {
            System.out.println("Dinero insuficiente \n");
        }
    }

    @Override
    public String toString() {
        return "CuentaBanco{" +
                "cvu=" + cvu +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
