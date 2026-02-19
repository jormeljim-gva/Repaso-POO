package Ejercicio2;

public class MainAA {
    public static void main(String[] args) {
        AA aire = new AA("Samsung", 30, 15, 28);
        System.out.println(aire.toString());
        aire.subirTemperatura();
        System.out.println(aire.toString());
    }
}

class AA{
    String nombre;
    int maximo;
    int minimo;
    int temperatura;

    public AA(String nombre, int maximo, int minimo, int temperatura) {
        this.nombre = nombre;
        this.maximo = maximo;
        this.minimo = minimo;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaximo() {
        return maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if(temperatura >= maximo && temperatura <= minimo)
            this.temperatura = temperatura;
    }

    public void subirTemperatura(){
        if (!(temperatura + 1 > maximo))
            this.temperatura++;
    }

    public void bajarTemperatura(){
        if (!(temperatura - 1 < minimo))
            this.temperatura--;
    }

    @Override
    public String toString() {
        return "" + this.temperatura;
    }
}