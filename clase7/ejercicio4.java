package clase7;
import java.util.ArrayList;

public class ejercicio4 {

    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Fido"));
        animales.add(new Gato("Toga"));
        animales.add(new Vaca("Milka"));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
        }
    }
}
