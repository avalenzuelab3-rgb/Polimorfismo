package polimorfismo;


public class Ejercicio3 {

    
    
    static class Empleado {
        String nombre;

        public Empleado(String nombre) {
            this.nombre = nombre;
        }

        public void resumen() {
            System.out.println("Empleado: " + nombre);
        }
    }

    
    static class Vendedor extends Empleado {
        double comision;

        public Vendedor(String nombre, double comision) {
            super(nombre);
            this.comision = comision;
        }

        @Override
        public void resumen() {
            System.out.println("Vendedor: " + nombre + " | Comision: Q" + comision);
        }
    }

   
    public static void main(String[] args) {

        // Polimorfismo
        Empleado empleado = new Vendedor("Juan", 500);

        // Resultado
        empleado.resumen();
    }
}