import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage estacionamiento = new Garage();
        Garage muelle = new Garage();
        Auto auto = new Auto("ABC123", "Chevrolet", 2008, 50, 4, 15,
                "prestaciones", 3);
        Moto moto = new Moto("DEF456", "Kawasaki", 2020, 80, 2, 7, false, 480);
        Yate yate = new Yate(100);

        Auto probar = new Auto("123", "chev", 2023, 111, 4, 15,
                "prestaciones", 3);
        estacionamiento.agregar(probar);

        estacionamiento.precioXobj();

        Integer opcion = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 1 para introducir un auto en el garage");
        System.out.println("Ingrese 2 para introducir una moto en el garage");
        System.out.println("Ingrese 3 para buscar un vehiculo por su patente"); // NO ANDA
        System.out.println("Ingrese 4 para contar el numero de vehiculos dentro del garage");
        System.out.println("Ingrese 5 para ver un listado de vehiculos dentro del garage");
        System.out.println("Ingrese 6 para eliminar un vehiculo por su patente"); // NO ANDA
        System.out.println("Ingrese 7 para ver el total de stock");
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                estacionamiento.agregar(auto);
                break;

            case 2:
                estacionamiento.agregar(moto);
                break;

            case 3:
                boolean rta3 = estacionamiento.buscarPorPatente("123");
                if(rta3 == true) {
                    System.out.println("Se encontro el vehiculo.");
                }
                else {
                    System.out.println("No se encontro el vehiculo.");
                }
                break;

            case 4:
                System.out.println("Existen " + estacionamiento.contar() + " vehiculos dentro del garage.");
                break;

            case 5:
                estacionamiento.devolverListado();
                break;

            case 6:
                boolean rta6 = estacionamiento.eliminarPorPatente("123");
                if(rta6 == true) {
                    System.out.println("Se elimino el vehiculo.");
                }
                else {
                    System.out.println("No se elimino el vehiculo.");
                }
                break;

            case 7:
                System.out.println("El total de stock es de " + estacionamiento.totalInventario());
                break;

            default:
                System.out.println("Opcion ingresada no valida");
                break;
        }
    }
}