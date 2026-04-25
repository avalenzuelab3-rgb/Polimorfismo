package polimorfismo;

public class Ejercicio7 {

 
    static class Vehiculo {
        public void encender() {
            System.out.println("El vehiculo se ha encendido.");
        }
    }

    static class Motocicleta extends Vehiculo {

        @Override
        public void encender() {
            System.out.println("La motocicleta se enciende con llave y arranque.");
        }
    }

    public static void main(String[] args) {

   
        Vehiculo vehiculo = new Motocicleta();

    
        vehiculo.encender();
    }
}