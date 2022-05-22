package POO.AbstractClass;

public class Principal {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro tigre = new AnimalCarnivoro();
        AnimalHerbivoro tortuga = new AnimalHerbivoro();
     
        planta.alimentarse();
        tigre.alimentarse();
        tortuga.alimentarse();


    }
}
