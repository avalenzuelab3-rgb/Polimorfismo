package polimorfismo;


class Animal {

 public void hacerSonido() {
     System.out.println("El animal hace un sonido");
 }
}


class Perro extends Animal {

 @Override
 public void hacerSonido() {
     System.out.println("El perro ladra: Guau Guau");
 }
}


public class Ejercicio1 {

 public static void main(String[] args) {

    
     Animal miAnimal = new Perro();

    
     miAnimal.hacerSonido();
 }
}