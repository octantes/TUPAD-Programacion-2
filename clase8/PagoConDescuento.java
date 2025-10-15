package clase8;

// interfaz que agrega descuentos a Pago

interface PagoConDescuento extends Pago {
    
    double aplicarDescuento(double monto);
    
}