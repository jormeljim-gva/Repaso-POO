package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private int cod_ed;
    private List<Libro> libros = new ArrayList<Libro>();

    public Editorial(int cod_ed) {
        this.cod_ed = cod_ed;
    }

    public int getCod_ed() {
        return cod_ed;
    }

    public void setCod_ed(int cod_ed) {
        this.cod_ed = cod_ed;
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    public void addLibro(Libro libro){
        this.libros.add(libro);
    }
}
