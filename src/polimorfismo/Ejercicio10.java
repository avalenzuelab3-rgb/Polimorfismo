package polimorfismo;

public class Ejercicio10 {

   
    static class Trabajador {
        public double calcularPago() {
            return 0;
        }
    }

    static class TrabajadorPorHora extends Trabajador {

        int horas;
        double pagoPorHora;

        public TrabajadorPorHora(int horas, double pagoPorHora) {
            this.horas = horas;
            this.pagoPorHora = pagoPorHora;
        }

        @Override
        public double calcularPago() {
            return horas * pagoPorHora;
        }
    }

    public static void main(String[] args) {

        // Polimorfismo
        Trabajador trabajador = new TrabajadorPorHora(8, 25);

        // Mostrar resultado
        System.out.println("Pago total: Q" + trabajador.calcularPago());
    }
}