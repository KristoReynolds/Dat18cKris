import java.util.*;

public class ArrayMethods
{
   public static void main(String[] args)
   {
      int[] tal = new int[3];
      tal[0] = 3;
      tal[1] = 8;
      tal[2] = 2;
      int tallet = 5;
      //Swap metoden, kan kaldes med de forskellige index positioner.
       swapArray(tal, 0, 1);
      
       System.out.println(Arrays.toString(tal));

      //write array tal and tallet before we call the method.
      /*System.out.println(Arrays.toString(tal) + " tallet: " + tallet);
      System.out.println("Adresse for tal: " + tal);
      
      //Method is called, it will change the value of tal and tallet.
      skrivArray(tal, tallet); 
      
      //call the method which produces the array kalled list and tallet
      //tallet is the same as before but the array has changed.
      System.out.println(Arrays.toString(tal) + " tallet: " + tallet);*/
      
   }
      //You are creating a method to call in your main. The method below will call for an array of the type integer.
      public static void skrivArray(int[] list, int mitTal)
      {
         System.out.println(Arrays.toString(list) + " " + mitTal);
         System.out.println("Adresse for list: " + list);
         list[0] = 42;
         mitTal = 42;
         System.out.println(Arrays.toString(list));
         
      }  
      
      public static void swapArray(int[] tal, int index1, int index2)
      {
         int temp = tal[index2];
         tal[index2] = tal[index1];
         tal[index1] = temp;
        
      }

}