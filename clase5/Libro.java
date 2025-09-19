package clase5;

public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor; // asociacion unidireccional con Autor
    private Editorial editorial; // agregación

    public Libro (String titulo, String isbn, Editorial editorial) {
        
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        
    }
    
    public void setAutor(Autor autor) {
        
        this.autor = autor;
        
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
    
}