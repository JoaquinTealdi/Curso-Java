package Variables;

public class concatenacion {
    public static void main(String[] args) {

        var nombre = "Juan";
        var profesion = "Medico";

        var union = nombre + " " + profesion;
        System.out.println("union = " + union);

        var i = 2;
        var j = 7;

        //suma porque encuentra primero numeros
        System.out.println(i + j);

        //concatena porque perimero encuentra un string
        System.out.println(nombre + i + j);

        
    }
}
