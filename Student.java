public class Student
   {
      private String name;
      private String klasse;
      private String sex;
      private double weight;
      private double height;
         
         public Student(String name, String sex, String klasse, double W, double H)
         {
         this.name = name;
         this.sex = sex;
         this.klasse = klasse;
         weight = W;
         height = H;
         
            }
            public void printStudent()
            {
            System.out.println("Student name: " + name);
            System.out.println("Gender: " + sex);
            System.out.println("Class: " + klasse);
            System.out.println("Weight: " + weight + "kg");
            System.out.println("Height: " + height + "m");
            }
   }