
     class A                   
     {
          public A(int x, int y)
          {
              System.out.println("\n CONS CLASS A ");
              System.out.println("\n x = "+x);
              System.out.println("\n y = "+y);
          }
     }

     class B extends A          
     {
          public B(int a, int b, int c, int d)
          {
                    super(c, d);
              System.out.println("\n CONS CLASS B ");
              System.out.println("\n a = "+a);
              System.out.println("\n b = "+b);
          }
     }

    public class Inheritance2
    {
         public static void main(String [] args)
         { 
              B obj = new B(10,20,30,40);
         }
    }
