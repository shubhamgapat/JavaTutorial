 
     import java.util.Scanner;

     class MobileException extends Exception
     {
         public MobileException(String str)
         {
              super(str);     
         }
     }  

    public class ExceptionDemo3
    {
         public static void main(String [] args)
         { 
             Scanner s = new Scanner(System.in);

           System.out.println("\n Enter mobile number: ");
             String mob = s.next();

            try
            {
                  if(mob.length() != 10)
                  {
                     throw new MobileException("Invalid Mobile Number");
                  }
            }
            catch(Exception e)
            {
                System.out.println(e);      
            }       

         }
    }
