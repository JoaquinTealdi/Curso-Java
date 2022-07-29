package POO.Clases1;

public class VentasTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("Coca Cola", 20);
        Producto p2 = new Producto("Desodorante", 50);
        Producto p3 = new Producto("Plato", 100);
        Producto p4 = new Producto("Yerba", 85);

        Orden Ord1 = new Orden();
        Ord1.agregarProducto(p1);
        Ord1.agregarProducto(p2);
        Ord1.agregarProducto(p3);
        Ord1.agregarProducto(p4);
        System.out.println("El contenido de la orden es");
        Ord1.mostrarOrden();


    }
}
