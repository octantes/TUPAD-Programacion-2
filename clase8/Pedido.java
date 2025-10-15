package clase8;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    
    private List<Producto> productos = new ArrayList<>();
    private Notificable cliente;
    private String estado;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.estado = "pendiente";
    }

    public void agregarProducto(Producto producto) { this.productos.add(producto); }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        this.cliente.notificar("el estado de su pedido ha cambiado a: " + this.estado);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) { total += p.getPrecio(); }
        return total;
    }
    
}