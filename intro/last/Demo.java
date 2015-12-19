package com.clouway.intro.last;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-12-12
 * Time: 17:01
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {
      try{  Range zero = new Range(2,101);
       //zero.setH(101);
      // zero.setL(2);
        int number;
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        boolean n = (number>0 && number<100);
        if(! n==true){zero.read();}
         // System.out.println(" " + zero.getH());
      }
      catch(Exception e)
      { System.out.println(e);}
    }
}
