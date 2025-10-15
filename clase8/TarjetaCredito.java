package clase8;

public class TarjetaCredito implements PagoConDescuento {
    
    private final double PORCENTAJE_DESCUENTO = 0.10;

    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * PORCENTAJE_DESCUENTO);
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("procesando pago de $" + montoFinal + " con Tarjeta aplicando descuento");
    }

}