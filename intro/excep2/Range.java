package com.clouway.intro.excep2;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-12-6
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
public class Range {

    public void container(int low, int high) throws IllegalArgumentException{
        boolean n = (low ==0 && high > 0 && high < 100);
        if (!n == true) {

            throw new IllegalArgumentException("the number is not in range please try again" );
        }
       // return n;
        else
        {
            System.out.println("the number is in the range");
    }

    }
}
