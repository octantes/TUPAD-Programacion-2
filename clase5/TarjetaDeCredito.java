package clase5;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // asociacion bidireccional Cliente
    private Banco banco; // agregacion

    public TarjetaDeCredito (String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.setCliente(cliente);
        
    }
    
    public void setCliente(Cliente cliente) {
        
        this.cliente = cliente;
        
        if (cliente != null && cliente.getTarjeta() != this) {
            
            cliente.setTarjeta(this);
            
        }
        
    }

    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    
}