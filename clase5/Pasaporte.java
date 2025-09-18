package clase5;

public class Pasaporte {
    
    private String numero;
    private String fechaEmision;
    private Foto foto; // composicion con Foto
    private Titular titular; // asociacion bidireccional con Titular
    
    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.setTitular(titular);
        
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    public String getNumero() { return numero; }
    public String getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
    
}