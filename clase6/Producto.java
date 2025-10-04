package clase6;

public class Producto {
    
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public Producto(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
        this.categoria = CategoriaProducto.ALIMENTOS;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }

    /* USAMOS TOSTRING EN VEZ DEL METODO
    public void mostrarInfo() {
        System.out.println("ID: " + id + " -"
                         + " Nombre: " + nombre + " -"
                         + " Precio: " + precio + " -"
                         + " Stock: " + cantidad + " -"
                         + " Categoria: " + categoria + " -"
                         + " Descripcion: " + categoria.getDescripcion()
        );
    } */

    @Override
    public String toString() {
        return "ID: " + id + " -"
             + " Nombre: " + nombre + " -"
             + " Precio: " + precio + " -"
             + " Stock: " + cantidad + " -"
             + " Categoria: " + categoria + " -"
             + " Descripcion: " + categoria.getDescripcion();
    }
}
