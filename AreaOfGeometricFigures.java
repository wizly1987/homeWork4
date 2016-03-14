package com.goit.gojavaonline;


import static java.lang.StrictMath.sqrt;
import static java.lang.StrictMath.pow;

public class AreaOfGeometricFigures  {
    public static void main(String...arg){
        double sTriangle;
        int p;
        int sRectangle;
        double pi=3.14 ;
        double sRaund;

  Reader r = new Reader();


       r.Scan();
        sRaund= pow(r.k,2)*pi;
        sRectangle = r.d*r.e;
        p = ( r.a + r.b  + r.c );
        sTriangle = sqrt(p*(p-r.a)*(p-r.b)*(p-r.c));
        System.out.println( sTriangle +" - sm 2 ploshad vashego triugolnika");
        System.out.println(sRectangle +" - sm2  ploshad vashego pryamougolnika");
        System.out.println(sRaund +" - sm2  ploshad vashego Kruga");


    }



}
