package commandpattern;

public class Accion {
    private String nombre;
    private int cantidad;
    
    public Accion(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public void comprar(){
        System.out.println("Accion [ Nombre: " + nombre + 
            ", Cantidad: " + cantidad + " ] comprada");
    }
    
    public void vender(){
        System.out.println("Accion [ Nombre: " + nombre + 
            ", Cantidad: " + cantidad + " ] vendida");
    }
}
