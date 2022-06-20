
/*
     Method Overridding - Redefining a method in a sub-class. 
*/

      class A
      {
          public void show()
          {
              System.out.println("\n CLASS A");
          }
      }

      class B extends A
      {
          public void show()
          {
              System.out.println("\n CLASS B");
                 super.show();
          }
      }

    public class MethodOverridding
    {
         public static void main(String [] args)
         { 
               B obj = new B();
               //  obj.show();
         }
    }
