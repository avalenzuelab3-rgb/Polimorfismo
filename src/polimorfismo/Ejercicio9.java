package polimorfismo;

public class Ejercicio9 {

    
    static class Instrumento {
        public void tocar() {
            System.out.println("El instrumento esta sonando.");
        }
    }

    static class Guitarra extends Instrumento {

        @Override
        public void tocar() {
            System.out.println("La guitarra esta tocando acordes.");
        }
    }

    public static void main(String[] args) {

        Instrumento instrumento = new Guitarra();

        instrumento.tocar();
    }
}