package clase7;

public class TarjetaCredito implements Pagable {
    
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " con tarjeta de credito de " + titular);
    }
    
}