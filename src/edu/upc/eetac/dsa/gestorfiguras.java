package edu.upc.eetac.dsa;

import java.util.Arrays;
public class gestorfiguras {

    public static double suma(Figure[] s)
    {
        int i=0;
        double suma=0;
                while( i<4)
                {
                    suma= s[i].area() + suma;
                    i++;
                }
        return suma;
    }
    public static void sorting(Figure[] r)
    {
        Arrays.sort(r);
    }

}
