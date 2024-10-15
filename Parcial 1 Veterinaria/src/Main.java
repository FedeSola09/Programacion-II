import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Veterinaria ntu = new Veterinaria();
        Perro perro1 = new Perro("Felipe", 9, 1, false);
        Perro perro2 = new Perro("Dana", 12, 2, true);
        Gato gato1 = new Gato("Pancho", 17, 3, true);
        Gato gato2 = new Gato("Roma", 3, 4, false);
        Reptil reptil1 = new Reptil("Manchas", 20, 5, "iguana", false);
        Reptil reptil2 = new Reptil("Maligno", 4, 6, "serpiente", true);

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int cerrarPrograma = 0;

        while (cerrarPrograma == 0) {

            System.out.println("Ingrese 1 para dar de alta los animales");
            System.out.println("Ingrese 2 para dar de baja los animales");
            System.out.println("Ingrese 3 para esterilizar un gato");
            System.out.println("Ingrese 4 para vacunar un perro");
            System.out.println("Ingrese 5 para cargarle visitas a un perro");
            System.out.println("Ingrese 6 para cargarle visitas a un gato");
            System.out.println("Ingrese 7 para alimentar a los animales");
            System.out.println("Ingrese 8 para hacer una revision veterinaria a los animales");
            System.out.println("Ingrese 9 para contar los perros que hay en la veterinaria");
            System.out.println("Ingrese 10 para eliminar un animal por numero de veterinaria");
            System.out.println("Ingrese 11 para confirmar la toxina");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ntu.darDeAlta(perro1);
                    ntu.darDeAlta(perro2);
                    ntu.darDeAlta(gato1);
                    ntu.darDeAlta(gato2);
                    ntu.darDeAlta(reptil1);
                    ntu.darDeAlta(reptil2);
                    break;

                case 2:
                    ntu.darDeBaja(perro1);
                    ntu.darDeBaja(perro2);
                    ntu.darDeBaja(gato1);
                    ntu.darDeBaja(gato2);
                    ntu.darDeBaja(reptil1);
                    ntu.darDeBaja(reptil2);
                    break;

                case 3:
                    if ((ntu.esterilizarGato(gato2)) == true) {
                        System.out.println("El gato fue esterilizado");
                    }
                    else {
                        System.out.println("No se pudo esterilizar al gato");
                    }
                    break;

                case 4:
                    if ((ntu.vacunarPerro(perro1)) == true) {
                        System.out.println("El perro fue vacunado");
                    }
                    else {
                        System.out.println("No se pudo vacunar al perro");
                    }
                    break;

                case 5:
                    ntu.cargarVisitaPerro("Dueña", perro1);
                    System.out.println("Visita cargada!");
                    break;

                case 6:
                    ntu.cargarVisitaGato("Amigo del dueño", gato2);
                    System.out.println("Visita cargada!");
                    break;

                case 7:
                    System.out.println(ntu.alimentarse());
                    break;

                case 8:
                    System.out.println(ntu.revisionVet());
                    break;

                case 9:
                    System.out.println("Perros en la veterinaria: " + ntu.contarPerros());
                    break;

                case 10:
                    if ((ntu.eliminarPorNumVet(3)) == true) {
                        System.out.println("El animal fue eliminado del sistema");
                    }
                    else {
                        System.out.println("No se pudo eliminar al animal del sistema");
                    }
                    break;

                case 11:
                    ntu.confirmarToxina(reptil1, true);
                    break;

                default:
                    System.out.println("Opcion ingresada no valida");
                    break;
            }

            System.out.println("Ingrese 1 para cerrar el programa / 0 para volver al menu");
            cerrarPrograma = scanner.nextInt();
            scanner.nextLine();
        }


    }
}