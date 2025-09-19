package clase5;

public class ejercicio04 {

    public static void main(String[] args) {

        Cliente c = new Cliente("Alberto Rordiguez", "12345678");
        Banco b = new Banco("Banco Nacion", "30-12345678-9");
        TarjetaDeCredito t = new TarjetaDeCredito("1234123412341234", "9/28", c, b);

        System.out.println("Tarjeta: " + t.getNumero() + " Vencimiento: " + t.getFechaVencimiento());
        System.out.println("Cliente: " + t.getCliente().getNombre() + " - dni " + t.getCliente().getDni());
        System.out.println("Banco: " + t.getBanco().getNombre() + " - cuit " + t.getBanco().getCuit());
        
    }
    
}