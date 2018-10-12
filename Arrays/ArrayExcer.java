import java.util.Arrays;
import java.util.Scanner;

public class ArrayExcer
{
   public static void main(String[] args)
   {
   Scanner console = new Scanner(System.in);
   System.out.println("How many numbers would you like to utilize?: ");
   int g = console.nextInt();
   
   
   int[] list = new int [g];
   for (int i=0; i<list.length; i++)
   {
      list[i] = console.nextInt();
   }
      int index1 = list[1];
      System.out.println(index1);
}
}   
   
  

