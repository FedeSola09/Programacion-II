import Contenedores.Coleccion;
import Excepciones.IdentificadorRepetidoException;
import Interfaces.eGenero;
import Modelo.Expansion;
import Modelo.Juego;
import Modelo.Software;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;

public class Main {
    public static void main(String[] args) {
        Coleccion<Software> coleccion = new Coleccion<>();
        Juego juego1 = new Juego("gta", "federico", eGenero.RPG, 1, 1);
        Juego juego2 = new Juego("cs", "luana", eGenero.MMO, 2, 1);
        Expansion dlc = new Expansion("cs", "federico", eGenero.MMO, 3, "13-09.2004");

        try {
            System.out.println("\nPrueba 1: ");
            coleccion.agregar(juego1);
            coleccion.agregar(juego2);
            coleccion.agregar(dlc);
            coleccion.mostrar();
            System.out.println("\nPrueba 2: ");
            coleccion.eliminarPorId(juego1);
            coleccion.mostrar();
            System.out.println("\nPrueba 3: ");
            coleccion.filtrarXgen(eGenero.MMO);
        }
        catch (IdentificadorRepetidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
