package polimorfismo;

public class Ejercicio6 {

    /*
     * EXPLICACION:
     *
     * 1. Herencia:
     *    Se creo la clase base Persona.
     *    Luego Estudiante hereda de Persona usando extends.
     *
     * 2. Metodo sobrescrito:
     *    Se sobrescribio el metodo presentarse() usando @Override.
     *    En Persona muestra un mensaje general.
     *    En Estudiante agrega carnet y carrera.
     *
     * 3. Caso de prueba:
     *    Carnet: 2026-001
     *    Carrera: Ingenieria en Sistemas
     *
     *    En main se usa una referencia de tipo Persona
     *    apuntando a un objeto de tipo Estudiante.
     */

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