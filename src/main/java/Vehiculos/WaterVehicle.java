package Vehiculos;

public class WaterVehicle extends Vehicle{
    public WaterVehicle(String nombre) {
        super(nombre);
    }
    @Override
    public void moverse() {
        System.out.println("Me muevo por agua");
    }

}
