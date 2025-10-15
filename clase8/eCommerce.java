package clase8;

public class eCommerce {

    public static void main(String[] args) {
        
        Cliente clientex = new Cliente("Juan Gordo", "juangordo@gmail.com");

        Pedido pedido = new Pedido(clientex);

        pedido.agregarProducto(new Producto("auriculares", 82999.99));
        pedido.agregarProducto(new Producto("mouse", 49000.00));
        pedido.agregarProducto(new Producto("teclado", 65120.50));

        double totalPedido = pedido.calcularTotal();
        System.out.println("el total del pedido es: $" + totalPedido);
        pedido.setEstado("enviado");

        Pago metodoPayPal = new PayPal();
        PagoConDescuento metodoTarjeta = new TarjetaCredito();

        metodoPayPal.procesarPago(totalPedido);
        metodoTarjeta.procesarPago(totalPedido);
        
    }
    
}