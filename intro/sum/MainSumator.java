package com.clouway.intro.sum;

/**
 * Created by clouway on 15-10-12.
 */
public class MainSumator {
    public static void main(String[] args) {
        Sumator opr=new Sumator();
        System.out.println("The sum is"+opr.sum(6,4));
        System.out.println("The sum is"+opr.sum(1.3,2.4));
        /**String integer="123";
        String integer2="132";
        int number=new Integer(integer);
        int number2=new Integer(integer2);
        System.out.println("The sum is"+number);**/
        System.out.println(opr.sum("teach","live"));
        System.out.println(opr.sum("111111","333333333"));
        System.out.println("The sum is" + opr.sum(1.3,2.4 ));
    }
}
