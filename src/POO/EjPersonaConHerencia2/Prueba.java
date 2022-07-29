package POO.EjPersonaConHerencia2;

public class Prueba {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Luis",'M', 38, "Frondizi 400", true);
        Cliente c2 = new Cliente("Dora",'F', 55, "Obligado 58", true);
        Cliente c3 = new Cliente("Felipe",'M', 18, "Juan B. Justo 416", false);
        Empleado emp1 = new Empleado("Raul", 'M', 50, "Av 25 de Mayo 308", 45780);
        Empleado emp2 = new Empleado("Pedro", 'M', 53, "Av 25 de Mayo 1600", 48000);

        System.out.println("Los datos de los clientes son:");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println("Los datos de los empleados son: ");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        /*
        Otra forma de mostrar
        System.out.println("Los datos de los clientes son:" + c1);
         */













    }
}
