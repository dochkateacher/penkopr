package com.clouway.intro.array;

import java.util.Scanner;

/**
 * Created by clouway on 15-10-6.
 */
public class Masiv {
    /**
     *
      * @param array
     * @return
     */
    public int getMinElement(int[] array) {

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    public int getSum(int[] array){
        int n;
        int s=0;

        do{
            Scanner c=new Scanner(System.in);
            n=c.nextInt();
            System.out.println("Enter n:"+n);

        }
        while(n<1||n>array.length);
        for(int i=0;i<n;i++){
            s=s+array[i];
        }
        System.out.println("Sum is:"+s);
        return s;
    }
    public void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("element masiv" + i + "-" + array[i]);


        }
    }
}
