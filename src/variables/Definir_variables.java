package variables;

public class Definir_variables {
    public static void main(String[] args) {
    /* al definir Variables.variables podemos utilizar la palabra reservada "var" y el editor reconoce solo
        tipo de dato es, o podemos asignar el tipo de dato, por ej: "String" "Double" "Int"*/

        var miPrimerVariable = 5;
        System.out.println(miPrimerVariable);

        //modificamos el valor de la variable
        miPrimerVariable = 8;
        System.out.println(miPrimerVariable);

        //creamos una cadena
        String miCadena = "obvio bobis";
        System.out.println(miCadena);

        //modificamos la cadena
        miCadena = "aguante bokita";
        System.out.println(miCadena);

    }
}
