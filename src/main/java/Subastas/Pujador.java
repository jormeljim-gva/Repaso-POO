package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String nombre;
    private List<Puja> pujas = new ArrayList<>();

    public Pujador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
    }

    public void addPuja(Puja puja) {
        this.pujas.add(puja);
    }
}
