package clase5;

public class Celular {
    
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // agregacion con Bateria
    private Usuario usuario; // asociacion bidireccional con Usuario
    
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.setUsuario(usuario);
        
    }
    
    public void setUsuario (Usuario usuario) {
        
        this.usuario = usuario;
        
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
        
    }
    
    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }
    
}