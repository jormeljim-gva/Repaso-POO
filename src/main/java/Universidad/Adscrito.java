package Universidad;

public class Adscrito {
    private Profesor profesor;
    private Catedra catedra;
    String fecha;

    public Adscrito(Profesor profesor, Catedra catedra, String fecha) {
        this.profesor = profesor;
        this.catedra = catedra;
        this.fecha = fecha;
    }

    public Adscrito(String fecha) {
        this.fecha = fecha;
    }
}
