package clase5;

public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // composicion

    public Documento(String titulo, String contenido, String hash, String fecha, Usuario2 usuario2) {
        
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(hash, fecha, usuario2);
        
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
    
}