package clase7;

public class Vehiculo2 {
    
    protected String marca;
    protected String modelo;

    public Vehiculo2(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
}