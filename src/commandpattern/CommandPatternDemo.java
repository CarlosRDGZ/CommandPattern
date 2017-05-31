package commandpattern;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Accion accionMicrosoft = new Accion("Microsfot", 15);
        
        ComprarAccion comprar = new ComprarAccion(accionMicrosoft);
        VenderAccion vender = new VenderAccion(accionMicrosoft);
        
        Corredor corredor = new Corredor();
        
        corredor.tomarOrden(comprar);
        corredor.tomarOrden(vender);
        corredor.hacerPedidos();
    }
    
}
