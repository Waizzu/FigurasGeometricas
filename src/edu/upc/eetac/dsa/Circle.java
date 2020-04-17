package edu.upc.eetac.dsa;

public class Circle extends Figure{
    //declaramos el radio
    private double radius;
    //le decimos que la variable radius que sea utilizada sea la propia
    public Circle (double radius)
    {
        this.radius = radius;
    }
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public int compareTo(Figure figure) {
        return 0;
    }
}
