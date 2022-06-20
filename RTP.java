
/*
     Run-Time Polymorphism 
 
    Object of type super-class can take memory of its sub-class instance
    But it can call only those members which are present in its super class.
*/

    class Car
    {
         public void start()
         {
            System.out.println("\n CLASS CAR ");
         }
    }

    class BMW extends Car
    {
         public void start()
         {
            System.out.println("\n BMW CAR ");
         }

         public void stop()
         {
            System.out.println("\n stop() of BMW CAR ");
         }
    }

    class AUDI extends Car
    {
         public void start()
         {
            System.out.println("\n AUDI CAR ");
         }
    }

    public class RTP
    {
         public static void main(String [] args)
         { 
              Car c;
 
              c = new BMW();  
              c.start();
              c.stop();

              c = new AUDI();
              c.start();        
         }
    }


