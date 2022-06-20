
/*
     interface Runnable
     {
         public void run();
     } 

     public class Thread implements Runnable
     {
         public void run()
         {
         }
          
          public void start()
          {
              ---------------
              ------------- ---
              --------------
               this.run();
          }   

          public void stop()
              sleep();
     }

*/



   class A extends Thread
   {
        public void run()
        {              
             for(int i=1 ; i<=100; i++)
             {
                   System.out.println("\n i = "+i);
             }
        }
   }
 
   class B extends Thread
   {
        public void run()
        {              
             for(int j=1 ; j<=100; j++)
             {
                   System.out.println("\n j = "+j);
             }
        }
   }

    public class ThreadDemo1
    {
         public static void main(String [] args)
         { 
              A a = new A();
              B b = new B();

                 a.run();
                 b.run();   
         }
    }
