package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Facultat {
    private String nombre;
    private List<Catedra> catedras = new ArrayList<>();

    public Facultat(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    @Override
    public String toString() {
        return "Facultat{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
