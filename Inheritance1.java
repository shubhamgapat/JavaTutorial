

     class A                   // Super class
     {
          public void show()
          {
              System.out.println("\n CLASS A ");
          }
     }

     class B extends A          // Sub class
     {
          public void disp()
          {
              System.out.println("\n CLASS B ");
          }
     }

    public class Inheritance1
    {
         public static void main(String [] args)
         { 
              B obj = new B();
                obj.show();       
         }
    }
