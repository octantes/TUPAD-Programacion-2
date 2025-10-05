package clase7;

public class ejercicio2 {

    public static void main(String[] args) {
        
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo("Círculo 1", 5);
        figuras[1] = new Rectangulo("Rectángulo 1", 2, 8);
        figuras[2] = new Circulo("Círculo 2", 10);

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " tiene área: " + f.calcularArea());
        }
        
    }
    
}
