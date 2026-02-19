package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int cod_h;
    private List<Paciente> pacientes =  new ArrayList<>();

    public Habitacion(int cod_h) {
        this.cod_h = cod_h;
    }

    public int getCod_h() {
        return cod_h;
    }

    public void setCod_h(int cod_h) {
        this.cod_h = cod_h;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void addPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }
}
