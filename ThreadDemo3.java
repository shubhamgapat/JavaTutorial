 
     class Pyramid
     {
         synchronized public void draw(char ch)
         {
             int i, j;

             for(i=1 ; i<=5 ; i++)
             {
                for(j=1 ; j<=i; j++)
                {
                   System.out.print(" "+ch);
                }
                   System.out.print("\n");
             }
         }
      }

    class A extends Thread
    {
          Pyramid p;

         public A(Pyramid p)
         {
             this.p = p;
         }
 
         public void run()
         {
             p.draw('*');
         }
    }

    class B extends Thread
    {
          Pyramid p;

         public B(Pyramid p)
         {
             this.p = p;
         }
 
         public void run()
         {
             p.draw('$');
         }
    }

    public class ThreadDemo3
    {
         public static void main(String [] args)
         { 
               Pyramid p = new Pyramid();
 
               A a = new A(p);
               B b = new B(p); 
  
                 a.start();
                 b.start();
         }
    }
