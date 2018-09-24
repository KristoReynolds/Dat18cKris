public class School
{
   public static void main (String[] args)
   {
      Student student1 = new Student("Kristoffer Reynolds", "Male", "Dat18c", 82.5, 1.80);
      student1.printStudent();
      BMI BMI1 = new BMI(1.80, 82.5);
      BMI1.printBMI();
      System.out.println();
      
      Student student2 = new Student("Nicklas List", "Male", "Dat18c", 70.5, 1.79);
      student2.printStudent();
      System.out.println();
      
      Student student3 = new Student("Marcus Bender", "Male", "Dat18c", 70.5, 1.86);
      student3.printStudent();
   }
}