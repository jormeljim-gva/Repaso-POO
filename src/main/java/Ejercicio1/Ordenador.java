package Ejercicio1;

public class Ordenador {
    private String marca;
    private String cpu;
    private String gpu;
    private String ssd;

    public Ordenador(String marca, String cpu, String gpu, String ssd) {
        this.marca = marca;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ssd = ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Marca = " + marca + ", CPU = " + cpu + ", GPU = " + gpu + ", SSD = " + ssd;
    }
}
class MainOrdenador{
    public static void main(String[] args) {
        Ordenador ord = new Ordenador("MSI", "intelCore Ultra 9", "NVIDIA RTX 4060", "1TB");
        System.out.println(ord.toString());
    }
}