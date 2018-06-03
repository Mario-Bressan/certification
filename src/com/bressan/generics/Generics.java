package com.bressan.generics;

/**
 *
 * @author Mario
 */
public class Generics {

    public static void main(String[] args) {

        Integer inums[] = {1, 2, 3, 4, 5};
        Statistics<Integer> iobj = new Statistics<>(inums);
        double v = iobj.average();
        System.out.println("iobj average is " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Statistics<Double> dobj = new Statistics<>(dnums);
        double w = dobj.average();
        System.out.println("dobj average is " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Statistics<Float> fobj = new Statistics<>(fnums);
        double x = fobj.average();
        System.out.println("fobj average is " + x);

        System.out.println("Averages of iobj and dobj");
        if(iobj.sameAverage(dobj))
            System.out.println("Are the same");
        else
            System.out.println("differ");

        System.out.println("Averages of iob and fobj");
        if(iobj.sameAverage(fobj))
            System.out.println("Are the same");
        else
            System.out.println("differ");

    }
}
