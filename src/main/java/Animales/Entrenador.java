package Animales;

public class Entrenador extends Mamifero{
    public Entrenador(String nombre) {
        super(nombre);
    }

    public void entrenar(Jugar animalQueSabejugar){
        animalQueSabejugar.saltarPorUnAro();
    }

    public void dejarEntrar(Animal animal){
        if(animal instanceof Jugar){
            System.out.println("Pasa y te entreno");
        }else {
            throw new IllegalArgumentException(animal.getClass().getName() + "no implementa la interfaz Jugar");
        }
    }
}