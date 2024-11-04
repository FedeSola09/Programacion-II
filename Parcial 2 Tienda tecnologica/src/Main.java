public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda<>("ElectroStore", "Guemes 2234");
        DispositivoMovil movil1 = new DispositivoMovil("Celular", "Samsung", 1000, 55,
                eSeccion.CELULARES, "Funda", "Pantalla", 6000);
        Portatil portatil1 = new Portatil("Portatil", "ByteMachines", 4000, 110,
                eSeccion.COMPUTADORAS, "Sin especificaciones", "Procesador", 16);
        Accesorio accesorio1 = new Accesorio("Teclado", "Redragon", 600, 45,
                eSeccion.MAQUINAS, "RGB", "Switches red", "Con retroiluminacion");

        try {
            tienda.agregar(movil1);
            tienda.agregar(portatil1);
            tienda.agregar(accesorio1);
            System.out.println(tienda.listar());
            if (tienda.eliminar(movil1) == true) {
                System.out.println("Se elimino correctamente");
            }
            else {
                System.out.println("No se pudo eliminar");
            }
            tienda.agregar(movil1);
            System.out.println(tienda.filtrar());
        }
        catch (ProductoInvalidoException e) {
            e.getMessage();
        }
    }
}