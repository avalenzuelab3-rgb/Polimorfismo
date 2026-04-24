package polimorfismo;



public class Ejercicio2 {


    static class Figura {
        public double area() {
            return 0;
        }
    }

   
    static class Rectangulo extends Figura {

        double base;
        double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double area() {
            return base * altura;
        }
    }

    public static void main(String[] args) {

        Figura figura = new Rectangulo(5, 3);

        System.out.println("El area del rectangulo es: " + figura.area());
    }
}