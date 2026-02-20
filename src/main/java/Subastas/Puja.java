package Subastas;

public class Puja {
    private double cantidad;
    private Lote lote;
    private Pujador pujador;

    public Puja(double cantidad, Lote lote, Pujador pujador) {
        this.cantidad = cantidad;
        this.lote = lote;
        this.lote.getPujas().add(this);
        this.pujador = pujador;
        this.pujador.addPuja(this);
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }
}
