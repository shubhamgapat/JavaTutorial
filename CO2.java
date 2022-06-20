

       class Abc
       {
           public int add(int a, int b)
           {
                int c;
                c = a+b;
                return c;  
           }
       }
    

    public class CO2
    {
         public static void main(String [] args)
         {
              Abc obj = new Abc();

             int ans =  obj.add(10, 20);

              System.out.println("\n Add = "+ans);
         }
    }