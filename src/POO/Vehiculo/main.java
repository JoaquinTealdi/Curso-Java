package POO.Vehiculo;

public class main {
    public static void main(String[] args) {

        Vehiculo auto1 = new Vehiculo();
        Vehiculo autoPersonalizado = new Vehiculo("rojo", 4, "volskwagen");

        //System.out.println(auto1.toString());
        //System.out.println(autoPersonalizado.toString());
        Vehiculo motito1 = new Moto("Rojo", 2, "Zanella", 110);
        Moto motito2 = new Moto();


        //System.out.println(zanellita.toString());

        //creamos una coleccion donde almacenamos los objetos creados
        Vehiculo estacionamiento [] = {
                auto1,
                autoPersonalizado,
                motito1,
                motito2
        };

        for (Vehiculo vehiculo : estacionamiento) {
            System.out.println(vehiculo.mostrarDatos());
        }

    }
}
