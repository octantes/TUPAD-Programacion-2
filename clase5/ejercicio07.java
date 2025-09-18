package clase5;

public class ejercicio07 {

    public static void main(String[] args) {
        
        Conductor c = new Conductor("Ramon Gimenez", "LIC11111");
        Motor m = new Motor("Nafta", "MOT12345");
        Vehiculo v = new Vehiculo("ABC123", "Toyota Corolla", m, c);

        System.out.println("Vehiculo: " + v.getModelo() + " Patente: " + v.getPatente());
        System.out.println("Motor: " + v.getMotor().getTipo() + " Serie: " + v.getMotor().getNumeroSerie());
        System.out.println("Conductor: " + v.getConductor().getNombre() + " Licencia: " + v.getConductor().getLicencia());
        
    }
    
}