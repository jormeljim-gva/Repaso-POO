package Animales;

public abstract class Mamifero  extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }

    public void mamar(){
        System.out.println("Cuando soy pequeño mamo");
    }

    @Override
    public void respirtar() {
        System.out.println("Respiro aire por los pulmones");
    }

    @Override
    public void moverse() {
        System.out.println("Camino a 4 patas");
    }
}
