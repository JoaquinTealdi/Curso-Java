package POO.ProyenctoCaja;

public class MainCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3, 2, 6);


        int calculo = caja1.calcularVolumen(caja1.ancho, caja1.alto, caja1.profundo);

        System.out.println("El volumen es:"+ calculo);


    }
}
