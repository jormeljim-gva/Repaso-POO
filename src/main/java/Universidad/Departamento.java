package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private AreaConocimiento areaConocimiento;
    private List<Catedra> catedras = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();

    public Departamento(String nombre, AreaConocimiento areaConocimiento) {
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Catedra> getCatedras(){
        return catedras;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
