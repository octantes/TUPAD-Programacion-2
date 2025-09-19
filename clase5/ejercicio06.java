package clase5;

public class ejercicio06 {

    public static void main(String[] args) {
        
        Cliente2 c = new Cliente2("Maria Rodriguez", "289315398301");
        Mesa m = new Mesa(12, 4);
        Reserva r = new Reserva("2025-09-20", "21:00", m);
        r.setCliente(c);

        System.out.println("Reserva para el " + r.getFecha() + " a las " + r.getHora());
        System.out.println("Cliente: " + r.getCliente2().getNombre() + " Tel: " + r.getCliente2().getTelefono());
        System.out.println("Mesa: " + r.getMesa().getNumero() + " Capacidad: " + r.getMesa().getCapacidad());
        
    }
    
}