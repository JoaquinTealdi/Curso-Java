package POO.AbstractClass;

public class Planta extends SerVivo{

    //en las clases hijas el metodo se hereda, se lo tiene que ocupar si o si y se lo desarrolla
    @Override
    public void alimentarse() {
        System.out.println("Las plantas se alimentan de la fotosintesis");
    }
}
