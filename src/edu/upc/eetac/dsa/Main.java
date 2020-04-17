package edu.upc.eetac.dsa;

public class Main {

    public static void main(String[] args) {
        // poner figuras
        int i = 4;
        double totalarea = 0;
        Figure[] v = new Figure[i];
        v[0] = new Circle(7.5);
        v[1] = new rectangle(2, 3);
        v[2] = new triangle(4, 8);
        v[3] = new square(4);

        System.out.println("el area del rectangulo es: " + v[1].area());
        System.out.println("el area del triangulo es: " + v[2].area());
        System.out.println("el area del cuadrado es: " + v[3].area());

        totalarea = gestorfiguras.suma(v);
        System.out.println("La suma de superficies de todas las figuras es: " + totalarea);
        gestorfiguras.sorting(v);
        System.out.println("Ahora imprimira las figuras ordenadas: \n");
        for (Figure r: v)
        {
            System.out.println(" " + r.getClass().getSimpleName()+" "+ r.area());
        }

    }
}
