import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gestor paginaWeb = new Gestor();
        Taxi taxi1 = new Taxi("Chevrolet", 2008, "Diesel", "ABC123", 10, 500, 100);
        Taxi taxi2 = new Taxi("Renault", 2005, "Gas", "DEF456", 5, 500, 100);
        Remis remis1 = new Remis("Ford", 2016, "Gasoil", "GHI789", 200, 10);
        Remis remis2 = new Remis("Renault", 2011, "Gas", "JKL123", 200, 10);
        Cliente cliente1 = new Cliente("Federico", "Sola", 123456789, "Guemes 1111");
        Cliente cliente2 = new Cliente("Matias", "Sola", 987654321, "Olavarria 2222");

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int cerrarPrograma = 0;

        while (cerrarPrograma == 0) {
            System.out.println("Ingrese 1 para agregar los autos");
            System.out.println("Ingrese 2 para agregar los clientes");
            System.out.println("Ingrese 3 para pedir un taxi");
            System.out.println("Ingrese 4 para pedir un remis");
            System.out.println("Ingrese 5 para ver el total recaudado");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    paginaWeb.agregarAuto(taxi1);
                    paginaWeb.agregarAuto(taxi2);
                    paginaWeb.agregarAuto(remis1);
                    paginaWeb.agregarAuto(remis2);
                    break;

                case 2:
                    paginaWeb.agregarPersona(cliente1);
                    paginaWeb.agregarPersona(cliente2);
                    break;

                case 3:
                    System.out.println("Viaje finalizado, el total es de " + taxi1.cobrar());
                    break;

                case 4:
                    System.out.println("Viaje finalizado, el total es de " + remis1.cobrar());
                    break;

                case 5:
                    System.out.println("Total recaudado en el dia: " + paginaWeb.sueldoDelDia());
                    break;

                default:
                    System.out.println("Opcion ingresada no valida.");
                    break;
            }

            System.out.println("Ingrese 1 para cerrar el programa / 0 para volver al menu.");
            cerrarPrograma = scanner.nextInt();
            scanner.nextLine();
        }
    }
}