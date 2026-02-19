package Universidad;

import java.util.ArrayList;
import java.util.List;

public class AreaConocimiento {
    private String nombre;
    private List<DepartamentoUni> departamentos = new ArrayList<>();

    public AreaConocimiento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<DepartamentoUni> getDepartamentos() {
        return departamentos;
    }

    @Override
    public String toString() {
        return "AreaConocimiento{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

}
