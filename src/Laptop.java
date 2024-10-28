import java.util.Scanner;

public class Laptop extends Producto implements Vendible{

    Scanner teclado = new Scanner(System.in);

    private String procesador;
    private String memoriaRam;

    public Laptop() {
    }

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, String memoriaRam) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Detalles laptop:\n"+"Nombre: "+getNombre()+"\n"+"Marca: "+getMarca()+"\n"+"Precio: "+getPrecio()+"\n"
                +"Cantidad disponible: "+getCantidadStock()+"\n"+"Procesador: "+getProcesador()+"\n"+"Memoria RAM: "+getMemoriaRam()+"\n");

    }

    @Override
    public void calcularPrecioVenta(int cantidad) {

        System.out.println("Ingrese la cantidad que desea comprar: ");
        cantidad = teclado.nextInt();

        if (cantidad > cantidadStock) {

            System.out.println("Cantidad NO disponible");

        } else if (cantidad > 5){
                System.out.println("Total a pagar con descuento del 10%: " + (precio * cantidad) * 0.10);
                cantidadStock = cantidadStock - cantidad;
            } else {
                System.out.println("Total a pagar: " + (precio * cantidad));
                cantidadStock = cantidadStock - cantidad;
            }
        }

    }

