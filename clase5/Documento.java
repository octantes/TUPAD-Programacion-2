package clase5;

public class Documento {
    
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // composicion

    public Documento(String titulo, String contenido, Usuario2 usuario2) {
        
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital("HASH12345", "2025-09-17", usuario2);
        
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
    
}