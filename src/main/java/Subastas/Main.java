package Subastas;

public class Main {
    private static void cerrar(Subasta subasta){
        System.out.println("*********************");
        System.out.println("Se cierra la subasta:");
        System.out.println("*********************");

        double maximo = Integer.MIN_VALUE;
        Puja pujaActual = null;
        for(Lote lote : subasta.getLotes()){
            System.out.println(lote.getDescripcion());
            for(Puja puja : lote.getPujas()){
                if(puja.getCantidad() > maximo){
                    maximo = puja.getCantidad();
                    pujaActual = puja;
                }
            }
            if(pujaActual != null){
                System.out.printf("Adjudicado a %s por %f%n", pujaActual.getPujador().getNombre(), pujaActual.getCantidad());
            }else {
                System.out.println("La puja ha quedado desierta");
            }
            maximo = Integer.MIN_VALUE;
            pujaActual = null;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        CasaSubastas casa = new CasaSubastas("Subastinhas");
        Subasta subasta = new Subasta("Cosas", casa);
        Lote lote1 = new Lote(1, "Coches antiguos", subasta);
        Lote lote2 = new Lote(2, "Cuadros", subasta);
        Articulo coche1 = new Articulo("Coche 1", 120, lote1);
        Articulo coche2 = new Articulo("Coche 2", 130, lote1);
        Articulo coche3 = new Articulo("Coche 3", 140, lote1);
        Pujador pepe = new Pujador("Pepe");
        Puja p1 = new Puja(200, lote1, pepe);
        Pujador maria = new Pujador("Maria");
        Puja m1 = new Puja(300, lote1, maria);

        for(Lote l : subasta.getLotes()){
            System.out.println(l);
            System.out.print("Precio de saldida");
            System.out.println(l.getArticulos().stream()
                    .mapToDouble(Articulo::getPrecio).sum());

            for(Articulo a : l.getArticulos()){
                System.out.println("\t" + a);
            }
            System.out.println("");
        }
        cerrar(subasta);
    }
}
