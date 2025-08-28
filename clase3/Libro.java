package clase3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // constructor
    
    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }
    
    // getters
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAnioPublicacion() { 
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año invalido: " + anioPublicacion);
        }
    }
    
    public void mostrarInfo() { 
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicacion: " + anioPublicacion);
    }
    
}