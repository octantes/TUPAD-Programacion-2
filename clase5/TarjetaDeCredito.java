package clase5;

public class TarjetaDeCredito {
    
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // asociacion bidireccional Cliente
    private Banco banco; // agregacion

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this);
        
    }

    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    
}