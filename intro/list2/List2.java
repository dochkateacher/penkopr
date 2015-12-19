package com.clouway.intro.list2;

/**
 * Created with IntelliJ IDEA.
 * User: Penio
 * Date: 15-12-5
 * Time: 18:56
 * To change this template use File | Settings | File Templates.
 */
public class List2 {

    public static void main(String[] args) {
        FixedList shoppingList = new FixedList();
        try
        {

            shoppingList.add("Milk");

            shoppingList.add("Honey");

            shoppingList.add("Olives");

            shoppingList.add("Beer");

            shoppingList.add("Milk");

            /**  shoppingList.add("Honey");

             shoppingList.add("Olives");

             shoppingList.add("Beer");
             shoppingList.add("Oil");**/
            // shoppingList.add("Milk");
            //shoppingList.add("Milk");


          // shoppingList.removelast(1);
           // shoppingList.remove("Beer");

            System.out.println("We need to buy:");

            /** for (int i=0; i<shoppingList.getLength(); i++) {

             System.out.println(shoppingList.elementAt(i));

             }**/

            // shoppingList.printAll();

            shoppingList.printAll(); }
        catch (Exception ex)
        {System.out.println(ex);}



    }


}
