package Lambdas;

public class Ej3_Producto {
    private String nombre;
    private double precio;
    private String categoria;


    int valorEspecifico = 100;
    FiltroProducto Fprecio = new FiltroProducto() {
        @Override
        public boolean filtrar(Ej3_Producto producto) {
            if (producto.precio > valorEspecifico){
                return true;
            }else{
                return false;
            }
        }
    };
    
}
