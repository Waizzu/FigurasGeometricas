package edu.upc.eetac.dsa;

public class triangle extends Figure {
    private double base;
    private double high;
    //le decimos que la variable radius que sea utilizada sea la propia
    public triangle(double base,double high)
    {
        this.base = base;
        this.high = high;
    }
    public double area() {
        return base*high/2;
    }

    @Override
    public int compareTo(Figure figure) {
        return 0;
    }
}
