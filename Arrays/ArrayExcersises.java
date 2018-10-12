import java.util.Arrays;
import java.util.Scanner;

public class ArrayExcersises
{
   public static void main(String[] args)
   {
   Scanner console = new Scanner(System.in);
   System.out.println("How many numbers would you like to utilize?: ");
   int g = console.nextInt();
  
   
   double gennemsnit = 0.0;
   double sum = 0.0;
   
   double[] list = new double [g];
   for (int i=0; i<list.length; i++)
   {
      list[i] = console.nextDouble();
   }
   for (int i=0; i<list.length; i++)
   {
      sum += list[i];  
   }
   System.out.println(sum);
   System.out.println(gennemsnit = sum/list.length); 
   }
}