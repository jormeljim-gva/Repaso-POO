package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private int cod_t;
    private String nombreTema;
    private List<Libro> libros = new ArrayList<>();

    public Tema(int cod_t, String nombreTema) {
        this.cod_t = cod_t;
        this.nombreTema = nombreTema;
    }

    public int getCod_t() {
        return cod_t;
    }

    public void setCod_t(int cod_t) {
        this.cod_t = cod_t;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public List<Libro> getLibros() {
        return libros;
    }
}
