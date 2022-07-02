package POO.ProyenctoCaja;

public class Caja {
    //atributos de la clase
    int ancho;
    int alto;
    int profundo;

    //constructor por defecto
    public Caja(){}

    //constructor con argumentos
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    //metodo que calcula el volumen
    public int calcularVolumen(int ancho, int alto, int profundo){
        int volumen = ancho * alto * profundo;
        return volumen;
    }

}
