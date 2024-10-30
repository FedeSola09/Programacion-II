import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Punto 1
//        try
//        {
//            Persona p = baseDeDatos.buscar(datos);
//            System.out.println(“Los datos pertenecen a: ” + p);
//        }
//        catch(Exception e) {
//        // Maneja cualquiera de las excepciones comprobadas
//        }
//        catch(RuntimeException e) {
//        // Maneja cualquiera de las excepciones no comprobadas
//        }

        // RESPUESTA: Se esta usando el Exception mas general de todos en primer lugar, por lo que siempre que salte una
        // excepcion, se ejecutara esa y no dara lugar a otras. Por esto mismo es recomendable ir de menor a mayor en cuanto a generalidad.

        // Punto 2
//        public static class EjemploExcepciones{
//        public static int devuelveNumero(int num) {
//            try {
//                if (num % 2 == 0) { throw new Exception("Lanzando excepcion");
//                }
//                return 1;
//            } catch (Exception ex) {
//              ex.getMessage().concat("Rompi todo y pase por Catch");
//              return 2;
//              }
//                  finally {
//                  return 3;
//                  }
//              }
//      }

        // RESPUESTA: En este codigo se ejecutara primero el return 1, luego el return 2 y finalmente el return 3.

        //Punto 3
        // Juego de adivinar un numero aleatorio

        int random = (int) ((Math.random() *500) + 1);
        System.out.println(random);
        int numeroIngresado = 0;
        int cantIntentos = 0;
        Scanner scanner = new Scanner(System.in);

        while (numeroIngresado != random) {
            try {
                System.out.println("Ingrese un numero entre 1 y 500 para intentar adivinar un numero elegido por la maquina");
                numeroIngresado = scanner.nextInt();
                scanner.nextLine();

                if (numeroIngresado < 1 || numeroIngresado > 500) {
                    throw new IndexOutOfBoundsException();
                }

                if (numeroIngresado != random) {
                    if (numeroIngresado < random) {
                        System.out.println("EL NUMERO INGRESADO ES MENOR AL NUMERO ELEGIDO");
                    } else if (numeroIngresado > random) {
                        System.out.println("EL NUMERO INGRESADO ES MAYOR AL NUMERO ELEGIDO");
                    }
                } else {
                    System.out.println("ACERTASTE! TE TOMO " + cantIntentos + " INTENTOS");
                }
            }
                catch (InputMismatchException mismatchException){
                    System.out.println("El caracter ingresado no fue un numero");
                    scanner.nextLine();
                }
                catch (IndexOutOfBoundsException outOfBoundsException) {
                    System.out.println("EL NUMERO INGRESADO ESTA FUERA DEL RANGO");
                }
                cantIntentos++;
        }

        //Punto 4
//        Alumno alumno1 = new Alumno("Federico", "Argentina");
//        Alumno alumno2 = new Alumno("Matias", "Bolivia");
//        Alumno alumno3 = new Alumno("Geronimo", "Uruguay");
//        Colegio colegio = new Colegio();
//
//        try {
//            colegio.agregarAlumno(alumno1);
//            colegio.agregarAlumno(alumno2);
//            colegio.agregarAlumno(alumno3);
//            System.out.println(colegio.verNacionalidad("Argentina"));
//            System.out.println(colegio.verNacionalidad("Bolivia"));
//            System.out.println(colegio.verNacionalidad("Uruguay"));
//            System.out.println("Cantidad de nacionalidades: " + colegio.cuantos());
//            colegio.borrar(alumno1);
//            colegio.verTodos();
//        }
//        catch (NullAlumnoException nullAlumnoException) {
//            System.out.println(nullAlumnoException.getMensaje());
//        }
    }
}