package clase5;

public class ejercicio14 {

    public static void main(String[] args) {
        
        Proyecto p = new Proyecto("Tutorial", 15);
        EditorVideo editor = new EditorVideo();

        editor.exportar("MP4", p);
        
    }
    
}