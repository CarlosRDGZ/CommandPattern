package commandpattern;

public class ComprarAccion implements Orden{
    private Accion accion;
    
    public ComprarAccion(Accion accion){
        this.accion = accion;
    }

    @Override
    public void ejecutar() {
        accion.comprar();
    }
    
}