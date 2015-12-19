package com.clouway.intro.last;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-12-12
 * Time: 16:48
 * To change this template use File | Settings | File Templates.
 */
public class Range {

    private int l;
    private int h;

    public Range(){}
    public Range(int l, int h){
        this.l=l;
        this.h=h;
    }
    public int getL(){
        return l;
    }

    public int getH(){
        return h;
    }

    public void setL(int l){
        this.l=l;
    }

    public void setH (int h){
        this.h=h;
    }

   public void  read() throws IllegalArgumentException{
         if(l<0 || l>100 || h<0 || h>100)
         /**{
             System.out.println("ok");
         } **/

          {
             throw new IllegalArgumentException("the number is not in a range");
         }

   }

}
