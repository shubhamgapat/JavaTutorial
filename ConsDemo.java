
/*
          Constructor

   1] It is a special method with same name as class-name.
   2] It has no return type not even void.
   3] When we create an object of class constructor gets called. 
   4] It allocates memory for an object.
   5] It is used to asign initial values to data members.

   **If there is no construtor in class compiler will provide one default constructor  
 
*/
       class Abc
       {
             int a,b;        

            public Abc()   // Default Cons
            {
                a = 10;
                b = 20; 
            }

            public Abc(int x, int y)    // Param Cons
            {
                a = x;
                b = y; 
            }

            public void show()
            {
                System.out.println("\n a = "+a);
                System.out.println("\n b = "+b);
            }

            public void finalize()
            {
                System.out.println("\n finalize() is called...");
            }
       }

    public class ConsDemo
    {
         public static void main(String [] args)
         {
               Abc obj = new Abc();
                   obj.show();

               Abc obj2 = new Abc(11,22);
                   obj2.show();

               Abc obj3 = new Abc(100,200);
                   obj3.show();

                   obj = null;
                   obj2 = null;
                   obj3 = null;
 
                 System.gc();

              try
              {
                  Thread.sleep(1000);
              }
              catch(Exception e)
              {}
         }
    }
