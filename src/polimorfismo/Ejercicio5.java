package polimorfismo;

public class Ejercicio5 {

 
    static class Transporte {
        public void moverse() {
            System.out.println("El transporte se mueve.");
        }
    }

    static class Avion extends Transporte {

        @Override
        public void moverse() {
            System.out.println("El avion vuela por el cielo.");
        }
    }

    public static void main(String[] args) {

        Transporte transporte = new Avion();

        transporte.moverse();
    }
}
