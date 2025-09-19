package clase5;

public class GeneradorQR { // crea CodigoQR dentro del metodo sin guardarlo
    public void generar (String valor, Usuario3 usuario3) {
        
        CodigoQR qr = new CodigoQR(valor);
        qr.setUsuario(usuario3);
        System.out.println("QR generado: " + qr.getValor() + " Para: " + qr.getUsuario3().getNombre());
        
    }
}