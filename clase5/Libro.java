package clase5;

public class Libro {
    
    private String titulo;
    private String isbn;
    private Autor autor; // asociacion unidireccional con Autor
    private Editorial editorial; // agregación

    public Libro (String titulo, String isbn, Autor autor, Editorial editorial) {
        
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
    
}