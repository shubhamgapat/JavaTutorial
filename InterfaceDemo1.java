

/*
      Interfaces : Multiple Inheritance
 
     1] Declared using keyword interface.
     2] Methods of interface are by default public & abstract.          
     3] Interfaces can not be instantiated.
     4] It can not have constructors.
     5] A class can implements multiple interfaces. 
     6] Methods of interface must be overridden.
     7] An interface can extends multiple interfaces.
*/

       interface Addition
       {
           public void add(int a, int b);
       }

       interface Multiplication
       {
           public void mul(int a, int b);
       }

       interface Sample extends Addition , Multiplication
       {

       }

       class Abc implements Sample
       {
            public void add(int a, int b)
            {
                System.out.println("\n Add = "+(a+b));
            }

            public void mul(int a, int b)
            {
                System.out.println("\n Mul = "+(a*b));
            }
       }

    public class InterfaceDemo1
    {
         public static void main(String [] args)
         { 
               Abc obj = new Abc();

               Addition a = obj;
                 a.add(10, 20);   

             Multiplication m = obj;
                 m.mul(2,3); 
         }
    }
