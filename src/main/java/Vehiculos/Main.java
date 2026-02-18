package Vehiculos;

public class Main {
    public static void main(String[] args) {
        LandVehicle coche = new LandVehicle("coche");
        coche.moverse();
        WaterVehicle barco = new WaterVehicle("barco");
        barco.moverse();
    }
}
