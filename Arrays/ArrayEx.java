import java.util.Arrays;
public class ArrayEx
{
   public static void main(String[] args)
   {
      int[] list = new int [4];
      for (int i=0; i<list.length; i++)
      {
         list[i] = i;
      }
      for(int i=0; i<list.length; i++)
      {
         System.out.println(list[i]);
      }
      System.out.println(list);
      System.out.println(Arrays.toString(list));
      printArray(list);
      }
      public static void printArray(int[] myList)
      {
         System.out.println(Arrays.toString(myList));
      }
      
}