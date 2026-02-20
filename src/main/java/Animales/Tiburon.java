package Animales;

public class Tiburon extends Pez implements Jugar {
    public Tiburon(String nombre){
        super(nombre);
    }

    public void comunicarse()
    {
        System.out.println("Arqueo el cuerpo para comunicarme");
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
