import java.util.ArrayList;
import java.util.Objects;

public class Tienda <T>{
    private String nombre;
    private String direccion;
    private ArrayList<T> productos;

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<T> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<T> productos) {
        this.productos = productos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tienda<?> tienda)) return false;
        return Objects.equals(direccion, tienda.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(direccion);
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", productos=" + productos +
                '}';
    }

    public void agregar(T producto) throws ProductoInvalidoException {
        if(producto != null) {
            productos.add(producto);
        }
        else {
            throw new ProductoInvalidoException("No se agrego el elemento");
        }
    }

    public boolean eliminar(T producto) {
        if(productos.equals(producto)) {
            productos.remove(producto);
            return true;
        }
        return false;
    }

    public String listar() {
        return productos.toString();
    }

    public String filtrar() throws ProductoInvalidoException{
        Integer dinero = 1000;
        Integer opcion = 1;

        for (T productoElectronico : productos) {
            if((dinero < 0) || ((ProductoElectronico) productoElectronico).getSeccionDeTienda() == null) {
                throw new ProductoInvalidoException("No existen productos con precio negativo");
            }
            switch (opcion) {
                case 1:
                if ((((ProductoElectronico) productoElectronico).getPrecio() < dinero) && (((ProductoElectronico) productoElectronico).getMarca()) == "ByteMachines") {
                    System.out.println("\nComputadoras de alta gama disponibles: " + productoElectronico);
                    opcion++;
                }
                case 2:
                if (((ProductoElectronico) productoElectronico).getSeccionDeTienda() == eSeccion.COMPUTADORAS) {
                    System.out.println("\nComputadoras disponibles: " + productoElectronico);
                    opcion++;
                }
                case 3:
                if ((((ProductoElectronico) productoElectronico).getStock() > 100) && (((ProductoElectronico) productoElectronico).getEspecificaciones().contains("RGB"))) {
                    System.out.println("\nAccesorios RGB con mayoria de stock: " + productoElectronico);
                }
            }
        }
        return "";
    }
}
