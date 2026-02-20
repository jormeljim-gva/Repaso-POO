package Animales;

public class Gato extends Mamifero implements Jugar {
    public Gato(String nombre) {
        super(nombre);
    }

    public void perseguirUnOvillo(){
        System.out.println("Perseguir un ovillo");
    }

    @Override
    public void comunicarse() {
        System.out.println("Miau");
    }

    @Override
    public void saltarPorUnAro() {
        System.out.println("Sé saltar por un aro");
    }

    @Override
    public void perseguirUnObjeto(String objeto) {
        System.out.println("Sé perseguir " + objeto);
    }
}
