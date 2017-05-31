package commandpattern;

public class VenderAccion implements Orden{
    private Accion accion;
    
    public VenderAccion(Accion accion){
        this.accion = accion;
    }
    
    @Override
    public void ejecutar(){
        accion.vender();
    }
}