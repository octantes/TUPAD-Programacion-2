package clase5;

public class ejercicio05 {

    public static void main(String[] args) {
        
        Propietario p = new Propietario("Roberto Pattinson", "12345678");
        PlacaMadre pm = new PlacaMadre("Asus B450M", "AMD B450");
        Computadora c = new Computadora("Samsung", "SAM123456", pm, p);

        System.out.println("Computadora: " + c.getMarca() + " Nro Serie:  " + c.getNumeroSerie());
        System.out.println("Placa madre: " + c.getPlacaMadre().getModelo() + " Chipset: " + c.getPlacaMadre().getChipset());
        System.out.println("Propietario: " + c.getPropietario().getNombre() + " DNI: " + c.getPropietario().getDni());
        
    }
    
}