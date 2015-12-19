package com.clouway.intro.list;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-11-30
 * Time: 16:04
 * To change this template use File | Settings | File Templates.
 */
public class List {

    public static void main(String[] args) {
       try
       { DynamicList shop = new DynamicList();

        shop.add("Milk");

        shop.add("Honey");

        shop.add("Olives");

        shop.add("Beer");

      //  shop.add("Bread");

       shop.remove(2);

        System.out.println("We need to buy:");

      /**  for(int i=0; i<shoppingList.getLength(); i++) {

            System.out.println(shoppingList.elementAt(i));

        }  **/

        shop.printAll(); }
       catch(Exception ex)
       {System.out.println(ex);}


    }
}
