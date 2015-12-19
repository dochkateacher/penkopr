package com.clouway.intro.sum2;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-11-26
 * Time: 18:28
 * To change this template use File | Settings | File Templates.
 */
public class Sumator2 {
    private int num1;
    private int num2;
    public int sum2(String a, String b)throws IllegalArgumentException{
        try{
            num1 = new Integer(a);
            num2 = new Integer(b);
           // return num1+num2;
           }

        catch(IllegalArgumentException ex){
            System.out.println("Error during read operation:" + ex.getMessage());
        }

        finally {
            System.out.println("You calculate:" + num1 + " + " + num2);
        }
      return num1+num2;
    }
}
