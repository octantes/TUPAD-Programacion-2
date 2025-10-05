package clase7;

public class ejercicio5 {

    public static <T extends Pagable> void procesarPago(T medio, double monto) {
        medio.pagar(monto);
    }

    public static void main(String[] args) {
        
        Pagable pago1 = new TarjetaCredito("Facundo Lopez");
        Pagable pago2 = new Transferencia("Cuenta 25");
        Pagable pago3 = new Efectivo();
        
        procesarPago(pago1, 1000);
        procesarPago(pago2, 300.5);
        procesarPago(pago3, 850.35);
        
    }
    
}