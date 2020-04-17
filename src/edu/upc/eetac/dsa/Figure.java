package edu.upc.eetac.dsa;


public abstract class Figure implements Comparable<Figure> {
    public abstract double area();

    public int compareTo(Figure z)
     {
         int res=0;
         res=(int)(this.area()- z.area())*-1;
         return res;
     }

}

