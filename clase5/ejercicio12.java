package clase5;

public class ejercicio12 {

    public static void main(String[] args) {
        
        Contribuyente c = new Contribuyente("Jeremias Springfield", "30-12345678-9");
        Impuesto i = new Impuesto(1200.50, c);
        Calculadora calc = new Calculadora();

        calc.calcular(i);
        
    }
    
}