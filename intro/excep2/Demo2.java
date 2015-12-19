package com.clouway.intro.excep2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-12-6
 * Time: 18:31
 * To change this template use File | Settings | File Templates.
 */
public class Demo2 {
    public static void main(String[] args) {
        try{
        Range opr1 = new Range();
        Range opr2 = new Range();
        int number;
        Scanner s = new Scanner(System.in) ;
        System.out.println("Enter an integer:");
        number = s.nextInt();
       // boolean m = (number > 0 && number <100);
        boolean m = (number > 0 && number <100);
        if(! m == true)  {
        opr1.container(0,101);
    }
            else{opr2.container(0,99);}
        }
        catch (Exception ex){
            System.out.println(ex);}
  }
}
