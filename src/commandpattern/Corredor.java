package commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Corredor {
    private List<Orden> listaOrdenes;
    
    public Corredor() {
        listaOrdenes = new ArrayList();
    }
    
    public void tomarOrden(Orden orden) {
        listaOrdenes.add(orden);
    }
    
    public void hacerPedidos() {
        for(Orden orden:listaOrdenes)
            orden.ejecutar();
        
        listaOrdenes.clear();
    }
}