package polimorfismo;

public class Ejercicio6 {

   
    static class Persona {
        public void presentarse() {
            System.out.println("Hola, soy una persona.");
        }
    }

    static class Estudiante extends Persona {

        String carnet;
        String carrera;

        public Estudiante(String carnet, String carrera) {
            this.carnet = carnet;
            this.carrera = carrera;
        }

        @Override
        public void presentarse() {
            System.out.println("Soy estudiante.");
            System.out.println("Carnet: " + carnet);
            System.out.println("Carrera: " + carrera);
        }
    }

    public static void main(String[] args) {

        Persona persona = new Estudiante("2026-001", "Ingenieria en Sistemas");

        persona.presentarse();
    }
}