package clase8;

public class PayPal implements Pago {
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("procesando pago de $" + monto + " con PayPal");
    }
    
}