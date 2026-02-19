package Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital general = new Hospital("General");
        Departamento traumatologia = new Departamento("Traumatología", general);
        Medico pepe = new Medico("Pepe");
        Habitacion h1 = new Habitacion(212);
        Paciente juan = new Paciente("Juan", h1);
        Paciente maria = new Paciente("María", h1);
        Intervencion int1 = new Intervencion("Operación", "Hoy", pepe, juan);
        Medicamento med1 = new Medicamento("Aspirina");
        Prescribe prescribe = new Prescribe(med1, int1, "6g cada 8h");
    }
}