package com.clouway.intro.reversearray;

/**
 * Created by clouway on 15-10-6.
 */
public class Reverse {
    public int [] reverse(int[] array){
        int n=0;
        int m=array.length-1;
        int temp;
        while(n<m){
            temp=array[n];
            array[n]=array[m];
            array[m]=temp;
            n++;
            m--;
        }
        return array;

    }

}
