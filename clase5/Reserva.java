package clase5;

public class Reserva {
    
    private String fecha;
    private String hora;
    private Cliente2 cliente2; // asociacion unidireccional
    private Mesa mesa;       // agregacion

    public Reserva(String fecha, String hora, Cliente2 cliente2, Mesa mesa) {
        
        this.fecha = fecha;
        this.hora = hora;
        this.cliente2 = cliente2;
        this.mesa = mesa;
        
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Cliente2 getCliente2() { return cliente2; }
    public Mesa getMesa() { return mesa; }
    
}