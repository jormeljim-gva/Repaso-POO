package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nombre;
    private List<Departamento> departamentos;
    List<Intervencion> intervenciones = new ArrayList<>();

    public Medico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
        departamento.getMedicos().add(this);
    }

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        this.intervenciones = intervenciones;
    }

    public void addIntervencion(Intervencion intervencion) {
        this.intervenciones.add(intervencion);
    }
}
