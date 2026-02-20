package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private String nombre;
    private CasaSubastas casaSubastas;
    private List<Lote> lotes = new ArrayList<>();

    public Subasta(String nombre, CasaSubastas casaSubastas) {
        this.nombre = nombre;
        this.casaSubastas = casaSubastas;
        this.casaSubastas.getSubastas().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    @Override
    public String toString() {
        return "Subasta{" + "nombre=" + nombre + ", lotes=" + lotes + '}';
    }
}
