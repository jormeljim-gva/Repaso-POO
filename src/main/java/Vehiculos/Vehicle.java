package Vehiculos;

public abstract class Vehicle {
    private String nombre;

    public Vehicle(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void moverse();
}