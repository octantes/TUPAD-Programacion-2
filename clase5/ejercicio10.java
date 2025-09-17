package clase5;

public class ejercicio10 {

    public static void main(String[] args) {
        
        Titular2 t = new Titular2("Juan Lopez", "12345678");
        ClaveSeguridad cs = new ClaveSeguridad("ABC123", "2025-09-10");
        CuentaBancaria cb = new CuentaBancaria("1234123412341234", 150000, cs, t);

        System.out.println("Cuenta: " + cb.getCbu() + " Saldo: $" + cb.getSaldo());
        System.out.println("Titular: " + cb.getTitular2().getNombre() + " DNI " + cb.getTitular2().getDni());
        System.out.println("Clave de seguridad: " + cb.getClave().getCodigo() + " Ultima modificacion: " + cb.getClave().getUltimaModificacion());
        
    }
    
}