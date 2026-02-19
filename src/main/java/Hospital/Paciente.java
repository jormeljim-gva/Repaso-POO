package Hospital;

import java.util.List;

public class Paciente {
    private String nom_paciente;
    private Habitacion habitacion;
    private List<Intervencion> intervenciones;

    public Paciente(String nom_paciente, Habitacion habitacion) {
        this.nom_paciente = nom_paciente;
        this.habitacion = habitacion;
        this.habitacion.getPacientes().add(this);
    }

    public String getNom_paciente() {
        return nom_paciente;
    }

    public void setNom_paciente(String nom_paciente) {
        this.nom_paciente = nom_paciente;
    }

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        this.intervenciones = intervenciones;
    }

    public void addIntervencion(Intervencion intervencion) {
        this.intervenciones.add(intervencion);
    }
}