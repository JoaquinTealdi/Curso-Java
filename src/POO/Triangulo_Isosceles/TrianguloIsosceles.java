package POO.Triangulo_Isosceles;

public class TrianguloIsosceles {
    private double base;
    private double lado;

    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double perimetro(){
        return 2*lado + base;
    }
    public double area(){
        double area = (base * Math.sqrt( (lado*lado)- ((base*base)/4)))/2;
        return area;
    }
    public String mostrarDatos(){
        return "base: " + this.base + "\nlado: " + this.lado + "\nperimetro: " + perimetro()+ "\narea: " + area();

    }

}
