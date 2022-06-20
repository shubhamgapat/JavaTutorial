
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



   class A implements Runnable
   {
        public void run()
        {              
             for(int i=1 ; i<=100; i++)
             {
                   System.out.println("\n i = "+i);
 
                try 
                {
                   if(i >= 50)
                   {
                       Thread.sleep(1000);
                   }
                }
                catch(Exception e)
                {}
             }
        }
   }
 
   class B implements Runnable
   {
        public void run()
        {              
             for(int j=1 ; j<=100; j++)
             {
                   System.out.println("\n j = "+j);
             }
        }
   }

    public class ThreadDemo2
    {
         public static void main(String [] args)
         { 
              A a = new A();
              B b = new B();
 
             Thread t1 = new Thread(a);
             Thread t2 = new Thread(b);

             //   t1.setPriority(Thread.MAX_PRIORITY);
             //   t1.setPriority(Thread.MIN_PRIORITY);

                 t1.start();
                 t2.start();   
         }
    }
