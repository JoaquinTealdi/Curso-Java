package POO.Vehiculo;

public class Vehiculo {
    protected String color;
    protected int cantRuedas;
    protected String marca;

    //constructor por defecto
    public Vehiculo() {
        this.color = "sin color";
        this.cantRuedas = 4;
        this.marca = "ford";
    }


    //constructor personalizado
    public Vehiculo(String color, int ruedas, String marca){
        this.color = color;
        this.cantRuedas = ruedas;
        this.marca = marca;
    }

    public String mostrarDatos() {
        return "Color => " + color + "\nCantidad de ruedas => " + cantRuedas + "\nMarca => "+ marca;
    }
}
