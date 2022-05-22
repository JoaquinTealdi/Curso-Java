package POO.Vehiculo;

//con esto estamos realizando herencia
public class Moto extends Vehiculo {
    private int cilindrada;
    //constructor por defecto heredando el constructor de la mother class
    public Moto(){
        super("Morado", 2, "Zanella");
        this.cilindrada = 110;
    }

    public Moto(String color, int ruedas, String marca, int cilindrada){
        super(color, ruedas, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "Color => " + color + "\nCantidad de ruedas => " + cantRuedas + "\nMarca => "+ marca + "\nCilindrada: "+ cilindrada;
    }
}
//en este caso, la clase moto heredó el los metodos(constructores y toString) de la clase padre