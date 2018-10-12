import java.util.Arrays;

public class ArrayIntro
{
   public static void main(String[] args)
   {
      int[] tal = new int[4];
      String[] navne = new String[4];
      int[] mineTal = new int[4];
      
      //hvad initialiseres int til?
      System.out.println(tal[0]);
      System.out.println(navne[0]);
      
      //tilskriv v�rdier
      tal[0] = new student(34);
      mineTal[0] = 42;
      tal[1] = 17;
      mineTal[1] = 17;
      tal[2] = 5;
      mineTal[2] = 5;
      tal[3] = 1;
      mineTal[3] = 1;
       //l�ser v�rdier
      System.out.println(tal[0]);
      System.out.println(navne[0]);
      //check reference er ens?
      if (tal == mineTal)
      {
         System.out.println("ens");
      }
      else
      {
         System.out.println("forskellige");
      }
      //check equals
      if (Arrays.equals(tal, mineTal))
      {
         System.out.println("ens");
      }
      else
      {
         System.out.println("forskellige");
      }
      //Arrays.toString giver indholdet i stedet for memoryadressen
      System.out.println(tal);
      System.out.println(mineTal);
      System.out.println(Arrays.toString(tal) + "\n" + Arrays.toString(mineTal));
      
      //Arrays.sort sorterer et array
      Arrays.sort(tal);
      System.out.println(Arrays.toString(tal) + "\n" + Arrays.toString(mineTal));
      
      //l�kke, der g�r igennem et array i<tal.length
      //for/while
      for (int i=0;i<mineTal.length;i++)
      {
         System.out.print(mineTal[i] + " ");
      }
      //fejl
      //System.out.println(tal[4]);
      //tal = mineTal
      tal = mineTal;
      System.out.println("tal: " + tal + " " + Arrays.toString(tal));
   }

}