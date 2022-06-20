
          import java.util.Scanner;   
 
      class Student
      {
           String name;
           int rollno;

           public void getDetails()
           {
               Scanner s = new Scanner(System.in);

               System.out.println("\n Enter Name : ");
                 name = s.nextLine(); 

               System.out.println("\n Enter Rollno : ");
                  rollno = s.nextInt();
           }

           public void printDetails()
           {
               System.out.println("\n Name = "+name);
               System.out.println("\n Rollno = "+rollno);
           }
      }


    public class CO5
    {
         public static void main(String [] args)
         {
              Student s1 = new Student();
                 s1.getDetails();
                 s1.printDetails();

              Student s2 = new Student();
                 s2.getDetails();
                 s2.printDetails();     
         }
    }
