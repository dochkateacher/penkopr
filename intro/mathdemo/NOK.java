package com.clouway.intro.mathdemo;

import java.util.Scanner;

/**
 * Created by clouway on 15-10-5.
 */
public class NOK {

    /**
     *
      * @param a
     * @param b
     * @return
     */
    public int nok(int a, int b) {
        return a * (b / nod(a, b));
    }

    public int nod(int a, int b) {
       /* Scanner input = new Scanner(System.in);
        System.out.println("a=");
        a = input.nextInt();
        System.out.println("b=");
        b = input.nextInt();*/
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;

                return b;
            }
            /*System.out.println("NOD=" + a);*/
        }
        return a;
    }

    public double nok( double a,  double b) {
        return a + b;
    }

}
