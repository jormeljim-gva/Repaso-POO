package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Autor pepe = new Autor(1, "Pepe");
        Tema fantasia = new Tema(3, "Fantasía");
        Editorial ed = new Editorial(5);
        Libro l1 = new Libro(123, fantasia, ed);
        l1.addAutor(pepe);
    }
}
