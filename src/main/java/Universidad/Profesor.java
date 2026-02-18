package Universidad;

public class Profesor {
    private String nombreProfesor;
    private Departamento departamento;

    public Profesor(String nombre, Departamento departamento) {
        this.nombreProfesor = nombre;
        this.departamento = departamento;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombreProfesor='" + nombreProfesor + '\'' +
                '}';
    }
}
