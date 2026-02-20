package Animales;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Snoopy");
        Gato gato = new Gato("Garfield");
        Tiburon tiburon = new Tiburon("Jaws");
        PezPayaso pezPayaso = new PezPayaso("Nemo");
        Entrenador entrenador = new Entrenador("Sr Miyagi");

        entrenador.entrenar(gato);
        entrenador.dejarEntrar(tiburon);
        entrenador.dejarEntrar(perro);

        perro.comunicarse();
        perro.traerZapatillas();
        perro.mamar();
        perro.respirtar();
        perro.moverse();

        gato.comunicarse();
        gato.perseguirUnOvillo();
        gato.mamar();
        gato.respirtar();
        gato.moverse();

        tiburon.comunicarse();
        tiburon.respirtar();
        tiburon.moverse();
        tiburon.comunicarse();

        pezPayaso.comunicarse();
        pezPayaso.respirtar();
        pezPayaso.moverse();
    }
}
