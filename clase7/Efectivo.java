package clase7;

public class Efectivo implements Pagable {
    
    @Override
    public void pagar(double monto) {
        System.out.println("Pago en efectivo de $" + monto);
    }
    
}