package clase5;

public class Cancion {
    
    private String titulo;
    private Artista artista; // asociacion unidireccional

    public Cancion(String titulo) {
        
        this.titulo = titulo;
        
    }
    
    public void setArtista(Artista artista) {
        
        this.artista = artista;
        
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }
    
}