package clase7;

public class Transferencia implements Pagable {
    
    private String cuentaOrigen;

    public Transferencia(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Transferencia de $" + monto + " desde la cuenta: " + cuentaOrigen);
    }
    
}