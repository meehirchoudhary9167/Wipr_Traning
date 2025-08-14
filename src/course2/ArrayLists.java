package course2;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists{
    public static void main (String[] args){


        //how to create ArrayList
        ArrayList<String> fruits=new ArrayList();


        //how to add value to ArrayList
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("banana");
        fruits.add("mango");
        System.out.println(fruits);


        // how to access item in ArrayList
        System.out.println(fruits.get(1)); //get Method
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(3));

        //how to change an element in ArrayList
        fruits.set(1,"Grape"); //set Method 
        System.out.println(fruits);

        //how to remove element from ArrayLis
        fruits.remove(2);
        System.out.println(fruits);

       
        //how to find element in  ArrayList
        System.out.println(fruits.size());

        //how to loop through ArrayList
        //for loop
        for(int i =0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }
        //for each loop
        for(String i:fruits){
            System.out.println(i);
        }

        //how to sort ArrayList
         
         Collections.sort(fruits); 
         System.out.println("Sorted Fruits: " + fruits);// you have to import collection library import java.util.collection
         
         //how to remove all element from ArrayList
         fruits.clear();
         System.out.println(fruits);

    }
}
