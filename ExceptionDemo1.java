

    public class ExceptionDemo1
    {
         public static void main(String [] args)
         { 
              int a=10, b=2, ans=0;
       
             
              try
              {
                    ans = a / b;
              }
              catch(Exception e)
              {
                   System.out.println(e);
              } 
              finally
              {
                   System.out.println("\n ans = "+ans);
              }

         }
    }
