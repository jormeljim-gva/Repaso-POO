package Animales;

public abstract class Pez extends Animal{
    public Pez(String nombre){
        super(nombre);
    }

    @Override
    public void respirtar() {
        System.out.println("Respiro bajo el agua por las branquias");
    }

    @Override
    public void moverse() {
        System.out.println("Me muevo nadando");
    }
}
