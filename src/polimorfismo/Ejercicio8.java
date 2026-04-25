package polimorfismo;

public class Ejercicio8 {



    static class Producto {
        String nombre;
        double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public void mostrarDescripcion() {
            System.out.println("Producto: " + nombre);
            System.out.println("Precio: Q" + precio);
        }
    }

    static class ProductoDigital extends Producto {

        String formato;

        public ProductoDigital(String nombre, double precio, String formato) {
            super(nombre, precio);
            this.formato = formato;
        }

        @Override
        public void mostrarDescripcion() {
            System.out.println("Producto digital: " + nombre);
            System.out.println("Precio: Q" + precio);
            System.out.println("Formato: " + formato);
        }
    }

    public static void main(String[] args) {

        // Polimorfismo
        Producto producto = new ProductoDigital("Curso Java", 150, "PDF");

        // Mostrar descripcion
        producto.mostrarDescripcion();
    }
}