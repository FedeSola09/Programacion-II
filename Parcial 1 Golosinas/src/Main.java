import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Planilla planilla = new Planilla();
        Vendedor vendedor = new Vendedor(1, "Federico", "Sola", "Olavarria 1111", "13 09 2004", 100);
        Administrador administrador = new Administrador(2, "Matias", "Sola", "Rawson 2222", "22 12 2009", eArea.ventas);
        Repartidor repartidor = new Repartidor(100);

        int terminarEjecucion = 0;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (terminarEjecucion == 0) {

            System.out.println("Ingrese 1 para agregar un vendedor");
            System.out.println("Ingrese 2 para agregar un administrador");
            System.out.println("Ingrese 3 para agregar un repartidor");
            System.out.println("Ingrese 4 para buscar un empleado por legajo");
            System.out.println("Ingrese 5 para contar los empleados");
            System.out.println("Ingrese 6 para ver un listado de empleados");
            System.out.println("Ingrese 7 para eliminar un empleado por legajo");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    planilla.agregar(vendedor);
                    break;

                case 2:
                    planilla.agregar(administrador);
                    break;

                case 3:
                    planilla.agregarRepartidor(repartidor);
                    break;

                case 4:
                    if ((planilla.buscarPorLegajo(1)) == true) {
                        System.out.println("Se encontro el empleado");
                    }
                    else {
                        System.out.println("No se encontro el empleado");
                    }
                    break;

                case 5:
                    System.out.println("Cantidad de empleados: " + planilla.contarEmpleados());
                    break;

                case 6:
                    System.out.println("Listado de empleados: " + planilla.devolverListado());
                    break;

                case 7:
                    if ((planilla.eliminarPorLegajo(1)) == true) {
                        System.out.println("Se elimino el empleado");
                    }
                    else {
                        System.out.println("No se elimino el empleado");
                    }
                    break;

                default:
                    System.out.println("Opcion ingresada no valida");
                    break;

            }
            System.out.println("Ingrese 1 para cerrar el programa / 0 para volver al menu");
            terminarEjecucion = scanner.nextInt();
            scanner.nextLine();
        }

    }
}