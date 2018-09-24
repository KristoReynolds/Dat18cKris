public class BMI
{
   private double weight =0.0;
   private double height =0.0;
   private double BMI;   
   
   public BMI(double height, double weight)
   {
   this.height = height;
   this.weight = weight;
   }
      public void printBMI()
      {
      BMI = (this.weight / this.height) / this.height;
      System.out.println("BMI: " + BMI);
      if (BMI<18.5)
      { 
      System.out.println("You are under weight, go eat McDonalds");
      }
      else if (BMI>=18.5 && BMI<= 25)
      {
      System.out.println("Your weight is normal");
      }
      else if (BMI>=25 && BMI<= 30)
      {
      System.out.println("You are over weight get to work!");
      }
      else
      {
      System.out.println("YOU FAT CUNT");
      }  
      }
   
   

}
