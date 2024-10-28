import java.util.Scanner;

public class Celular extends Producto implements Vendible{

    Scanner teclado = new Scanner(System.in);

    private String capacidadBateria;
    private String camaraResolucion;

    public Celular(String nombre, String marca, double precio, int cantidadStock, String capacidadBateria, String camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(String camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Detalles celular:\n"+"Nombre: "+getNombre()+"\n"+"Marca: "+getMarca()+"\n"+"Precio: "+getPrecio()+"\n"
                +"Cantidad disponible: "+getCantidadStock()+"\n"+"Capacidad bateria: "+getCapacidadBateria()+"\n"+"Resolucion camara: "+getCamaraResolucion()+"\n");

    }

    @Override
    public void calcularPrecioVenta(int cantidad) {

        System.out.println("Ingrese la cantidad que desea comprar: ");
        cantidad = teclado.nextInt();

        if (cantidad > 5){
            System.out.println("Total a pagar con descuento del 10%: " + (precio * cantidad) * 0.10);
            cantidadStock = cantidadStock - cantidad;
        } else {
            System.out.println("Total a pagar: " + (precio * cantidad));
            cantidadStock = cantidadStock - cantidad;
        }

    }
}
