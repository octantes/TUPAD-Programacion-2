package clase5;

public class CodigoQR {
    
    private String valor;
    private Usuario3 usuario3; // asociacion unidireccional

    public CodigoQR(String valor) {
        
        this.valor = valor;
        
    }
    
    public void setUsuario(Usuario3 usuario3) {
        
        this.usuario3 = usuario3;
        
    }

    public String getValor() { return valor; }
    public Usuario3 getUsuario3() { return usuario3; }
    
}