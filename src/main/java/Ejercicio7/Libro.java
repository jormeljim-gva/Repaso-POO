package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private int isbn;
    private List<Autor> autores =  new ArrayList<Autor>();
    private Tema tema;
    private Editorial editorial;

    public Libro(int isbn, Tema tema, Editorial editorial) {
        this.isbn = isbn;
        this.tema = tema;
        this.tema.getLibros().add(this);
        this.editorial = editorial;
        this.editorial.getLibros().add(this);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void addAutor(Autor autor){
        this.autores.add(autor);
        autor.getLibros().add(this);
    }
}
