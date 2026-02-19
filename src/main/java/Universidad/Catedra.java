package Universidad;

public class Catedra {
    private String nombre;
    private DepartamentoUni departamento;
    private Facultat facultat;

    public Catedra(String nombre, DepartamentoUni departamento, Facultat facultat) {
        this.nombre = nombre;
        this.departamento = departamento;
        departamento.getCatedras().add(this);
        this.facultat = facultat;
        this.facultat.getCatedras().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Catedra{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
