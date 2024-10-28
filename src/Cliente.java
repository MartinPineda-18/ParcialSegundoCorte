import java.util.*;

public class Cliente {

    private String nombre;
    private String correo;
    private List<Producto> productoList = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre, String correo, List<Producto> productoList) {
        this.nombre = nombre;
        this.correo = correo;
        this.productoList = productoList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public void comprarProducto(Producto producto, int cantidad){


    }
    public void mostrarCompra(){


    }
}
