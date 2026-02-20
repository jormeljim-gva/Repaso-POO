package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numero;
    private String descripcion;
    private Subasta subasta;
    private List<Articulo> articulos = new ArrayList<>();
    private List<Puja> pujas = new ArrayList<>();

    public Lote(int numero, String descripcion, Subasta subasta) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.subasta = subasta;
        this.subasta.getLotes().add(this);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "numeroLote=" + numero +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
