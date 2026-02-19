import java.util.Scanner;

public class MainEjercicio3 {
    public static void main(String[] args) {
        Cuenta cuentaPepe = new Cuenta("Pepe", 123.8);
        cuentaPepe.ingresar(2);
        System.out.println(cuentaPepe.toString());
        cuentaPepe.ingresar(-3);
        System.out.println(cuentaPepe.toString());

        cuentaPepe.retirar(100.8);
        System.out.println(cuentaPepe.toString());
        cuentaPepe.retirar(50);
        System.out.println(cuentaPepe.toString());
    }
}
class Cuenta{
    String titular;
    double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
        if (cantidad >= 0)
            this.cantidad += cantidad;
    }

    public void retirar(double cantidad) {
        if (this.cantidad >= cantidad)
            this.cantidad -= cantidad;
        else
            this.cantidad = 0;
    }

    @Override
    public String toString() {
        return "titular = " + titular + ", cantidad = " + cantidad;
    }
}
