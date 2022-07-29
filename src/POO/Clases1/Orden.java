package POO.Clases1;

public class Orden {
    private int idOrden;
    Producto productos[];
    private static int contadorOrdenes;
    private static final int MaxProductos = 10;
    private int contadorProductos; //llevaremos control de cada objeto que se agregue al array

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;//por cada object orden, se incrementa el id
        this.productos = new Producto[MaxProductos];//de lo contrario tendremos error al no inicializar el array
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MaxProductos){
            productos[contadorProductos++] = producto;
        }else{
            System.out.println("No se pueden agregar mas de 10 productos.");
        }
    }/*controlamos si no pasamos el limite de productos, agregamos el producto
    incrementando el contador de prod por cada producto agregado*/

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("id: " + this.idOrden);
        System.out.println("Cantidad de Productos: "+ contadorProductos);
        System.out.println("Productos: ");
        for (int i = 0; i < contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
        double totalOrden = this.calcularTotal();
        System.out.println("Total: $" + totalOrden);
    }
}
