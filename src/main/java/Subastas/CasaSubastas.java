package Subastas;

import java.util.ArrayList;
import java.util.List;

public class CasaSubastas {
    private String nombre;
    private List<Subasta> subastas = new ArrayList<>();

    public CasaSubastas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Subasta> getSubastas() {
        return subastas;
    }

    public void setSubastas(List<Subasta> subastas) {
        this.subastas = subastas;
    }
}
