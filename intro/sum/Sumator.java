package com.clouway.intro.sum;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by clouway on 15-10-12.
 */
public class Sumator {
    public int sum(int a,int b)
    {
        return a+b;
    }
    public double sum(double a,double b)
    {
        return a+b;
    }
   public int  sum(String a, String b) {
        /*String integer;
        String integer2;
        a=integer;
        b=integer2;*/
       int number = new Integer(a);
        int number2 = new Integer(b);


       return number+ number2;
    }
  static public BigInteger sum(BigInteger a, BigInteger b)
    {
        /**a=new BigInteger("8");
        b=new BigInteger("13"); **/
        BigInteger c;
        c=a.add(b);
       // String str="Result is" +c;
        //return str;
        return c;
       //System.out.println(str);
        //return str;

       //System.out.println(a.add(b));
   }
    public BigDecimal sum(BigDecimal a, BigDecimal b)
    {
        a=a.add(b);
        return a;
    }


     /**int x=Integer.parseInt(a);
     int y=Integer.parseInt(b);**/

    }


