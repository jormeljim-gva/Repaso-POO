package Vehiculos;

public class LandVehicle extends Vehicle {
    public LandVehicle(String nombre) {
        super(nombre);
    }

    @Override
    public void moverse() {
        System.out.println("Me muevo por tierra");
    }


}
