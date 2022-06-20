

    public class ExceptionDemo2
    {
         public static void main(String [] args)
         { 
              int a=10, b=0, ans=0;
              int [] x = {10,20};             

              try
              {
                    ans = x[0] / b;
              }
              catch(ArithmeticException e)
              {
                   System.out.println(e);
              } 
              catch(ArrayIndexOutOfBoundsException e)
              {
                   System.out.println(e);
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
