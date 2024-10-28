import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Laptop laptop = new Laptop("Vivobook","Asus",2,20,"AMD Ryzen 7","8gb");

        laptop.mostrarDetalles();
        laptop.calcularPrecioVenta(0);
        laptop.mostrarDetalles();

        Celular celular = new Celular("a55", "Samsung",1500000,30,"3785 mAh","50 MP");

        celular.mostrarDetalles();
        celular.calcularPrecioVenta(0);
        celular.mostrarDetalles();

    }
}