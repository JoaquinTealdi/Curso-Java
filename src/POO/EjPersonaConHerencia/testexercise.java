package POO.EjPersonaConHerencia;

public class testexercise {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Ramon", 'M', 25, "Jose M Paz 1454", 35000);
        Empleado emp2 = new Empleado("Lucia", 'F', 22, "Ameguino 600", 35700);
        Empleado emp3 = new Empleado("Julio", 'M', 47, "Av Alberdi 2460", 95000);
        Empleado emp4 = new Empleado("Marisa", 'F', 52, "Av 9 de Julio 1340", 130000);

        System.out.println("<< Los empleados creados son >> ");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());

    }
}
