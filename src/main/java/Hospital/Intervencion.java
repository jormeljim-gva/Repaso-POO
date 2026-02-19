package Hospital;

public class Intervencion {
    private String cod_intervencion;
    private String fecha;
    private Medico medico;
    private Paciente paciente;

    public Intervencion(String cod_intervencion, String fecha, Medico medico, Paciente paciente) {
        this.cod_intervencion = cod_intervencion;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getCod_intervencion() {
        return cod_intervencion;
    }

    public void setCod_intervencion(String cod_intervencion) {
        this.cod_intervencion = cod_intervencion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}