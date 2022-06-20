
/*
      Method with variable args...
*/

       class Abc
       {
           public void show(int ... x)
           {
               System.out.println("\n List : ");
                   for(int i=0;  i<x.length ; i++)
                   {
                      System.out.print(" "+x[i]);
                   }
                    
                       //OR

               System.out.println("\n List : ");
                    for(int a : x)   // foreach int a in x
                    {
                      System.out.print(" "+a);
                    }
           }
       }
    
    public class CO4
    {
         public static void main(String [] args)
         {
              Abc obj = new Abc();
 
                obj.show(10,20);
                obj.show();
                obj.show(11,22,33);
 
         }
    }