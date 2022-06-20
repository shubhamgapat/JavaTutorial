
/*
          Static Variables

     1] They are declared using keyword static.
     2] Compiler allocates only one copy of static variable for class
        No separate copy for every object.
     3] They are class members not object members.
 
             Static Methods
 
    1] They are declared using keyword static.
    2] It can access only other static members of class.
    3] It can be called using classname.

*/
       class Abc
       {
           int x;
           static int count;

           public Abc(int a)
           {
               x = a;
               count++;
           } 
 
           public void show()
           {
                System.out.println("\n x = "+x);
                System.out.println("\n count = "+count);
           }

           public static void display()
           {   
                System.out.println("\n count = "+count);
           }
       }

    public class StaticDemo
    {
         public static void main(String [] args)
         { 
              Abc A = new Abc(10);
                  A.show();

              Abc B = new Abc(20);
                  B.show();

              Abc C = new Abc(30);
                  C.show();
       
            System.out.println("\n -------------------");
                   Abc.display();
         }
    }
