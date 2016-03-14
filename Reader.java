package com.goit.gojavaonline;
        import java.util.*;
/**
 * Created by vasyambr on 11.03.2016.
 */
public class Reader extends AreaOfGeometricFigures {
    int a;
    int b;
    int c;
    int d;
    int e;
    int k;

    public void Scan ( ){
        System.out.println("vvedite parametri  storon triugolnika: a,b,c, a programma poschitaet ego plowad");
        System.out.println("vvedite znachenie storoni a");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        System.out.println("vvedite znachenie storoni b");
        b = scn.nextInt();
        System.out.println("vvedite znachenie storoni c");
        c = scn.nextInt();
        System.out.println("teper vichislyaem ploshad pryamougolnika,vvedite znacenie storon d,e ");
        d = scn.nextInt();e = scn.nextInt();
        System.out.println("vvedite radius kruga");
        k= scn.nextInt();


    }
}
