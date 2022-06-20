
     class Abc
     {
           public void div(int a, int b)throws Exception
           {
                System.out.println("\n div = "+(a/b));
           }
     } 

    public class ExceptionDemo4
    {
         public static void main(String [] args)
         { 
               Abc obj = new Abc();
 
              try
              {
                obj.div(10 , 2);
              }
              catch(Exception e)
              {}  
         }
    }
