package POO.Clases1;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos; //para incrementar "idProducto" cada vez que se crea un objeto producto


    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }//cada vez que se crea un object, se incrementa el "id"

    public Producto(String nombre, double precio){
        this(); //se llama al constructor privado(se incrementa "id")
        this.nombre = nombre;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(this.idProducto);
        sb.append(" -Nombre: ").append(this.nombre);
        sb.append(" -Precio: $").append(this.precio);

        return sb.toString();
    }
}
