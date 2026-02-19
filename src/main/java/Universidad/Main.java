package Universidad;

public class Main {
    public static void main(String[] args) {
        AreaConocimiento informatica = new AreaConocimiento("Informática");
        System.out.println(informatica);
        Facultat ciencias = new Facultat("Ciencias");
        DepartamentoUni programacion = new DepartamentoUni("Programación", informatica);
        Catedra poo = new Catedra("POO", programacion, ciencias);
        Profesor pepe = new Profesor("Pepe", programacion);
        Adscrito adscrito = new Adscrito(pepe, poo, "hoy");
    }
}
