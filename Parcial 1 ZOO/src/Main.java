import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Mamifero mamifero = new Mamifero("Perro", "Manchas", 10, eSalud.regular, new ArrayList<>(), "Suave");
        Ave ave = new Ave("Loro", "Pepe", 3, eSalud.estupendo, "Colorido", false);
        Reptil reptil = new Reptil("Serpiente", "ZZZ", 6, eSalud.malo, "Largas", true);

        Integer opcion = 0;
        Integer terminarPrograma = 0;
        Scanner scanner = new Scanner(System.in);

        while (terminarPrograma == 0) {
            System.out.println("Ingrese 1 para agregar un mamifero a su jaula");
            System.out.println("Ingrese 2 para agregar un ave a su jaula");
            System.out.println("Ingrese 3 para agregar un reptil a su jaula");
            System.out.println("Ingrese 4 para buscar por especie");    // NO ANDA
            System.out.println("Ingrese 5 para contar los animales en el zoo");    // NO ANDA
            System.out.println("Ingrese 6 para ver un listado de animales en el zoo");
            System.out.println("Ingrese 7 para eliminar un animal por su nombre");    // NO ANDA
            System.out.println("Ingrese 8 para ver las valoraciones");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    zoo.agregar(mamifero);
                    break;

                case 2:
                    zoo.agregar(ave);
                    break;

                case 3:
                    zoo.agregar(reptil);
                    break;

                case 4:
                    if ((zoo.buscarPorEspecie("Loro")) == true) {
                        System.out.println("Se encontro el animal");
                    } else {
                        System.out.println("No se encontro el animal");
                    }
                    break;

                case 5:
                    System.out.println("Existen " + zoo.contar() + " animales en el zoo");
                    break;

                case 6:
                    System.out.println("Listado de animales: " + zoo.devolverListado());
                    break;

                case 7:
                    if ((zoo.eliminarPorNombre("Loro")) == true) {
                        System.out.println("Se elimino el animal");
                    } else {
                        System.out.println("No se elimino el animal");
                    }
                    break;

                case 8:
                    System.out.println("Valoracion del zoo: " + zoo.cambiarValor(true));
                    System.out.println("Valoracion del mamifero: " + mamifero.cambiarVal(mamifero));
                    System.out.println("Valoracion del ave: " + ave.cambiarVal(ave));
                    System.out.println("Valoracion del reptil: " + reptil.cambiarVal(reptil));
                    break;
            }

            System.out.println("Desea cerrar el programa?");
            System.out.println("Ingrese 1 para si." +
                               "Ingrese 0 para no.");
            terminarPrograma = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
