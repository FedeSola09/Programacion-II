public class Main {
    public static void main(String[] args) {
        // Punto 1
        System.out.println("PUNTO 1:");
        Almacenamiento<String> stringAlmacenamiento = new Almacenamiento<>("Palabra");
        stringAlmacenamiento.agregar("Palabra1");
        stringAlmacenamiento.eliminar("Palabra");
        stringAlmacenamiento.buscarObjeto("Palabra1");
        System.out.println(stringAlmacenamiento.toString());

        Almacenamiento<Integer> integerAlmacenamiento = new Almacenamiento<>(9);
        integerAlmacenamiento.agregar(99);
        integerAlmacenamiento.eliminar(9);
        integerAlmacenamiento.buscarObjeto(99);
        System.out.println(integerAlmacenamiento.toString());

        // Punto 2
        System.out.println("PUNTO 2:");
        Pila<String> stringPila = new Pila<>("Cartas");
        stringPila.agregar("segunda");
        if(stringPila.verificarContenido() == true) {
            System.out.println("Esta vacia");
        }
        else {
            System.out.println("No esta vacia");
        }
        stringPila.quitar();
        System.out.println("Cantidad de elementos: " + stringPila.cantElementos());
        System.out.println(stringPila.toString());

        Pila<Integer> integerPila = new Pila<>(1);
        integerPila.agregar(2);
        if(integerPila.verificarContenido() == true) {
            System.out.println("Esta vacia");
        }
        else {
            System.out.println("No esta vacia");
        }
        integerPila.quitar();
        System.out.println("Cantidad de elementos: " + integerPila.cantElementos());
        System.out.println(integerPila.toString());

        // Punto 3
        System.out.println("PUNTO 3:");
        OperacionMatematica<Integer> integerOperacionMatematica = new OperacionMatematica<>(3, 3);
        System.out.println("Suma: " + integerOperacionMatematica.suma());
        System.out.println("Resta: " + integerOperacionMatematica.resta());
        System.out.println("Multiplicacion: " + integerOperacionMatematica.multiplicacion());
        System.out.println("Division: " + integerOperacionMatematica.division());

        // Punto 4
        System.out.println("PUNTO 4:");
        Conjunto<String> stringConjunto = new Conjunto<>("Madera");
        stringConjunto.agregar("Metal");
        stringConjunto.eliminar("Madera");
        if(stringConjunto.verificarElemento("Metal") == true) {
            System.out.println("Existe");
        }
        else {
            System.out.println("No existe");
        }
        System.out.println(stringConjunto.toString());

        Conjunto<Integer> integerConjunto = new Conjunto<>(1);
        integerConjunto.agregar(2);
        integerConjunto.eliminar(1);
        if(integerConjunto.verificarElemento(1) == true) {
            System.out.println("Existe");
        }
        else {
            System.out.println("No existe");
        }
        System.out.println(integerConjunto.toString());

        // Punto 5
        System.out.println("PUNTO 5:");
        ListaOrdenada<Integer> integerListaOrdenada = new ListaOrdenada<>(1);
        integerListaOrdenada.agregar(2);
        integerListaOrdenada.agregar(3);
        integerListaOrdenada.eliminar(3);
        System.out.println(integerListaOrdenada.ordenDescendente());
        System.out.println(integerListaOrdenada.ordenAscendente());
        System.out.println("Posicion: " + integerListaOrdenada.obtenerPosicion(2));
        System.out.println(integerListaOrdenada.toString());
    }
}