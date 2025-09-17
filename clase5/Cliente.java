package clase5;

public class Cliente {
    
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // asociacion bidireccional Tarjeta

    public Cliente(String nombre, String dni) {
        
        this.nombre = nombre;
        this.dni = dni;
        
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        
        this.tarjeta = tarjeta;
        
    }

    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    
}